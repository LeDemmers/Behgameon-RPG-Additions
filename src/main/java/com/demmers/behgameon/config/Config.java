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
		public final BooleanValue USE_CHESTLOOTSYSTEM;
		public ConfigValue<Integer> ACCESSORY_MAXDAMAGE;
		public ConfigValue<Integer> RING_MAXDAMAGE;
		public ConfigValue<Integer> SHIELD_MAXDAMAGE;

		ServerConfig(ForgeConfigSpec.Builder builder) {
			builder.push("general");
			USE_CHESTLOOTSYSTEM = builder.comment("Add loot to Chest loot system")
					.translation(BehgameonMod.MODID + ".config.use_chestlootsystem")
					.define("USE_CHESTLOOTSYSTEM", true);
			builder.pop();
			builder.push("gear");
			ACCESSORY_MAXDAMAGE = builder.comment("Accessory Max Damage")
					.translation(BehgameonMod.MODID + ".config.accessory_maxdamage")
					.define("ACCESSORY_MAXDAMAGE", 1000);
			RING_MAXDAMAGE = builder.comment("Ring Max Damage")
					.translation(BehgameonMod.MODID + ".config.ring_maxdamage").define("RING_MAXDAMAGE", 1000);
			SHIELD_MAXDAMAGE = builder.comment("Shield Damage")
					.translation(BehgameonMod.MODID + ".config.shild_maxdamage").define("SHIELD_MAXDAMAGE", 1000);
			builder.pop();
		}
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave()
				.writingMode(WritingMode.REPLACE).build();
		file.load();
		config.setConfig(file);
	}
}