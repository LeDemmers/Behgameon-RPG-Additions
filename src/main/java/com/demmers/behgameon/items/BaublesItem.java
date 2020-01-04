package com.demmers.behgameon.items;

import com.demmers.behgameon.BehgameonMod;
import com.demmers.behgameon.util.BehgameonTab;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class BaublesItem extends Item implements IBauble {

	public BaubleType type;

	public BaublesItem(String name, BaubleType type) {
		super();
		this.type = type;
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(BehgameonMod.MODID, name));
		this.setCreativeTab(BehgameonTab.ACCESSORIES);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return this.type;
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}

}