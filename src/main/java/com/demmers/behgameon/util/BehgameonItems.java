package com.demmers.behgameon.util;

import com.demmers.behgameon.BehgameonMod;
import com.demmers.behgameon.items.BaublesItem;

import baubles.api.BaubleType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShield;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public final class BehgameonItems {

	public static Item accessory;
	public static Item shield;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		// Creates the belts
		for (int i = 1; i <= 3; i++)
			event.getRegistry().registerAll(
					accessory = new BaublesItem("accessory_" + i, BaubleType.BELT).setCreativeTab(BehgameonTab.ACCESSORIES).setMaxStackSize(1));
		// Creates the Necklaces
		for (int i = 4; i <= 8; i++)
			event.getRegistry()
					.registerAll(new BaublesItem("accessory_" + i, BaubleType.AMULET).setCreativeTab(BehgameonTab.ACCESSORIES).setMaxStackSize(1));
		// Creates the Bracelets
		for (int i = 9; i <= 20; i++)
			event.getRegistry()
					.registerAll(new BaublesItem("accessory_" + i, BaubleType.BELT).setCreativeTab(BehgameonTab.ACCESSORIES).setMaxStackSize(1));
		// Creates the Amulets/Necklaces
		for (int i = 21; i <= 32; i++)
			event.getRegistry()
					.registerAll(new BaublesItem("accessory_" + i, BaubleType.AMULET).setCreativeTab(BehgameonTab.ACCESSORIES).setMaxStackSize(1));
		// Creates the Charms
		for (int i = 33; i <= 44; i++)
			event.getRegistry()
					.registerAll(new BaublesItem("accessory_" + i, BaubleType.CHARM).setCreativeTab(BehgameonTab.ACCESSORIES).setMaxStackSize(1));
		// Creates the Unique Charms
		for (int i = 45; i <= 48; i++)
			event.getRegistry()
					.registerAll(new BaublesItem("accessory_" + i, BaubleType.CHARM).setCreativeTab(BehgameonTab.ACCESSORIES).setMaxStackSize(1));
		// Creates the Unique Amulet
		for (int i = 49; i <= 54; i++)
			event.getRegistry()
					.registerAll(new BaublesItem("accessory_" + i, BaubleType.AMULET).setCreativeTab(BehgameonTab.ACCESSORIES).setMaxStackSize(1));
		// Creates the Unique Charms
		for (int i = 55; i <= 56; i++)
			event.getRegistry()
					.registerAll(new BaublesItem("accessory_" + i, BaubleType.CHARM).setCreativeTab(BehgameonTab.ACCESSORIES).setMaxStackSize(1));
		for (int i = 1; i <= 106; i++)
			event.getRegistry().register(new BaublesItem("ring_" + i, BaubleType.RING).setCreativeTab(BehgameonTab.ACCESSORIES).setMaxStackSize(1));
		for (int i = 1; i <= 15; i++)
			event.getRegistry().register(shield = new ItemShield().setRegistryName("shield" + i)
					.setTranslationKey("shield" + i).setCreativeTab(BehgameonTab.WEAPONS).setMaxStackSize(1));
		BehgameonMod.LOGGER.info("All Items registered.");
	}

	public static ResourceLocation location(String name) {
		return new ResourceLocation(BehgameonMod.MODID, name);
	}

}