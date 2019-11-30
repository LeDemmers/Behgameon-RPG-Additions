package com.demmers.behgameon.init;

import com.demmers.behgameon.BehgameonMod;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = BehgameonMod.MODID)
@Config.LangKey("behgameon.config.title")
public class ModConfig {

	@Config.Name("Enable Auto Mine and Slash Stats")
	@Config.Comment("Auto Compat with Mine and Slash")
	public static boolean USE_COMPATIBILITY = true;

	@Mod.EventBusSubscriber(modid = BehgameonMod.MODID)
	private static class EventHandler {

		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(BehgameonMod.MODID)) {
				ConfigManager.sync(BehgameonMod.MODID, Config.Type.INSTANCE);
			}
		}
	}
}