package com.MoreOres.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CopperIngot extends Item
{
   public CopperIngot(){
	   super();
   }
   
   @SideOnly(Side.CLIENT)
   public void registerIcons(IIconRegister reg){
	   this.itemIcon = reg.registerIcon("MoreOresMod:CopperIngot");
   }
}
