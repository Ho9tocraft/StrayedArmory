package com.strayed_nagusa.armory.items.groups;

import com.strayed_nagusa.armory.registries.StrayedArmoryBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemGroupStrayedArmoryOres extends ItemGroup {

    public ItemGroupStrayedArmoryOres() {
        super("sa_ores");
    }

    @Nonnull
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(StrayedArmoryBlocks.COPPER_ORE.get());
    }
}
