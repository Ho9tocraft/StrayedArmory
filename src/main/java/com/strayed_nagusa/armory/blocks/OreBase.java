package com.strayed_nagusa.armory.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class OreBase extends Block {

    public OreBase(float hardness, float resistExplosion, int harvestLevel) {
        super(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE)
                .requiresCorrectToolForDrops().strength(hardness, resistExplosion)
                .sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(harvestLevel));
    }
}
