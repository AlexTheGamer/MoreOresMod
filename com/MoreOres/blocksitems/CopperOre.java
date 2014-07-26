package com.MoreOres.blocksitems;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class CopperOre extends Block
{
	   public CopperOre(Material mat){
		   super(mat);
		   this.setLightLevel(1.5F);
		   this.setHarvestLevel("pickaxe", 2);
	   }
	   
	   @Override
	   public void registerBlockIcons(IIconRegister reg){
		   this.blockIcon = reg.registerIcon("MoreOresMod:CopperOre");
	   }
	   
	   public Item getItemDropped(int par1, Random random, int par2)
	   {
		    return BlocksandItems.CopperIngot;
	   }
	}
