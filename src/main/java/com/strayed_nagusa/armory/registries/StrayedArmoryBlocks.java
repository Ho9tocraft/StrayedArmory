package com.strayed_nagusa.armory.registries;

import com.strayed_nagusa.armory.Mod_StrayedArmory;
import com.strayed_nagusa.armory.blocks.MetalBlockBase;
import com.strayed_nagusa.armory.blocks.OreBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class StrayedArmoryBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mod_StrayedArmory.MOD_ID);

    //Ores
    public static final RegistryObject<Block> COPPER_ORE = registerBlock("copper_ore",
            () -> new OreBase(3.0f, 3.6f, 1), StrayedArmoryItemGroups.SA_ORES);
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new OreBase(3.0f, 3.6f, 1), StrayedArmoryItemGroups.SA_ORES);
    public static final RegistryObject<Block> ZINC_ORE = registerBlock("zinc_ore",
            () -> new OreBase(2.8f, 3.36f, 1), StrayedArmoryItemGroups.SA_ORES);
    //MetalBlocks
    public static final RegistryObject<Block> COPPER_BLOCK = registerBlock("copper_block",
            () -> new MetalBlockBase(3.5f, 4.2f, 1), StrayedArmoryItemGroups.SA_MATERIALS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, ItemGroup group) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, group);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, ItemGroup group) {
        StrayedArmoryItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(group)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
