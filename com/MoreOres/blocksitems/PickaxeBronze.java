package com.MoreOres.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PickaxeBronze extends ItemPickaxe
{
	   public PickaxeBronze(Item.ToolMaterial mat){
		   super(mat);
	   }
	   
	   @SideOnly(Side.CLIENT)
	   public void registerIcons(IIconRegister reg) {
		   this.itemIcon = reg.registerIcon("MoreOresMod:BronzePickaxe");
	   }
	   
	   
	}
