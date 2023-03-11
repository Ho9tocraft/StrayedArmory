package com.strayed_nagusa.armory.registries;

import com.strayed_nagusa.armory.Mod_StrayedArmory;
import com.strayed_nagusa.armory.items.IngotBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class StrayedArmoryItems {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_StrayedArmory.MOD_ID);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
            () -> new IngotBase(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new IngotBase(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static void register(IEventBus eventBus) {
        Mod_StrayedArmory.LOGGER.info("Called Register.");
        ITEMS.register(eventBus);
        Mod_StrayedArmory.LOGGER.info("Loaded: " + COPPER_INGOT.get().getRegistryName());
        Mod_StrayedArmory.LOGGER.info("Loaded: " + TIN_INGOT.get().getRegistryName());
    }
}
