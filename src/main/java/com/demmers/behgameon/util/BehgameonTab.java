package com.demmers.behgameon.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BehgameonTab {

	public static final CreativeTabs ACCESSORIES = (new CreativeTabs("accessories") {
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(BehgameonItems.accessory);
		}
	});

	public static final CreativeTabs WEAPONS = (new CreativeTabs("weapons") {
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(BehgameonItems.shield);
		}
	});

}