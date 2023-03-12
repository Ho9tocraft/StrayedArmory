package com.strayed_nagusa.armory.registries;

import com.strayed_nagusa.armory.Mod_StrayedArmory;
import com.strayed_nagusa.armory.items.IngotBase;
import com.strayed_nagusa.armory.items.weapons.SwordForDarkKnights;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class StrayedArmoryItems {


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mod_StrayedArmory.MOD_ID);
    //Ingots
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
            () -> new IngotBase(new Item.Properties().tab(StrayedArmoryItemGroups.SA_MATERIALS)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new IngotBase(new Item.Properties().tab(StrayedArmoryItemGroups.SA_MATERIALS)));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new IngotBase(new Item.Properties().tab(StrayedArmoryItemGroups.SA_MATERIALS)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new IngotBase(new Item.Properties().tab(StrayedArmoryItemGroups.SA_MATERIALS)));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new IngotBase(new Item.Properties().tab(StrayedArmoryItemGroups.SA_MATERIALS)));
    //Dusts

    //Weapons
    public static final RegistryObject<Item> ULTIMATE_NOTHUNG = ITEMS.register("ultimate_nothung",
            () -> new SwordForDarkKnights(StrayedArmoryItemTiers.THE_EPIC_OF_ALEXANDER, 14, 1.5f, new Item.Properties().tab(StrayedArmoryItemGroups.SA_WEAPONS)));

    public static void register(IEventBus eventBus) {
        Mod_StrayedArmory.LOGGER.info("Called Register.");
        ITEMS.register(eventBus);
    }
}
