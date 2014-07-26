package com.MoreOres.blocksitems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
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

public class KryptoniteArmor extends ItemArmor
{
	   private String [] armourTypes = new String [] {"KryptoniteChestplate", "KryptoniteLegs", "KryptoniteBoots"};
	   
	   public KryptoniteArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		   super(armorMaterial, renderIndex, armourType);
	   }
	   
	   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
		   
		   if(stack.getItem().equals(BlocksandItems.KryptoniteChestplate)|| stack.getItem().equals(BlocksandItems.KryptoniteBoots)){
		   return "moreoresmod:textures/armor/superman_1.png";
	   }
	   
	   if(stack.getItem().equals(BlocksandItems.KryptoniteLegs)){
		   return "moreoresmod:textures/armor/superman_2.png";
	   }
	   else return null;
	}
	   
	   @Override
	   public void registerIcons(IIconRegister reg) {
		   if(this == BlocksandItems.KryptoniteChestplate)
			   this.itemIcon = reg.registerIcon("MoreOresMod:ChestplateKryptonite");
		   if(this == BlocksandItems.KryptoniteLegs)
			   this.itemIcon = reg.registerIcon("MoreOresMod:LegsKryptonite");
		   if(this == BlocksandItems.KryptoniteBoots)
			   this.itemIcon = reg.registerIcon("MoreOresMod:BootsKryptonite");
		   
	   }
	   
	   @Override
	   public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	   {
	     if ((player.getCurrentArmor(2) != null) && (player.getCurrentArmor(1) != null) && (player.getCurrentArmor(0) != null))
	     {
	       ItemStack plate = player.getCurrentArmor(2);
	       ItemStack legs = player.getCurrentArmor(1);
	       ItemStack boots = player.getCurrentArmor(0);

	       if (((boots.getItem() == BlocksandItems.KryptoniteBoots ? 1 : 0) | (legs.getItem() == BlocksandItems.KryptoniteLegs ? 1 : 0) | (plate.getItem() == BlocksandItems.KryptoniteChestplate ? 1 : 0)) != 0)
	       {
	         player.capabilities.allowFlying = true;
	         player.fallDistance = 0.0F;
	         player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 100, 5));
	         player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 100, 5));
	         player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 100, 5));
	         player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 100, 5));
	         player.addPotionEffect(new PotionEffect(Potion.waterBreathing.getId(), 100, 5));
	         player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 100, 5));
	         player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 100, 5));
	       }
	     }
	     else if (!player.capabilities.isCreativeMode)
	     {
	       player.capabilities.allowFlying = false;
	     }
	   }
	 }
	

