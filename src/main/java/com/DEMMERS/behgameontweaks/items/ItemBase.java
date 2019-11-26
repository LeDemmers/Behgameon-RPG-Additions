package com.DEMMERS.behgameontweaks.items;

import com.DEMMERS.behgameontweaks.Main;
import com.DEMMERS.behgameontweaks.init.ModItemsOLD;
import com.DEMMERS.behgameontweaks.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItemsOLD.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
