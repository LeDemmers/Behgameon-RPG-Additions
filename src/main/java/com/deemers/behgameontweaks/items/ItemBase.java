package com.deemers.behgameontweaks.items;

import com.deemers.behgameontweaks.BehgameonTweaks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemBase extends Item {

	public ItemBase(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(BehgameonTweaks.MODID, name));
		this.setCreativeTab(BehgameonTweaks.TAB);
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}

}