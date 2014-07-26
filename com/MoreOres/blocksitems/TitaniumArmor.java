package com.MoreOres.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TitaniumArmor extends ItemArmor
{
	   private String [] armourTypes = new String [] {"helmetTitanium", "chestplateTitanium", "legsTitanium", "bootsTitanium"};
	   
	   public TitaniumArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		   super(armorMaterial, renderIndex, armourType);
	   }
	   
	   @Override
	   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
		   if(stack.getItem().equals(BlocksandItems.TitaniumHelmet)|| stack.getItem().equals(BlocksandItems.TitaniumChestplate)|| stack.getItem().equals(BlocksandItems.TitaniumBoots)){
		   return "MoreOresMod:textures/armor/titanium_1.png";
	   }
	   
	   if(stack.getItem().equals(BlocksandItems.TitaniumLegs)){
		   return "MoreOresMod:textures/armor/titanium_2.png";
	   }
	   else return null;
	}
	   
	   @Override
	   public void registerIcons(IIconRegister reg) {
		   if(this == BlocksandItems.TitaniumHelmet)
			   this.itemIcon = reg.registerIcon("MoreOresMod:TitaniumHelmet");
		   if(this == BlocksandItems.TitaniumChestplate)
			   this.itemIcon = reg.registerIcon("MoreOresMod:TitaniumChestplate");
		   if(this == BlocksandItems.TitaniumLegs)
			   this.itemIcon = reg.registerIcon("MoreOresMod:TitaniumLegs");
		   if(this == BlocksandItems.TitaniumBoots)
			   this.itemIcon = reg.registerIcon("MoreOresMod:TitaniumBoots");
		   
	   }
	   
	   @Override
	   public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
	     player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 3));
	     player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 500, 3));
	     player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 500, 3));
	     player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 500, 3));
	     player.addPotionEffect(new PotionEffect(Potion.jump.id, 500, 3));
	   }
	}
