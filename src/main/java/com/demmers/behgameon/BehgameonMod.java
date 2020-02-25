package com.demmers.behgameon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.demmers.behgameon.config.Config;
import com.demmers.behgameon.util.LootHandler;
import com.demmers.behgameon.util.MineSlashHandler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import top.theillusivec4.curios.api.CuriosAPI;
import top.theillusivec4.curios.api.imc.CurioIMCMessage;

@Mod(BehgameonMod.MODID)
public class BehgameonMod {

	public static BehgameonMod instance;
	public static final String MODID = "behgameon";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public BehgameonMod() {
		instance = this;
		ModLoadingContext modLoadingContext = ModLoadingContext.get();
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::enqueueIMC);
		modLoadingContext.registerConfig(ModConfig.Type.SERVER, Config.SERVER_SPEC, "behgameon-config.toml");
		Config.loadConfig(Config.SERVER_SPEC, FMLPaths.CONFIGDIR.get().resolve("behgameon-config.toml").toString());
	}

	private void setup(final FMLCommonSetupEvent event) {
		if (Config.SERVER.USE_CHESTLOOTSYSTEM.get()) {
			MinecraftForge.EVENT_BUS.register(new LootHandler());
		}
	}

	private void enqueueIMC(final InterModEnqueueEvent event) {
		// If Curios is installed, then it will link the items to curios slots
		if (ModList.get().isLoaded("curios")) {
			InterModComms.sendTo("curios", CuriosAPI.IMC.REGISTER_TYPE, () -> new CurioIMCMessage("charm"));
			InterModComms.sendTo("curios", CuriosAPI.IMC.REGISTER_TYPE, () -> new CurioIMCMessage("necklace"));
			InterModComms.sendTo("curios", CuriosAPI.IMC.REGISTER_TYPE, () -> new CurioIMCMessage("bracelet"));
			InterModComms.sendTo("curios", CuriosAPI.IMC.REGISTER_TYPE, () -> new CurioIMCMessage("belt"));
			InterModComms.sendTo("curios", CuriosAPI.IMC.REGISTER_TYPE, () -> new CurioIMCMessage("ring").setSize(2));
		}
		if (ModList.get().isLoaded("mmorpg") && Config.SERVER.USE_COMPATIBILITY_ON_ITEMS.get()) {
			MinecraftForge.EVENT_BUS.register(new MineSlashHandler());
		}
	}
}
