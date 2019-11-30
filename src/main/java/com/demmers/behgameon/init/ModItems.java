package com.demmers.behgameon.init;

import java.util.ArrayList;
import java.util.List;

import com.demmers.behgameon.items.BaublesBeltItem;
import com.demmers.behgameon.items.BaublesCharmItem;
import com.demmers.behgameon.items.BaublesNecklaceItem;
import com.demmers.behgameon.items.BaublesRingItem;
import com.demmers.behgameon.BehgameonMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(BehgameonMod.MODID)
public final class ModItems {
	public static Item[] itemList;
	public static NonNullList<ItemStack> variantList;
	static {
		List<Item> items = new ArrayList<Item>();
		for (int i = 1; i <= 3; i++)
			items.add(new BaublesBeltItem("accessory_" + i));
		BehgameonMod.LOGGER.info("Registered Belts");
		for (int i = 4; i <= 8; i++)
			items.add(new BaublesNecklaceItem("accessory_" + i));
		BehgameonMod.LOGGER.info("Registered Necklaces");
		for (int i = 9; i <= 20; i++)
			items.add(new BaublesBeltItem("accessory_" + i));
		BehgameonMod.LOGGER.info("Registered Braclets");
		for (int i = 21; i <= 32; i++)
			items.add(new BaublesNecklaceItem("accessory_" + i));
		BehgameonMod.LOGGER.info("Registered Amulets");
		for (int i = 33; i <= 48; i++)
			items.add(new BaublesCharmItem("accessory_" + i));
		BehgameonMod.LOGGER.info("Registered Charms");
		for (int i = 49; i <= 54; i++)
			items.add(new BaublesNecklaceItem("accessory_" + i));
		BehgameonMod.LOGGER.info("Registered Unique Amulets");
		for (int i = 55; i <= 56; i++)
			items.add(new BaublesCharmItem("accessory_" + i));
		BehgameonMod.LOGGER.info("Registered Unique Charms");
		for (int i = 1; i <= 106; i++)
			items.add(new BaublesRingItem("ring_" + i));
		BehgameonMod.LOGGER.info("Registered rings");
		itemList = items.toArray(new Item[items.size()]);
	}

}