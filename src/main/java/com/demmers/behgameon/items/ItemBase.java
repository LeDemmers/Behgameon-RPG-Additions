package com.demmers.behgameon.items;

import com.demmers.behgameon.BehgameonMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemBase extends Item {

	public ItemBase(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(BehgameonMod.MODID, name));
		this.setCreativeTab(BehgameonMod.TAB);
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}

}