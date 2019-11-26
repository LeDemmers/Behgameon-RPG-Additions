package com.DEMMERS.behgameontweaks.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(behgameontweaks.MOD_ID)
@EventBusSubscriber(modid = behgameontweaks.MOD_ID)
public final class ModItems {

     // Because of @ObjectHolder these values will be filled by Forge at runtime
    public static final Item ACCESSORY_01 = null;
    public static final Item ACCESSORY_02 = null;

    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final Registry<Item> = event.getRegistry();
        registry.registerAll(
            new Item().setRegistryName(behgameontweaks.MODID, "accessory_01"),
            new Item().setRegistryName(behgameontweaks.MODID, "accessory_02")
        );
        for (int attachment = 0; attachment < maxAttachments; ++attachment)
            registry.register(new AttachmentItem("attachment_"+attachment));
    }

}