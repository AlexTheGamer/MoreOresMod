package com.MoreOres.main;

import com.MoreOres.blocksitems.BlocksandItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	
	public static void MainClass(){
		addCraftingRecipes();
		addSmeltingRecipes();
	}
	
	public static void addCraftingRecipes(){
		//Furnaces
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.KryptoniteFurnaceIdle), "KKK", "KFK", "KKK", 'K', BlocksandItems.Kryptonite, 'F', Blocks.furnace);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.RedstoneFurnaceIdle), "R R", " F ", "R R", 'R', Blocks.redstone_block, 'F', Blocks.furnace);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.IronFurnaceIdle), "III", "IFI", "III", 'I', Items.iron_ingot, 'F', Blocks.furnace);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.GoldFurnaceIdle), "GGG", "GFG", "GGG", 'G', Items.gold_ingot, 'F', BlocksandItems.IronFurnaceIdle);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.DiamondFurnaceIdle), "DDD", "DFD", "DDD", 'D', Items.diamond, 'F', BlocksandItems.GoldFurnaceIdle);
		
		//InstaBlocks
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BlockHouse), " K ", "KPK", " K ", 'K', BlocksandItems.Kryptonite, 'P', Blocks.planks);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.GigaHouse), "KWK", "WWW", "KWK", 'K', BlocksandItems.Kryptonite, 'W', Blocks.planks);
		
		//Sapphire
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BlockSapphire), "III", "III", "III", 'I', BlocksandItems.SapphireIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.SapphireIngot, 9), "I", 'I', BlocksandItems.BlockSapphire);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.SwordSapphire), "I", "I", "S", 'I', BlocksandItems.SapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.PickaxeSapphire), "III", " S ", " S ", 'I', BlocksandItems.SapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.HoeSapphire), "II ", " S ", " S ", 'I', BlocksandItems.SapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.AxeSapphire), "II ", "IS ", " S ", 'I', BlocksandItems.SapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.ShovelSapphire), "I", "S", "S", 'I', BlocksandItems.SapphireIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.SapphireHelmet), "III", "I I", 'I', BlocksandItems.SapphireIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.SapphireChestplate), "I I", "III", "III", 'I', BlocksandItems.SapphireIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.SapphireLegs), "III", "I I", "I I", 'I', BlocksandItems.SapphireIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.SapphireBoots), "I I", "I I", 'I', BlocksandItems.SapphireIngot);
		
		//Ruby
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.RubyBlock), "III", "III", "III", 'I', BlocksandItems.RubyIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.RubyIngot, 9), "I", 'I', BlocksandItems.RubyBlock);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.SwordRuby), "I", "I", "S", 'I', BlocksandItems.RubyIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.PickaxeRuby), "III", " S ", " S ", 'I', BlocksandItems.RubyIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.HoeRuby), "II ", " S ", " S ", 'I', BlocksandItems.RubyIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.AxeRuby), "II ", "IS "," S ", 'I', BlocksandItems.RubyIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.ShovelRuby), " I ", " S ", " S ", 'I', BlocksandItems.RubyIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.RubyHelmet), "III", "I I", 'I', BlocksandItems.RubyIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.RubyChestplate), "I I", "III", "III", 'I', BlocksandItems.RubyIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.RubyLegs), "III", "I I", "I I", 'I', BlocksandItems.RubyIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.RubyBoots), "I I", "I I", 'I', BlocksandItems.RubyIngot);
		
		//Kryptonite
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.KryptoniteBlock), "III", "III", "III", 'I', BlocksandItems.Kryptonite);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.Kryptonite, 9), "I", 'I', BlocksandItems.KryptoniteBlock);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.AxeKryptonite), "II ", "IS ", " S ", 'I', BlocksandItems.Kryptonite, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.ShovelKryptonite), "I", "S", "S", 'I', BlocksandItems.Kryptonite, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.PickaxeKryptonite), "III", " S ", " S ", 'I', BlocksandItems.Kryptonite, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.SwordKryptonite), " I ", " I ", " S ", 'I', BlocksandItems.Kryptonite, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.KryptoniteBoots), "I I", "I I", 'I', BlocksandItems.Kryptonite);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.KryptoniteLegs), "III", "I I", "I I", 'I', BlocksandItems.Kryptonite);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.KryptoniteChestplate), "I I", "III", "III", 'I', BlocksandItems.Kryptonite);
		
		//Copper
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BlockCopper), "CCC", "CCC", "CCC", 'C', BlocksandItems.CopperIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.CopperIngot, 9), "C", 'C', BlocksandItems.BlockCopper);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.CopperWire), "   ", "CCC", "   ", 'C', BlocksandItems.CopperIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.SwordCopper), " C ", " C ", " S ", 'C', BlocksandItems.CopperIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.AxeCopper), "CC ", "CS ", " S ", 'C', BlocksandItems.CopperIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.ShovelCopper), " C ", " S ", " S ", 'C', BlocksandItems.CopperIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.HoeCopper), "CC ", " S ", " S ", 'C', BlocksandItems.CopperIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.PickaxeCopper), "CCC", " S ", " S ", 'C', BlocksandItems.CopperIngot, 'S', Items.stick);
		
		//Iron Man Armor Items
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.GoldTitaniumAlloy, 3), "GGG", "GTG", "GGG", 'G', Items.gold_ingot, 'T', BlocksandItems.TitaniumAlloy);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.IMRocket), "   ", "FTF", "FTF", 'F', Items.firework_charge, 'T', BlocksandItems.TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.TitaniumAlloy, 4), "TTT", "TTT", 'T', BlocksandItems.TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.AdvancedBooster), "   ", "RGR", "C C", 'R', BlocksandItems.IMRocket, 'G', BlocksandItems.GoldTitaniumAlloy, 'C', BlocksandItems.CopperWire);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.PalladiumCore), "FFF", "DFD", "FFF", 'F', BlocksandItems.PalladiumFragment, 'D', Items.diamond);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.PalladiumArc), "FFF", "FPF", "FFF", 'F', BlocksandItems.PalladiumFragment, 'P', BlocksandItems.PalladiumCore);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.IMScreen), "GGG", "GGG", "GGG", 'G', Blocks.glass);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.IMHelmet), "PSP", "PSP", "G  ", 'P', BlocksandItems.TitaniumPlate, 'S', BlocksandItems.IMScreen, 'G', BlocksandItems.GoldTitaniumAlloy);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.IMChestplate), "G G", "GPG", "GGG", 'G', BlocksandItems.GoldTitaniumAlloy, 'P', BlocksandItems.PalladiumArc);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.IMLegs), "PPP", "G G", "G G", 'P', BlocksandItems.TitaniumPlate, 'G', BlocksandItems.GoldTitaniumAlloy);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.IMBoots), "   ", "A A", "B B", 'A', BlocksandItems.GoldTitaniumAlloy, 'B', BlocksandItems.AdvancedBooster);
		
		//Titanium
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BlockTitanium), "TTT", "TTT", "TTT", 'T', BlocksandItems.TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.TitaniumIngot, 9), "T", 'T', BlocksandItems.BlockTitanium);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.SwordTitanium), " T ", " T ", " S ", 'T', BlocksandItems.TitaniumIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.AxeTitanium), "TT ", "TS ", " S ", 'T', BlocksandItems.TitaniumIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.ShovelTitanium), " T ", " S ", " S ", 'T', BlocksandItems.TitaniumIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.PickaxeTitanium), "TTT", " S ", " S ", 'T', BlocksandItems.TitaniumIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.HoeTitanium), "TT ", " S ", " S ", 'T', BlocksandItems.HoeTitanium, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.TitaniumHelmet), "TTT", "T T", 'T', BlocksandItems.TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.TitaniumChestplate), "T T", "TTT", "TTT", 'T', BlocksandItems.TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.TitaniumLegs), "TTT", "T T", "T T", 'T', BlocksandItems.TitaniumIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.TitaniumBoots), "T T", "T T", 'T', BlocksandItems.TitaniumIngot);
		
		//Bronze
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BronzeIngot), "C", "T", 'C', BlocksandItems.CopperIngot, 'T', BlocksandItems.TinIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BronzeIngot, 9), "B", 'B', BlocksandItems.BlockBronze);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BlockBronze), "BBB", "BBB", "BBB", 'B', BlocksandItems.BronzeIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.AxeBronze), "BB ", "BS ", " S ", 'B', BlocksandItems.BronzeIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.ShovelBronze), " B ", " S ", " S ", 'B', BlocksandItems.BronzeIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.SwordBronze), " B ", " B ", " S ", 'B', BlocksandItems.BronzeIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.HoeBronze), "BB ", " S ", " S ", 'B', BlocksandItems.BronzeIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.PickaxeBronze), "BBB", " S ", " S ", 'B', BlocksandItems.BronzeIngot, 'S', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BronzeHelmet), "BBB", "B B", 'B', BlocksandItems.BronzeIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BronzeChestplate), "B B", "BBB", "BBB", 'B', BlocksandItems.BronzeIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BronzeLegs), "BBB", "B B", "B B", 'B', BlocksandItems.BronzeIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BronzeBoots), "B B", "B B", 'B', BlocksandItems.BronzeIngot);
		
		//Tin
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.BlockTin), "TTT", "TTT", "TTT", 'T', BlocksandItems.TinIngot);
		GameRegistry.addShapedRecipe(new ItemStack(BlocksandItems.TinIngot), "T", 'T', BlocksandItems.BlockTin);
		
		}
	
	public static void addSmeltingRecipes(){
		
		//Sapphire
		GameRegistry.addSmelting(BlocksandItems.SapphireOre, new ItemStack(BlocksandItems.SapphireIngot, 1), 10.0F);
		//Ruby
		GameRegistry.addSmelting(BlocksandItems.RubyOre, new ItemStack(BlocksandItems.RubyIngot, 1), 8.0F);
		//Kryptonite
		GameRegistry.addSmelting(BlocksandItems.KryptoniteOre, new ItemStack(BlocksandItems.Kryptonite, 1), 14.0F);
		//Copper
		GameRegistry.addSmelting(BlocksandItems.CopperOre, new ItemStack(BlocksandItems.CopperIngot, 1), 5.0F);
		//Titanium
		GameRegistry.addSmelting(BlocksandItems.TitaniumOre, new ItemStack(BlocksandItems.TitaniumIngot, 1), 5.0F);
		//Tin
		GameRegistry.addSmelting(BlocksandItems.TinOre, new ItemStack(BlocksandItems.TinIngot), 4.0F);
	}

}
