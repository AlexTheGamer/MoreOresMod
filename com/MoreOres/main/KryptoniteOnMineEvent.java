package com.MoreOres.main;

import net.minecraft.item.ItemStack;

import com.MoreOres.blocksitems.BlocksandItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class KryptoniteOnMineEvent {

	@SubscribeEvent
	public void whenIGetAKryptoniteIngot(PlayerEvent.ItemPickupEvent e){
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(BlocksandItems.Kryptonite))){
			e.player.addStat(mainRegistry.achievementKryptonite, 1);
		}
	}

}