package com.MoreOres.blocks.Gui;

import com.MoreOres.blocks.tileEntity.KryptoniteFurnaceTileEntity;
import com.MoreOres.blocksitems.BlocksandItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class KryptoniteFurnaceGuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case BlocksandItems.guiIDKryptoniteFurnace:
				if(entity instanceof KryptoniteFurnaceTileEntity) {
					return new KryptoniteFurnaceContainer(player.inventory, (KryptoniteFurnaceTileEntity) entity);
				}
				return null;
			}
		}
		return null;

     }

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case BlocksandItems.guiIDKryptoniteFurnace:
				if(entity instanceof KryptoniteFurnaceTileEntity) {
					return new KryptoniteFurnaceGui(player.inventory, (KryptoniteFurnaceTileEntity) entity);
				}
				return null;
			}
		}
		return null;

     }
}
