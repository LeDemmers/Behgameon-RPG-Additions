package com.demmers.behgameon.items;

import com.demmers.behgameon.BehgameonMod;
import com.demmers.behgameon.util.BehgameonTab;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemBase extends Item {

	public ItemBase(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(BehgameonMod.MODID, name));
		this.setCreativeTab(BehgameonTab.ACCESSORIES);
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}

}