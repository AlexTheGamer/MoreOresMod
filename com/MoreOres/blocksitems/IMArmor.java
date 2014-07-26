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
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class IMArmor extends ItemArmor
{
	   private String [] armourTypes = new String [] {"helmetIM", "chestplateIM", "legsIM", "bootsIM"};
	   
	   public IMArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		   super(armorMaterial, renderIndex, armourType);
	   }
	   
	   @Override
	   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
		   if(stack.getItem().equals(BlocksandItems.IMHelmet)|| stack.getItem().equals(BlocksandItems.IMChestplate)|| stack.getItem().equals(BlocksandItems.IMBoots)){
		   return "MoreOresMod:textures/armor/IM_1.png";
	   }
	   
	   if(stack.getItem().equals(BlocksandItems.IMLegs)){
		   return "MoreOresMod:textures/armor/IM_2.png";
	   }
	   else return null;
	}
	   
	   @Override
	   public void registerIcons(IIconRegister reg) {
		   if(this == BlocksandItems.IMHelmet)
			   this.itemIcon = reg.registerIcon("MoreOresMod:IMHelmet");
		   if(this == BlocksandItems.IMChestplate)
			   this.itemIcon = reg.registerIcon("MoreOresMod:IMChestplate");
		   if(this == BlocksandItems.IMLegs)
			   this.itemIcon = reg.registerIcon("MoreOresMod:IMLeggings");
		   if(this == BlocksandItems.IMBoots)
			   this.itemIcon = reg.registerIcon("MoreOresMod:IMBoots");
		   
	   }
	

	   
	   @Override
	   public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	   {
	     if ((player.getCurrentArmor(3) != null) && (player.getCurrentArmor(2) != null) && (player.getCurrentArmor(1) != null) && (player.getCurrentArmor(0) != null))
	     {
	       ItemStack helmet = player.getCurrentArmor(3);
	       ItemStack plate = player.getCurrentArmor(2);
	       ItemStack legs = player.getCurrentArmor(1);
	       ItemStack boots = player.getCurrentArmor(0);

	       if (((boots.getItem() == BlocksandItems.IMBoots ? 1 : 0) | (legs.getItem() == BlocksandItems.IMLegs ? 1 : 0) | (plate.getItem() == BlocksandItems.IMChestplate ? 1 : 0) | (helmet.getItem() == BlocksandItems.IMHelmet ? 1 : 0)) != 0)
	       {
	         player.capabilities.allowFlying = true;
	         player.fallDistance = 0.0F;
	         player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 100, 4));
	         player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 100, 4));
	         player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 100, 4));
	         player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 100, 4));
	         player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 100, 4));
	         player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 100, 4));
	         player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 100, 4));
	       }
	     }
	     else if (!player.capabilities.isCreativeMode)
	     {
	       player.capabilities.allowFlying = false;
	     }
	   }
	 }


