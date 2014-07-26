package com.MoreOres.main;

import com.MoreOres.blocksitems.BlocksandItems;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class SapphireOnMineEvent {

	@SubscribeEvent
	public void whenIGetASapphireIngot(PlayerEvent.ItemPickupEvent e){
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(BlocksandItems.SapphireIngot))){
			e.player.addStat(mainRegistry.achievementSapphire, 1);
		}
	}

}