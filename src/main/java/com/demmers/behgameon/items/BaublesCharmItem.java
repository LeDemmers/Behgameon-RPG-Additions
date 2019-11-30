package com.demmers.behgameon.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.item.ItemStack;

public class BaublesCharmItem extends ItemBase implements IBauble {

	public BaublesCharmItem(String name) {
		super(name);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.CHARM;
	}

}