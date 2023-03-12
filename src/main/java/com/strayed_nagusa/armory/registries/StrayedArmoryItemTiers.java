package com.strayed_nagusa.armory.registries;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public enum StrayedArmoryItemTiers implements IItemTier {
    THE_EPIC_OF_ALEXANDER(3, 8192, 8.5f, 3.5f, 22, () -> Ingredient.of(new ItemStack(StrayedArmoryItems.MITHRIL_INGOT.get())))
    ;
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchant;
    private final LazyValue<Ingredient> repairMaterial;

    StrayedArmoryItemTiers(int pHarvestLevel, int pMaxUses, float pEfficiency, float pAttackDamage, int pEnchant, Supplier<Ingredient> supplier) {
        this.harvestLevel = pHarvestLevel;
        this.maxUses = pMaxUses;
        this.efficiency = pEfficiency;
        this.attackDamage = pAttackDamage;
        this.enchant = pEnchant;
        this.repairMaterial = new LazyValue<>(supplier);
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchant;
    }

    @Override
    @Nonnull
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
}
