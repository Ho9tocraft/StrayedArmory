package com.strayed_nagusa.armory.items.weapons;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.Objects;

public class SwordForDarkKnights extends ItemSwordStrayedArmory {
    public SwordForDarkKnights(IItemTier tier, int attackDamageBase, float attackSpeedBase, Properties property) {
        super(tier, attackDamageBase, attackSpeedBase, property);
    }

    @Override
    public void onActivated(ItemStack stack, ItemUseContext context) {
        World world = context.getLevel();
        if (!world.isClientSide) {
            //Edit Something.
            PlayerEntity player = Objects.requireNonNull(context.getPlayer());
            {
            }
            stack.hurtAndBreak(1, player, consumer -> player.broadcastBreakEvent(context.getHand()));
        }
    }
}
