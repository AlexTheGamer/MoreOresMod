package com.MoreOres.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class BronzeArmor extends ItemArmor
{
	   private String [] armourTypes = new String [] {"BronzeHelmet", "BronzeChestplate", "BronzeLegs", "BronzeBoots"};
	   
	   public BronzeArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		   super(armorMaterial, renderIndex, armourType);
	   }
	   
	   @Override
	   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
		   if(stack.getItem().equals(BlocksandItems.BronzeHelmet)|| stack.getItem().equals(BlocksandItems.BronzeChestplate)|| stack.getItem().equals(BlocksandItems.BronzeBoots)){
		   return "MoreOresMod:textures/armor/bronze_layer_1.png";
	   }
	   
	   if(stack.getItem().equals(BlocksandItems.BronzeLegs)){
		   return "MoreOresMod:textures/armor/bronze_layer_2.png";
	   }
	   else return null;
	}
	   
	   @Override
	   public void registerIcons(IIconRegister reg) {
		   if(this == BlocksandItems.BronzeHelmet)
			   this.itemIcon = reg.registerIcon("MoreOresMod:BronzeHelmet");
		   if(this == BlocksandItems.BronzeChestplate)
			   this.itemIcon = reg.registerIcon("MoreOresMod:BronzeChestplate");
		   if(this == BlocksandItems.BronzeLegs)
			   this.itemIcon = reg.registerIcon("MoreOresMod:BronzeLeggings");
		   if(this == BlocksandItems.BronzeBoots)
			   this.itemIcon = reg.registerIcon("MoreOresMod:BronzeBoots");
		   
	   }
	}
