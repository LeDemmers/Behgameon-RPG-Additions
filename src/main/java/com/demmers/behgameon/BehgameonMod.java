package com.demmers.behgameon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.demmers.behgameon.init.ModConfig;
import com.demmers.behgameon.util.LootHandler;
import com.demmers.behgameon.util.MineSlashHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BehgameonMod.MODID, name = BehgameonMod.NAME, version = BehgameonMod.VERSION, dependencies = BehgameonMod.DEPENDENCIES)
public class BehgameonMod {

	// Mod ID, never change as it will break old saves.
	public static final String MODID = "behgameon";
	// Mod name
	public static final String NAME = "Behgameon";
	// Verison number using SymVer MAJOR.MINOR.PATCH.
	public static final String VERSION = "1.0.5";
	// So no one tries to run this on 1.7.10
	public static final String ACCEPTED_VERSIONS = "(1.12.2)";
	// Makes the mod require that is loaded after baubles and mine and slash
	public static final String DEPENDENCIES = "required:baubles";
	// Creates a logger for logging things in the log for other classes.
	public static final Logger LOGGER = LogManager.getLogger();

	@Instance
	public static BehgameonMod instance;

	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {

	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		// This adds our loot tables defined in LootHandler and placed in
		// resources/assets/behgameon/loot_tables/inject
		// main_loot is the master loot table, which is called in the tables.
		MinecraftForge.EVENT_BUS.register(new LootHandler());
	}

	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		// Loader checks to see if Mine and Slash is loaded and if it is, checks the
		// config setting to enable auto Mine and Slash stats.
		if (Loader.isModLoaded("mmorpg") && ModConfig.USE_COMPATIBILITY) {
			MinecraftForge.EVENT_BUS.register(new MineSlashHandler());
		}
	}

}
