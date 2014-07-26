package com.MoreOres.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BronzeIngot extends Item
{
	   public BronzeIngot(){
		   super();
	   }
	   
	   @SideOnly(Side.CLIENT)
	   public void registerIcons(IIconRegister reg){
		   this.itemIcon = reg.registerIcon("MoreOresMod:BronzeIngot");
	   }
	}
