package com.MoreOres.blocks.Gui;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.MoreOres.blocks.tileEntity.DiamondFurnaceTileEntity;
import com.MoreOres.blocks.tileEntity.GoldFurnaceTileEntity;
import com.MoreOres.blocks.tileEntity.IronFurnaceTileEntity;
import com.MoreOres.blocks.tileEntity.KryptoniteFurnaceTileEntity;
import com.MoreOres.blocks.tileEntity.RedstoneFurnaceTileEntity;
import com.MoreOres.blocksitems.BlocksandItems;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler 
implements IGuiHandler
{	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if(ID == BlocksandItems.guiIDKryptoniteFurnace)
			return new KryptoniteFurnaceContainer(player.inventory, (KryptoniteFurnaceTileEntity) entity);
		if(ID == BlocksandItems.guiIDRedstoneFurnace)
			return new RedstoneFurnaceContainer(player.inventory, (RedstoneFurnaceTileEntity) entity);
		if(ID == BlocksandItems.guiIDIronFurnace)
			return new IronFurnaceContainer(player.inventory, (IronFurnaceTileEntity) entity);
		if(ID == BlocksandItems.guiIDGoldFurnace)
			return new GoldFurnaceContainer(player.inventory, (GoldFurnaceTileEntity) entity);
		if(ID == BlocksandItems.guiIDDiamondFurnace)
			return new DiamondFurnaceContainer(player.inventory, (DiamondFurnaceTileEntity) entity);
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if(ID == BlocksandItems.guiIDKryptoniteFurnace)
			return new KryptoniteFurnaceGui(player.inventory, (KryptoniteFurnaceTileEntity) entity);
		if(ID == BlocksandItems.guiIDRedstoneFurnace)
			return new RedstoneFurnaceGui(player.inventory, (RedstoneFurnaceTileEntity) entity);
		if(ID == BlocksandItems.guiIDIronFurnace)
			return new IronFurnaceGui(player.inventory, (IronFurnaceTileEntity) entity);
		if(ID == BlocksandItems.guiIDGoldFurnace)
			return new GoldFurnaceGui(player.inventory, (GoldFurnaceTileEntity) entity);
		if(ID == BlocksandItems.guiIDDiamondFurnace)
			return new DiamondFurnaceGui(player.inventory, (DiamondFurnaceTileEntity) entity);
		return null;
}
	
	private Entity getEntityByID(int entityID, World world) {
		for(int i = 0; i < world.getLoadedEntityList().size(); i++) {
			if(((Entity)world.getLoadedEntityList().get(i)).getEntityId() == entityID) {
				return ((Entity)world.getLoadedEntityList().get(i));
			}
		}
		return null;
	}
}

