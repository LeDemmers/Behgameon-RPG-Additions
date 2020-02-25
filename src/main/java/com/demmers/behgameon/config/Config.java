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
			builder.push("general");
			USE_COMPATIBILITY_ON_ITEMS = builder.comment("Mine and Slash Compatibility")
					.translation(BehgameonMod.MODID + ".config.use_compatibility_on_items")
					.define("USE_COMPATIBILITY_ON_ITEMS", true);
			USE_CHESTLOOTSYSTEM = builder.comment("Add loot to Chest loot system")
					.translation(BehgameonMod.MODID + ".config.use_chestlootsystem")
					.define("USE_CHESTLOOTSYSTEM", true);
			USE_MINESLASHLOOTSYSTEM = builder.comment("Add loot to Mine and Slash Loot System")
					.translation(BehgameonMod.MODID + ".config.use_mineslashlootsystem")
					.define("USE_MINESLASHLOOTSYSTEM", true);
			builder.pop();
			builder.push("gear");
			ACCESSORY_MAXDAMAGE = builder.comment("Staff Max Damage")
					.translation(BehgameonMod.MODID + ".config.staff_maxdamage").define("ACCESSORY_MAXDAMAGE", 1000);
			RING_MAXDAMAGE = builder.comment("Sword Max Damage")
					.translation(BehgameonMod.MODID + ".config.sword_maxdamage").define("RING_MAXDAMAGE", 1000);
			SHIELD_MAXDAMAGE = builder.comment("Bow SHIELD_MAXDAMAGE Damage")
					.translation(BehgameonMod.MODID + ".config.bow_maxdamage").define("SHIELD_MAXDAMAGE", 1000);
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