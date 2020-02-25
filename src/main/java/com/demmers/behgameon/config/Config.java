package com.demmers.behgameon.config;

import java.io.File;

import org.apache.commons.lang3.tuple.Pair;

import com.demmers.behgameon.BehgameonMod;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class Config {

	public static final ServerConfig SERVER;
	public static final ForgeConfigSpec SERVER_SPEC;

	static {
		final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
		SERVER_SPEC = specPair.getRight();
		SERVER = specPair.getLeft();
	}

	public static class ServerConfig {
		public final BooleanValue USE_COMPATIBILITY_ON_ITEMS;
		public final BooleanValue USE_CHESTLOOTSYSTEM;
		public final BooleanValue USE_MINESLASHLOOTSYSTEM;
		public ConfigValue<Integer> ACCESSORY_MAXDAMAGE;
		public ConfigValue<Integer> RING_MAXDAMAGE;
		public ConfigValue<Integer> SHIELD_MAXDAMAGE;

		ServerConfig(ForgeConfigSpec.Builder builder) {
			builder.comment("Mine and Slash Compatibility").push("Mine and Slash Compatibility")
					.translation("behgameon.config.use_compatibility_on_items");
			USE_COMPATIBILITY_ON_ITEMS = builder.define("Enable", true);
			builder.comment("Chest Loot Setting").push("Chest Loot Setting")
					.translation("behgameon.config.use_chestlootsystem");
			USE_CHESTLOOTSYSTEM = builder.define("Enable", true);
			builder.comment("Mine and Slash Loot Setting").push("Mine and Slash Loot Setting")
					.translation("behgameon.config.use_mineslashlootsystem");
			USE_MINESLASHLOOTSYSTEM = builder.define("Enable", true);
			builder.comment("Sets the max duriabily of Accessories").push("Sets the max duriabily of Accessories.")
					.translation("behgameon.config.accessory_maxdamage");
			ACCESSORY_MAXDAMAGE = builder.define("ACCESSORY_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Rings.").push("Sets the max duriabily of Rings.")
					.translation("behgameon.config.ring_maxdamage");
			RING_MAXDAMAGE = builder.define("RING_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Shields.").push("Sets the max duriabily of Shields.")
					.translation("behgameon.config.shields_maxdamage");
			SHIELD_MAXDAMAGE = builder.define("SHIELD_MAXDAMAGE", 1000);
			builder.pop();
		}
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		BehgameonMod.LOGGER.info("Loading config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave()
				.writingMode(WritingMode.REPLACE).build();
		BehgameonMod.LOGGER.info("Built config: " + path);
		file.load();
		BehgameonMod.LOGGER.info("Loaded config: " + path);
		config.setConfig(file);
	}
}