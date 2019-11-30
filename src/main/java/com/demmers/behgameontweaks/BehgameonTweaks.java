package com.deemers.behgameontweaks;

import com.deemers.behgameontweaks.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.deemers.behgameontweaks.init.ModItems;
import com.deemers.behgameontweaks.init.Tab;

@Mod(modid = BehgameonTweaks.MODID, name = BehgameonTweaks.NAME, version = BehgameonTweaks.VERSION)
public class BehgameonTweaks {

	public static final String MODID = "behgameon";
	public static final String NAME = "Behgameon Tweaks";
	public static final String VERSION = "1.1a";
	public static final String ACCEPTED_VERSIONS = "(1.12.2)";
	public static final Logger LOGGER = LogManager.getLogger();
	
	public static CreativeTabs TAB = new Tab(MODID);
	
	@Instance
	public static BehgameonTweaks instance;
	
	@SidedProxy(clientSide = "com.deemers.behgameontweaks.proxy.ClientProxy", serverSide = "com.deemers.behgameontweaks.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}

}
