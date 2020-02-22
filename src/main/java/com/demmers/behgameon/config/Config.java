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

	public static final String NAME = "COMPATIBILITY";
	public static final ForgeConfigSpec spec;
	public static final Config INSTANCE;

	static {
		final Pair<Config, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Config::new);
		spec = specPair.getRight();
		INSTANCE = specPair.getLeft();
	}

	public BooleanValue USE_COMPATIBILITY_ON_ITEMS;
	public ConfigValue<Integer> ACCESSORY_MAXDAMAGE;
	public ConfigValue<Integer> RING_MAXDAMAGE;
	public ConfigValue<Integer> SHIELD_MAXDAMAGE;

	Config(ForgeConfigSpec.Builder builder) {
		builder.comment("Compatibility Settings").push(NAME);

		USE_COMPATIBILITY_ON_ITEMS = builder
				.comment("Turns on Auto Compatibility for Mine and Slash stats. Turn off to configure yourself")
				.translation("dothackweapons.compatibility.use_compatibility_on_items")
				.define("USE_COMPATIBILITY_ON_ITEMS", true);

		ACCESSORY_MAXDAMAGE = builder.comment("Sets the max duriabily of Accessories.")
				.translation("dothackweapons.compatibility.accessory_maxdamage").define("ACCESSORY_MAXDAMAGE", 1000);

		RING_MAXDAMAGE = builder.comment("Sets the max duriabily of Rings.")
				.translation("dothackweapons.compatibility.ring_maxdamage").define("RING_MAXDAMAGE", 1000);

		SHIELD_MAXDAMAGE = builder.comment("Sets the max duriabily of Shields.")
				.translation("dothackweapons.compatibility.shields_maxdamage").define("SHIELD_MAXDAMAGE", 1000);

		builder.pop();
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