package com.MoreOres.blocksitems;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class KryptoniteOre extends Block
{

	public KryptoniteOre(Material mat) {
		super(mat);
		this.setLightLevel(1.5F);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon("MoreOresMod:KryptoniteOre");
	}
	
	 public Item getItemDropped(int par1, Random random, int par2)
	   {
		    return BlocksandItems.Kryptonite;
	   }
	 
	 @Override
	 public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity)
	    {
	        if(entity instanceof EntityLiving)
	        {
	       	 ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.poison.id, 15 * 20, 0));
	        }
	    }
  
}
