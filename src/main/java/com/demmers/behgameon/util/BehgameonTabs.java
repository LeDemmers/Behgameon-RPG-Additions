package com.demmers.behgameon.util;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BehgameonTabs {

	public static final ItemGroup TabItemGroup = (new ItemGroup("behgameon") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(BehgameonItems.accessory_1);
		}
	});
}