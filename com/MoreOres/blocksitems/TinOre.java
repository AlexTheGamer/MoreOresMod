package com.MoreOres.blocksitems;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class TinOre extends Block
{
	   public TinOre(Material mat){
		   super(mat);
		   this.setHarvestLevel("pickaxe", 2);
	   }
	   
	   @Override
	   public void registerBlockIcons(IIconRegister reg){
		   this.blockIcon = reg.registerIcon("MoreOresMod:TinOre");
	   }

	}
