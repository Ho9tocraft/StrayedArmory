package com.strayed_nagusa.armory.items.weapons;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResultType;

public abstract class ItemSwordStrayedArmory extends SwordItem implements IRightClickActivated {
    public ItemSwordStrayedArmory(IItemTier tier, int attackDamageBase, float attackSpeedBase, Properties property) {
        super(tier, attackDamageBase, attackSpeedBase, property);
    }

    @Override
    public void onActivated(ItemStack stack, ItemUseContext context) {
        //If this Sector Activated, run Effect
        //In default, This Sector run Nothing.
    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        this.onActivated(stack, context);
        return ActionResultType.SUCCESS;
    }
}
