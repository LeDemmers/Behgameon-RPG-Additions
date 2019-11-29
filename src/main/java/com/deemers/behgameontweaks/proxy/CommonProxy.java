package com.deemers.behgameontweaks.proxy;

import com.deemers.behgameontweaks.init.ModItems;
import com.deemers.behgameontweaks.BehgameonTweaks;

import net.minecraft.item.Item;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class CommonProxy 
{
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> e) {
			IForgeRegistry<Item> registry = e.getRegistry();

			for (Item item : ModItems.itemList) {
				registry.register(item);
			}

			ModItems.variantList = NonNullList.create();
			for (Item item : ModItems.itemList) {
				item.getSubItems(BehgameonTweaks.TAB, ModItems.variantList);
			}
		}
	}
}
