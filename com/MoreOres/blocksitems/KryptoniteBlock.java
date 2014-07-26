package com.MoreOres.blocksitems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class KryptoniteBlock extends Block
{

	public KryptoniteBlock(Material mat) {
		super(mat);
		this.setLightLevel(2.5F);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon("MoreOresMod:KryptoniteBlock");
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
