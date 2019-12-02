package com.demmers.behgameon.init;

import com.demmers.behgameon.BehgameonMod;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class Tab extends CreativeTabs {

	private int nextTicks;

	private ItemStack stack;
	private int index;

	public Tab(String label) {
		super(label);
	}

	//Sets the tab name. itemGroup.behgameon
	public String getTranslatedTabLabel() {
		return "tab." + BehgameonMod.MODID;
	}

	@Override
	public ItemStack getIcon() {
		//This changes the tab icon based on your variantList aka all your items.
		int ticks = Minecraft.getMinecraft().ingameGUI.getUpdateCounter();
		if (ticks >= this.nextTicks) {
			this.nextTicks = ticks + 8;
			if (++this.index >= ModItems.variantList.size())
				this.index = 0;

			this.stack = ModItems.variantList.get(this.index);
		}
		//Gives the tab a search bar.
		setBackgroundImageName("item_search.png");

		return this.createIcon();
	}

	@Override
	public ItemStack createIcon() {
		return this.stack;
	}

	//Gives the tab a search bar function.
	@Override
	public boolean hasSearchBar() {
		return true;
	}
}