package com.demmers.behgameon.util;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BehgameonTabs {

	public static final ItemGroup AccessoriesTabItemGroup = (new ItemGroup("accessories") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(BehgameonItems.ACCESSORY_1.get());
		}
	});
	public static final ItemGroup WeaponTabItemGroup = (new ItemGroup("weapons") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(BehgameonItems.SHIELD_1.get());
		}
	});
}