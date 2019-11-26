package com.DEMMERS.behgameontweaks.init;

import com.DEMMERS.behgameontweaks.util.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Reference.MOD_ID)
public final class ModItems {

     // Because of @ObjectHolder these values will be filled by Forge at runtime
    public static final Item ACCESSORY_01 = null;
    public static final Item ACCESSORY_02 = null;

    @EventBusSubscriber(modid = Reference.MOD_ID)
    public static class RegistrationHandler{
    	@SubscribeEvent
        public static void onRegisterItems(final Register<Item> event) {
            final IForgeRegistry<Item> registry = event.getRegistry();
            registry.registerAll(
                new Item().setRegistryName(Reference.MOD_ID, "accessory_01").setUnlocalizedName("accessory_01"),
                new Item().setRegistryName(Reference.MOD_ID, "accessory_02").setUnlocalizedName("accessory_02")
            );
        }
    }

}