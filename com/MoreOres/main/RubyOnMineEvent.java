package com.MoreOres.main;

import net.minecraft.item.ItemStack;

import com.MoreOres.blocksitems.BlocksandItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class RubyOnMineEvent {

	@SubscribeEvent
	public void whenIGetARubyIngot(PlayerEvent.ItemPickupEvent e){
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(BlocksandItems.RubyIngot))){
			e.player.addStat(mainRegistry.achievementRuby, 1);
		}
	}

}