package com.demmers.behgameon;

import com.demmers.behgameon.proxy.CommonProxy;
import com.demmers.behgameon.util.MineSlashHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.demmers.behgameon.init.ModConfig;
import com.demmers.behgameon.init.ModItems;
import com.demmers.behgameon.init.Tab;

@Mod(modid = BehgameonMod.MODID, name = BehgameonMod.NAME, version = BehgameonMod.VERSION, dependencies = BehgameonMod.DEPENDENCIES)
public class BehgameonMod {

	public static final String MODID = "behgameon";
	public static final String NAME = "Behgameon";
	public static final String VERSION = "1.0.1";
	public static final String ACCEPTED_VERSIONS = "(1.12.2)";
	public static final String DEPENDENCIES = "required:baubles;required-after:mmorpg";
	public static final Logger LOGGER = LogManager.getLogger();

	public static CreativeTabs TAB = new Tab(MODID);

	@Instance
	public static BehgameonMod instance;

	@SidedProxy(clientSide = "com.demmers.behgameon.proxy.ClientProxy", serverSide = "com.demmers.behgameon.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {

	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		if (Loader.isModLoaded("mmorpg") && ModConfig.USE_COMPATIBILITY) {
			MinecraftForge.EVENT_BUS.register(new MineSlashHandler());
		}
	}

}
