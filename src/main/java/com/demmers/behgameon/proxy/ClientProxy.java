package com.demmers.behgameon.proxy;

import com.demmers.behgameon.BehgameonMod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import static net.minecraftforge.fml.relauncher.Side.CLIENT;

@Mod.EventBusSubscriber(modid = BehgameonMod.MODID, value = CLIENT)
public class ClientProxy extends CommonProxy {
	@SubscribeEvent
	public static void onRegisterModelsEvent(ModelRegistryEvent e) {
		ForgeRegistries.ITEMS.getValuesCollection().stream()
				.filter(item -> item.getRegistryName().getNamespace().equals(BehgameonMod.MODID)).forEach(item -> {
					ModelLoader.setCustomModelResourceLocation(item, 0,
							new ModelResourceLocation(item.getRegistryName(), "inventory"));
				});
		BehgameonMod.LOGGER.info("Registered models");
	}
}
