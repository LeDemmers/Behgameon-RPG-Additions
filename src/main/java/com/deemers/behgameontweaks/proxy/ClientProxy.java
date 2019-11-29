package com.deemers.behgameontweaks.proxy;

import com.deemers.behgameontweaks.BehgameonTweaks;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ClientProxy extends CommonProxy 
{
	@SubscribeEvent
	public static void onRegisterModelsEvent(ModelRegistryEvent e) {
		ForgeRegistries.ITEMS.getValuesCollection().stream()
				.filter(item -> item.getRegistryName().getNamespace().equals(BehgameonTweaks.MODID)).forEach(item -> {
					ModelLoader.setCustomModelResourceLocation(item, 0,
							new ModelResourceLocation(item.getRegistryName(), "inventory"));
				});
		BehgameonTweaks.LOGGER.info("Registered models");
	}
}
