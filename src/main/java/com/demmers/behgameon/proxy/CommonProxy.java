package com.demmers.behgameon.proxy;

import com.demmers.behgameon.init.ModItems;
import com.demmers.behgameon.BehgameonMod;

import net.minecraft.item.Item;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class CommonProxy {
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
				item.getSubItems(BehgameonMod.TAB, ModItems.variantList);
			}
		}
	}
}
