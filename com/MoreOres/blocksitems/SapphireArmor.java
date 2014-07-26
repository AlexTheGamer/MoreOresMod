package com.MoreOres.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SapphireArmor extends ItemArmor
{
   private String [] armourTypes = new String [] {"helmetSapphire", "chestplateSapphire", "legsSapphire", "bootsSapphire"};
   
   public SapphireArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
	   super(armorMaterial, renderIndex, armourType);
   }
   
   @Override
   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
	   if(stack.getItem().equals(BlocksandItems.SapphireHelmet)|| stack.getItem().equals(BlocksandItems.SapphireChestplate)|| stack.getItem().equals(BlocksandItems.SapphireBoots)){
	   return "MoreOresMod:textures/armor/sapphire_1.png";
   }
   
   if(stack.getItem().equals(BlocksandItems.SapphireLegs)){
	   return "MoreOresMod:textures/armor/sapphire_2.png";
   }
   else return null;
}
   
   @Override
   public void registerIcons(IIconRegister reg) {
	   if(this == BlocksandItems.SapphireHelmet)
		   this.itemIcon = reg.registerIcon("MoreOresMod:SapphireHelmet");
	   if(this == BlocksandItems.SapphireChestplate)
		   this.itemIcon = reg.registerIcon("MoreOresMod:SapphireChestplate");
	   if(this == BlocksandItems.SapphireLegs)
		   this.itemIcon = reg.registerIcon("MoreOresMod:SapphireLegs");
	   if(this == BlocksandItems.SapphireBoots)
		   this.itemIcon = reg.registerIcon("MoreOresMod:SapphireBoots");
	   
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

       if (((boots.getItem() == BlocksandItems.SapphireBoots ? 1 : 0) | (legs.getItem() == BlocksandItems.SapphireLegs ? 1 : 0) | (plate.getItem() == BlocksandItems.SapphireChestplate ? 1 : 0) | (helmet.getItem() == BlocksandItems.SapphireHelmet ? 1 : 0)) != 0)
       {
         player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 100, 3));
         player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 100, 3));
         player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 100, 3));
         player.addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 100, 3));
         player.addPotionEffect(new PotionEffect(Potion.jump.getId(), 100, 3));
       }
     }
   }
 }

