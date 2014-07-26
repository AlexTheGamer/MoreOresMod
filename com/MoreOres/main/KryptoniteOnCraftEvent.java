package com.MoreOres.main;

import com.MoreOres.blocksitems.BlocksandItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class KryptoniteOnCraftEvent {

	@SubscribeEvent
	public void whenICraftAPickaxe(PlayerEvent.ItemCraftedEvent e){
		if(e.crafting.getItem().equals(BlocksandItems.PickaxeKryptonite)){
			e.player.addStat(mainRegistry.achievementKryptonitePickaxe, 1);
		}
	}

}