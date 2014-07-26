package com.MoreOres.blocks.Gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.MoreOres.blocks.tileEntity.RedstoneFurnaceTileEntity;
import com.MoreOres.blocksitems.BlocksandItems;

import cpw.mods.fml.common.network.IGuiHandler;

public class RedstoneFurnaceGuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case BlocksandItems.guiIDRedstoneFurnace:
				if(entity instanceof RedstoneFurnaceTileEntity) {
					return new RedstoneFurnaceContainer(player.inventory, (RedstoneFurnaceTileEntity) entity);
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
			case BlocksandItems.guiIDRedstoneFurnace:
				if(entity instanceof RedstoneFurnaceTileEntity) {
					return new RedstoneFurnaceGui(player.inventory, (RedstoneFurnaceTileEntity) entity);
				}
				return null;
			}
		}
		return null;

     }
}
