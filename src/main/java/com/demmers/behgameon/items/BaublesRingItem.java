package com.demmers.behgameon.items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.item.ItemStack;

public class BaublesRingItem extends ItemBase implements IBauble {

	public BaublesRingItem(String name) {
		super(name);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}

}