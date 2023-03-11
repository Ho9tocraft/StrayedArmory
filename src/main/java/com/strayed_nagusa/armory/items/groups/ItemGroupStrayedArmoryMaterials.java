package com.strayed_nagusa.armory.items.groups;

import com.strayed_nagusa.armory.registries.StrayedArmoryItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class ItemGroupStrayedArmoryMaterials extends ItemGroup {

    public ItemGroupStrayedArmoryMaterials() {
        super("sa_materials");
    }

    @Nonnull
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(StrayedArmoryItems.COPPER_INGOT.get());
    }
}
