package com.MoreOres.blocksitems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockSapphire extends Block
{

	public BlockSapphire(Material mat) {
		super(mat);
		this.setLightLevel(2.5F);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon("MoreOresMod:BlockSapphire");
	}
	
  
}
