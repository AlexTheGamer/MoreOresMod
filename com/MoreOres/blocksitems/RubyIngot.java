package com.MoreOres.blocksitems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class RubyIngot extends Item
{
   public RubyIngot(){
	   super();
   }
   
   @SideOnly(Side.CLIENT)
   public void registerIcons(IIconRegister reg) {
	   this.itemIcon = reg.registerIcon("MoreOresMod:RubyIngot");
   }
}
