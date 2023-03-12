package com.strayed_nagusa.armory.items.groups;

import com.strayed_nagusa.armory.registries.StrayedArmoryItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupStrayedArmoryWeapons extends ItemGroup {
    public ItemGroupStrayedArmoryWeapons() {
        super("sa_weapons");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(StrayedArmoryItems.ULTIMATE_NOTHUNG.get());
    }
}
