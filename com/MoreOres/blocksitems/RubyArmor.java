package com.MoreOres.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class RubyArmor extends ItemArmor
{
	   private String [] armourTypes = new String [] {"helmetRuby", "chestplateRuby", "legsRuby", "bootsRuby"};
	   
	   public RubyArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		   super(armorMaterial, renderIndex, armourType);
	   }
	   
	   @Override
	   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
		   if(stack.getItem().equals(BlocksandItems.RubyHelmet)|| stack.getItem().equals(BlocksandItems.RubyChestplate)|| stack.getItem().equals(BlocksandItems.RubyBoots)){
		   return "MoreOresMod:textures/armor/ruby_1.png";
	   }
	   
	   if(stack.equals(BlocksandItems.RubyLegs)){
		   return "MoreOresMod:textures/armor/ruby_2.png";
	   }
	   else return null;
	}
	   
	   @Override
	   public void registerIcons(IIconRegister reg) {
		   if(this == BlocksandItems.RubyHelmet)
			   this.itemIcon = reg.registerIcon("MoreOresMod:RubyHelmet");
		   if(this == BlocksandItems.RubyChestplate)
			   this.itemIcon = reg.registerIcon("MoreOresMod:RubyChestplate");
		   if(this == BlocksandItems.RubyLegs)
			   this.itemIcon = reg.registerIcon("MoreOresMod:RubyLeggings");
		   if(this == BlocksandItems.RubyBoots)
			   this.itemIcon = reg.registerIcon("MoreOresMod:RubyBoots");
		   
	   }
	}
