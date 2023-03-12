package com.strayed_nagusa.armory.items.weapons;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;

public interface IRightClickActivated {
    void onActivated(ItemStack stack, ItemUseContext context);
}
