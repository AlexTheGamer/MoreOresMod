package com.MoreOres.blocksitems;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;

public class BlockHouse extends Block
{
	
	public BlockHouse(Material mat)
	{
		super(mat);
		this.setCreativeTab(BlocksandItems.moreOresTab);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon("moreoresmod:BlockHouse");
	}
	
	public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entity, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{
		Block CC = Blocks.cobblestone;
		Block PP = Blocks.planks;
		Block GG = Blocks.glass;
		Block CT = Blocks.crafting_table;
		Block OO = Blocks.lit_furnace;
		Block CA = Blocks.cake;
		Block CH = Blocks.chest;
		Block FE = Blocks.fence;
		Block PR = Blocks.air;
		
		    world.setBlock(i + 0, j + -1,  k + -4, PP, 0, 0);
		    world.setBlock(i + 0, j + -1, k + -3, PP, 0, 0);
		    world.setBlock(i + 0, j + -1, k + -2, PP, 0, 0);
		    world.setBlock(i + 0, j + -1, k + -1, PP, 0, 0);
		    world.setBlock(i + 0, j + -1, k + 0, PP, 0, 0);
		    world.setBlock(i + 0, j + -1, k + 4, PP, 0, 0);
		    world.setBlock(i + 0, j + -1, k + 3, PP, 0, 0);
		    world.setBlock(i + 0, j + -1, k + 2, PP, 0, 0);
		    world.setBlock(i + 0, j + -1, k + 1, PP, 0, 0);
		    world.setBlock(i + 1, j + -1, k + -4, PP, 0, 0);
		    world.setBlock(i + 1, j + -1, k + -3, PP, 0, 0);
		    world.setBlock(i + 1, j + -1, k + -2, PP, 0, 0);
		    world.setBlock(i + 1, j + -1, k + -1, PP, 0, 0);
		    world.setBlock(i + 1, j + -1, k + 0, PP, 0, 0);
		    world.setBlock(i + 1, j + -1, k + 4, PP, 0, 0);
		    world.setBlock(i + 1, j + -1, k + 3, PP, 0, 0);
		    world.setBlock(i + 1, j + -1, k + 2, PP, 0, 0);
		    world.setBlock(i + 1, j + -1, k + 1, PP, 0, 0);
		    world.setBlock(i + 2, j + -1, k + -4, PP, 0, 0);
		    world.setBlock(i + 2, j + -1, k + -3, PP, 0, 0);
		    world.setBlock(i + 2, j + -1, k + -2, PP, 0, 0);
		    world.setBlock(i + 2, j + -1, k + -1, PP, 0, 0);
		    world.setBlock(i + 2, j + -1, k + 0, PP, 0, 0);
		    world.setBlock(i + 2, j + -1, k + 4, PP, 0, 0);
		    world.setBlock(i + 2, j + -1, k + 3, PP, 0, 0);
		    world.setBlock(i + 2, j + -1, k + 2, PP, 0, 0);
		    world.setBlock(i + 2, j + -1, k + 1, PP, 0, 0);
		    world.setBlock(i + 3, j + -1, k + -4, PP, 0, 0);
		    world.setBlock(i + 3, j + -1, k + -3, PP, 0, 0);
		    world.setBlock(i + 3, j + -1, k + -2, PP, 0, 0);
		    world.setBlock(i + 3, j + -1, k + -1, PP, 0, 0);
		    world.setBlock(i + 3, j + -1, k + 0, PP, 0, 0);
		    world.setBlock(i + 3, j + -1, k + 4, PP, 0, 0);
		    world.setBlock(i + 3, j + -1, k + 3, PP, 0, 0);
		    world.setBlock(i + 3, j + -1, k + 2, PP, 0, 0);
		    world.setBlock(i + 3, j + -1, k + 1, PP, 0, 0);
		    world.setBlock(i + 4, j + -1, k + -4, PP, 0, 0);
		    world.setBlock(i + 4, j + -1, k + -3, PP, 0, 0);
		    world.setBlock(i + 4, j + -1, k + -2, PP, 0, 0);
		    world.setBlock(i + 4, j + -1, k + -1, PP, 0, 0);
		    world.setBlock(i + 4, j + -1, k + 0, PP, 0, 0);
		    world.setBlock(i + 4, j + -1, k + 4, PP, 0, 0);
		    world.setBlock(i + 4, j + -1, k + 3, PP, 0, 0);
		    world.setBlock(i + 4, j + -1, k + 2, PP, 0, 0);
		    world.setBlock(i + 4, j + -1, k + 1, PP, 0, 0);
		    world.setBlock(i + 5, j + -1, k + -4, PP, 0, 0);
		    world.setBlock(i + 5, j + -1, k + -3, PP, 0, 0);
		    world.setBlock(i + 5, j + -1, k + -2, PP, 0, 0);
		    world.setBlock(i + 5, j + -1, k + -1, PP, 0, 0);
		    world.setBlock(i + 5, j + -1, k + 0, PP, 0, 0);
		    world.setBlock(i + 5, j + -1, k + 4, PP, 0, 0);
		    world.setBlock(i + 5, j + -1, k + 3, PP, 0, 0);
		    world.setBlock(i + 5, j + -1, k + 2, PP, 0, 0);
		    world.setBlock(i + 5, j + -1, k + 1, PP, 0, 0);

		    world.setBlock(i + 5, j + 0, k + -4, CC, 0, 0);
		    world.setBlock(i + 5, j + 0, k + -3, CC, 0, 0);
		    world.setBlock(i + 5, j + 0, k + -2, CC, 0, 0);
		    world.setBlock(i + 5, j + 0, k + -1, CC, 0, 0);
		    world.setBlock(i + 5, j + 0, k + 0, CC, 0, 0);
		    world.setBlock(i + 5, j + 0, k + 4, CC, 0, 0);
		    world.setBlock(i + 5, j + 0, k + 3, CC, 0, 0);
		    world.setBlock(i + 5, j + 0, k + 2, CC, 0, 0);
		    world.setBlock(i + 5, j + 0, k + 1, CC, 0, 0);
		    world.setBlock(i + 0, j + 0, k + -4, CC, 0, 0);
		    world.setBlock(i + 0, j + 0, k + -3, CC, 0, 0);
		    world.setBlock(i + 0, j + 0, k + -2, CC, 0, 0);
		    world.setBlock(i + 0, j + 0, k + -1, CC, 0, 0);
		    world.setBlock(i + 0, j + 0, k + 0, PR, 0, 0);
		    world.setBlock(i + 0, j + 0, k + 4, CC, 0, 0);
		    world.setBlock(i + 0, j + 0, k + 3, CC, 0, 0);
		    world.setBlock(i + 0, j + 0, k + 2, CC, 0, 0);
		    world.setBlock(i + 0, j + 0, k + 1, CC, 0, 0);
		    world.setBlock(i + 1, j + 0, k + -4, CC, 0, 0);
		    world.setBlock(i + 2, j + 0, k + -4, CC, 0, 0);
		    world.setBlock(i + 3, j + 0, k + -4, CC, 0, 0);
		    world.setBlock(i + 4, j + 0, k + -4, CC, 0, 0);
		    world.setBlock(i + 1, j + 0, k + 4, CC, 0, 0);
		    world.setBlock(i + 2, j + 0, k + 4, CC, 0, 0);
		    world.setBlock(i + 3, j + 0, k + 4, CC, 0, 0);
		    world.setBlock(i + 4, j + 0, k + 4, CC, 0, 0);

		    world.setBlock(i + 5, j + 1, k + -4, CC, 0, 0);
		    world.setBlock(i + 5, j + 1, k + -3, PP, 0, 0);
		    world.setBlock(i + 5, j + 1, k + -2, GG, 0, 0);
		    world.setBlock(i + 5, j + 1, k + -1, GG, 0, 0);
		    world.setBlock(i + 5, j + 1, k + 0, GG, 0, 0);
		    world.setBlock(i + 5, j + 1, k + 4, CC, 0, 0);
		    world.setBlock(i + 5, j + 1, k + 3, GG, 0, 0);
		    world.setBlock(i + 5, j + 1, k + 2, GG, 0, 0);
		    world.setBlock(i + 5, j + 1, k + 1, PP, 0, 0);
		    world.setBlock(i + 0, j + 1, k + -4, CC, 0, 0);
		    world.setBlock(i + 0, j + 1, k + -3, GG, 0, 0);
		    world.setBlock(i + 0, j + 1, k + -2, GG, 0, 0);
		    world.setBlock(i + 0, j + 1, k + -1, PP, 0, 0);
		    world.setBlock(i + 0, j + 1, k + 4, CC, 0, 0);
		    world.setBlock(i + 0, j + 1, k + 3, GG, 0, 0);
		    world.setBlock(i + 0, j + 1, k + 2, GG, 0, 0);
		    world.setBlock(i + 0, j + 1, k + 1, PP, 0, 0);
		    world.setBlock(i + 1, j + 1, k + -4, GG, 0, 0);
		    world.setBlock(i + 2, j + 1, k + -4, GG, 0, 0);
		    world.setBlock(i + 3, j + 1, k + -4, GG, 0, 0);
		    world.setBlock(i + 4, j + 1, k + -4, PP, 0, 0);
		    world.setBlock(i + 1, j + 1, k + 4, GG, 0, 0);
		    world.setBlock(i + 2, j + 1, k + 4, GG, 0, 0);
		    world.setBlock(i + 3, j + 1, k + 4, GG, 0, 0);
		    world.setBlock(i + 4, j + 1, k + 4, GG, 0, 0);

		    world.setBlock(i + 5, j + 2, k + -4, CC, 0, 0);
		    world.setBlock(i + 5, j + 2, k + -3, PP, 0, 0);
		    world.setBlock(i + 5, j + 2, k + -2, PP, 0, 0);
		    world.setBlock(i + 5, j + 2, k + -1, PP, 0, 0);
		    world.setBlock(i + 5, j + 2, k + 0, PP, 0, 0);
		    world.setBlock(i + 5, j + 2, k + 4, CC, 0, 0);
		    world.setBlock(i + 5, j + 2, k + 3, PP, 0, 0);
		    world.setBlock(i + 5, j + 2, k + 2, PP, 0, 0);
		    world.setBlock(i + 5, j + 2, k + 1, PP, 0, 0);
		    world.setBlock(i + 0, j + 2, k + -4, CC, 0, 0);
		    world.setBlock(i + 0, j + 2, k + -3, PP, 0, 0);
		    world.setBlock(i + 0, j + 2, k + -2, PP, 0, 0);
		    world.setBlock(i + 0, j + 2, k + -1, PP, 0, 0);
		    world.setBlock(i + 0, j + 2, k + 0, PP, 0, 0);
		    world.setBlock(i + 0, j + 2, k + 4, CC, 0, 0);
		    world.setBlock(i + 0, j + 2, k + 3, PP, 0, 0);
		    world.setBlock(i + 0, j + 2, k + 2, PP, 0, 0);
		    world.setBlock(i + 0, j + 2, k + 1, PP, 0, 0);
		    world.setBlock(i + 1, j + 2, k + -4, PP, 0, 0);
		    world.setBlock(i + 2, j + 2, k + -4, PP, 0, 0);
		    world.setBlock(i + 3, j + 2, k + -4, PP, 0, 0);
		    world.setBlock(i + 4, j + 2, k + -4, PP, 0, 0);
		    world.setBlock(i + 1, j + 2, k + 4, PP, 0, 0);
		    world.setBlock(i + 2, j + 2, k + 4, PP, 0, 0);
		    world.setBlock(i + 3, j + 2, k + 4, PP, 0, 0);
		    world.setBlock(i + 4, j + 2, k + 4, PP, 0, 0);

		    world.setBlock(i + 5, j + 3, k + -4, CC, 0, 0);
		    world.setBlock(i + 5, j + 3, k + -3, PP, 0, 0);
		    world.setBlock(i + 5, j + 3, k + -2, PP, 0, 0);
		    world.setBlock(i + 5, j + 3, k + -1, PP, 0, 0);
		    world.setBlock(i + 5, j + 3, k + 0, PP, 0, 0);
		    world.setBlock(i + 5, j + 3, k + 4, CC, 0, 0);
		    world.setBlock(i + 5, j + 3, k + 3, PP, 0, 0);
		    world.setBlock(i + 5, j + 3, k + 2, PP, 0, 0);
		    world.setBlock(i + 5, j + 3, k + 1, PP, 0, 0);
		    world.setBlock(i + 0, j + 3, k + -4, CC, 0, 0);
		    world.setBlock(i + 0, j + 3, k + -3, PP, 0, 0);
		    world.setBlock(i + 0, j + 3, k + -2, PP, 0, 0);
		    world.setBlock(i + 0, j + 3, k + -1, PP, 0, 0);
		    world.setBlock(i + 0, j + 3, k + 0, PP, 0, 0);
		    world.setBlock(i + 0, j + 3, k + 4, CC, 0, 0);
		    world.setBlock(i + 0, j + 3, k + 3, PP, 0, 0);
		    world.setBlock(i + 0, j + 3, k + 2, PP, 0, 0);
		    world.setBlock(i + 0, j + 3, k + 1, PP, 0, 0);
		    world.setBlock(i + 1, j + 3, k + -4, PP, 0, 0);
		    world.setBlock(i + 2, j + 3, k + -4, PP, 0, 0);
		    world.setBlock(i + 3, j + 3, k + -4, PP, 0, 0);
		    world.setBlock(i + 4, j + 3, k + -4, PP, 0, 0);
		    world.setBlock(i + 1, j + 3, k + 4, PP, 0, 0);
		    world.setBlock(i + 2, j + 3, k + 4, PP, 0, 0);
		    world.setBlock(i + 3, j + 3, k + 4, PP, 0, 0);
		    world.setBlock(i + 4, j + 3, k + 4, PP, 0, 0);

		    world.setBlock(i + 4, j + 4, k + -3, PP, 0, 0);
		    world.setBlock(i + 4, j + 4, k + -2, PP, 0, 0);
		    world.setBlock(i + 4, j + 4, k + -1, PP, 0, 0);
		    world.setBlock(i + 4, j + 4, k + 0, PP, 0, 0);
		    world.setBlock(i + 4, j + 4, k + 3, PP, 0, 0);
		    world.setBlock(i + 4, j + 4, k + 2, PP, 0, 0);
		    world.setBlock(i + 4, j + 4, k + 1, PP, 0, 0);
		    world.setBlock(i + 1, j + 4, k + -3, PP, 0, 0);
		    world.setBlock(i + 1, j + 4, k + -2, PP, 0, 0);
		    world.setBlock(i + 1, j + 4, k + -1, PP, 0, 0);
		    world.setBlock(i + 1, j + 4, k + 0, PP, 0, 0);
		    world.setBlock(i + 1, j + 4, k + 3, PP, 0, 0);
		    world.setBlock(i + 1, j + 4, k + 2, PP, 0, 0);
		    world.setBlock(i + 1, j + 4, k + 1, PP, 0, 0);
		    world.setBlock(i + 2, j + 4, k + -3, PP, 0, 0);
		    world.setBlock(i + 2, j + 4, k + 3, PP, 0, 0);
		    world.setBlock(i + 3, j + 4, k + -3, PP, 0, 0);
		    world.setBlock(i + 3, j + 4, k + 3, PP, 0, 0);

		    world.setBlock(i + 2, j + 5, k + -2, PP, 0, 0);
		    world.setBlock(i + 2, j + 5, k + -1, PP, 0, 0);
		    world.setBlock(i + 2, j + 5, k + 0, PP, 0, 0);
		    world.setBlock(i + 2, j + 5, k + 2, PP, 0, 0);
		    world.setBlock(i + 2, j + 5, k + 1, PP, 0, 0);
		    world.setBlock(i + 3, j + 5, k + -2, PP, 0, 0);
		    world.setBlock(i + 3, j + 5, k + -1, PP, 0, 0);
		    world.setBlock(i + 3, j + 5, k + 0, PP, 0, 0);
		    world.setBlock(i + 3, j + 5, k + 2, PP, 0, 0);
		    world.setBlock(i + 3, j + 5, k + 1, PP, 0, 0);

		    world.setBlock(i + 4, j + 0, k + -2, CT, 0, 0);
		    world.setBlock(i + 4, j + 0, k + 0, OO, 0, 0);
		    world.setBlock(i + 4, j + 1, k + 0, CA, 0, 0);
		    world.setBlock(i + 3, j + 0, k + 3, CH, 0, 0);
		    world.setBlock(i + 2, j + 0, k + 3, CH, 0, 0);
		    world.setBlock(i + 2, j + 0, k + -2, FE, 0, 0);
		    world.setBlock(i + 2, j + 1, k + -2, Blocks.wooden_pressure_plate, 0, 0);
		    
		    TileEntityChest chest2 = new TileEntityChest();
		    
		    world.setTileEntity(i + 3, j + 0, k + 3, chest2);
		    
		    Random random = new Random();
		    
		    for (int slot = 0; slot < chest2.getSizeInventory(); slot++)
		    {
		      int num = random.nextInt(30);

		      if (num == 1) {
		        chest2.setInventorySlotContents(slot, new ItemStack(Blocks.torch));
		      }

		      if (num == 2) {
		        chest2.setInventorySlotContents(slot, new ItemStack(Blocks.cobblestone));
		      }

		      if (num == 5) {
		        chest2.setInventorySlotContents(slot, new ItemStack(Items.cooked_beef));
		      }

		      if (num == 6) {
		        chest2.setInventorySlotContents(slot, new ItemStack(Blocks.dirt));
		      }

		      if (num == 7) {
		        chest2.setInventorySlotContents(slot, new ItemStack(Blocks.sapling));
		      }

		      if (num == 8) {
		        chest2.setInventorySlotContents(slot, new ItemStack(Items.stone_pickaxe));
		      }

		    }

		    TileEntityChest chest3 = new TileEntityChest();

		    world.setTileEntity(i + 2, j + 0, k + 3, chest3);

		    for (int slot = 0; slot < chest3.getSizeInventory(); slot++)
		    {
		      int num = random.nextInt(30);

		      if (num == 1) {
		        chest3.setInventorySlotContents(slot, new ItemStack(Items.stick));
		      }

		      if (num == 2) {
		        chest3.setInventorySlotContents(slot, new ItemStack(Blocks.sand));
		      }

		      if (num == 5) {
		        chest3.setInventorySlotContents(slot, new ItemStack(Items.string));
		      }

		      if (num == 6) {
		        chest3.setInventorySlotContents(slot, new ItemStack(Items.mushroom_stew));
		      }

		      if (num == 7) {
		        chest3.setInventorySlotContents(slot, new ItemStack(Items.wheat));
		      }

		      if (num == 8) {
		        chest3.setInventorySlotContents(slot, new ItemStack(Items.painting));
		      }

		    }

		    return true;
		  }
		}