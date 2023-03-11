package com.strayed_nagusa.armory.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class MetalBlockBase extends Block {
    public MetalBlockBase(float hardness, float resistExplosion, int harvestLevel) {
        super(AbstractBlock.Properties.of(Material.METAL, MaterialColor.METAL)
                .requiresCorrectToolForDrops().strength(hardness, resistExplosion)
                .sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(harvestLevel));
    }
}
