package com.MoreOres.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Kryptonite extends Item
{
    public Kryptonite(){
    	super();
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister reg) {
    	this.itemIcon = reg.registerIcon("MoreOresMod:Kryptonite");
    }
    
    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
    super.onUpdate(stack, world, entity, par4, par5);
    EntityPlayer player = (EntityPlayer) entity;
    ItemStack equipped = player.getCurrentEquippedItem();
    if(equipped != null && equipped == stack) {
    player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 0));
    player.addPotionEffect(new PotionEffect(Potion.blindness.id, 5, 0));
    player.addPotionEffect(new PotionEffect(Potion.confusion.id, 5, 0));
    }
    }
}
