package com.MoreOres.blocksitems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockCopper extends Block
{

	public BlockCopper(Material mat) {
		super(mat);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon("MoreOresMod:BlockCopper");
	}
	
  
}
