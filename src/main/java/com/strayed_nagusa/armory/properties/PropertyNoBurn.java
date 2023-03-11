package com.strayed_nagusa.armory.properties;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class PropertyNoBurn extends Item.Properties {
    public PropertyNoBurn(ItemGroup target) {
        this.fireResistant();
        this.tab(target);
    }
}
