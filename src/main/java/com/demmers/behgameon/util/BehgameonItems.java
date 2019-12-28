package com.demmers.behgameon.util;

import com.demmers.behgameon.BehgameonMod;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BehgameonItems {

	public static Item accessory_1;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		for (int i = 1; i <= 56; i++)
			event.getRegistry()
					.registerAll(accessory_1 = new Item(new Item.Properties().group(BehgameonTabs.TabItemGroup))
							.setRegistryName(location("accessory_" + i)));
		for (int i = 1; i <= 106; i++)
			event.getRegistry().register(new Item(new Item.Properties().group(BehgameonTabs.TabItemGroup))
					.setRegistryName(location("ring_" + i)));
		BehgameonMod.LOGGER.info("All Items registered.");
	}

	public static ResourceLocation location(String name) {
		return new ResourceLocation(BehgameonMod.MODID, name);
	}
}