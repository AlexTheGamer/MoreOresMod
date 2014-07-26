package com.MoreOres.blocksitems;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HoeRuby extends ItemHoe
{
	public HoeRuby(Item.ToolMaterial mat){
		   super(mat);
	   }
	   
	   @SideOnly(Side.CLIENT)
	   public void registerIcons(IIconRegister reg) {
		   this.itemIcon = reg.registerIcon("MoreOresMod:RubyHoe");
	   }
}
