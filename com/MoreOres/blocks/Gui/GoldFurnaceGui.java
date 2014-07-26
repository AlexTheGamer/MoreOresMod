package com.MoreOres.blocks.Gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.MoreOres.blocks.tileEntity.GoldFurnaceTileEntity;
import com.MoreOres.lib.References;

public class GoldFurnaceGui extends GuiContainer{

	public static final ResourceLocation bground = new ResourceLocation(References.MODID + ":" + "textures/gui/furnace4.png");
	
	public GoldFurnaceTileEntity goldFurnace;
	
	public GoldFurnaceGui(InventoryPlayer inventoryPlayer, GoldFurnaceTileEntity entity) {
		super(new GoldFurnaceContainer(inventoryPlayer, entity));
		
		this.goldFurnace = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		String name = "Gold Furnace";
		
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2,
			int var3) 
	{
	GL11.glColor4f(1F, 1F, 1F, 1F);	
		
	Minecraft.getMinecraft().getTextureManager().bindTexture(bground);	
	drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);	
	
	  if(this.goldFurnace.isBurning()){
		  int k = this.goldFurnace.getBurnTimeRemainingScaled(40);
		  int j = 40 - k;
		  drawTexturedModalRect(guiLeft + 29, guiTop + 65, 176, 0, 40 - j, 10);
	  }
	  
	  int k = this.goldFurnace.getCookProgressScaled(24);
	  drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 10, k + 1, 16);
	}

}
