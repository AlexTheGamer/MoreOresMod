package com.MoreOres.blocksitems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.MoreOres.blocks.tileEntity.DiamondFurnaceTileEntity;
import com.MoreOres.blocks.tileEntity.GoldFurnaceTileEntity;
import com.MoreOres.blocks.tileEntity.IronFurnaceTileEntity;
import com.MoreOres.blocks.tileEntity.KryptoniteFurnaceTileEntity;
import com.MoreOres.blocks.tileEntity.RedstoneFurnaceTileEntity;
import com.MoreOres.lib.References;
import com.MoreOres.main.mainRegistry;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlocksandItems {
	
	public static CreativeTabs moreOresTab = new CreativeTabs("MoreOres"){
		public Item getTabIconItem(){
		return RubyIngot;
	}
	};
	
	 public static ToolMaterial enumToolMaterialRuby = EnumHelper.addToolMaterial("RUBY", 3, 2000, 10.0F, 4.0F, 30);
     public static ArmorMaterial enumArmorMaterialRuby = EnumHelper.addArmorMaterial("RUBY", 40, new int[] {4, 9, 7, 3}, 30);
     public static ToolMaterial enumToolMaterialSapphire = EnumHelper.addToolMaterial("SAPPHIRE", 3, 3000, 11.0F, 5.0F, 30);
     public static ArmorMaterial enumArmorMaterialSapphire = EnumHelper.addArmorMaterial("SAPPHIRE", 50, new int[] {5, 10, 8, 3}, 30);
     public static ToolMaterial enumToolMaterialKryptonite = EnumHelper.addToolMaterial("KRYPTONITE", 3, 4000, 13.0F, 6.0F, 30);
     public static ArmorMaterial enumArmorMaterialKryptonite = EnumHelper.addArmorMaterial("KRYPTONITE", 60, new int[] {6, 11, 9, 3}, 30);
     public static ArmorMaterial enumArmorMaterialIM = EnumHelper.addArmorMaterial("IM", 55, new int [] {7, 12, 10, 3}, 30);
     public static ToolMaterial enumToolMaterialTitanium = EnumHelper.addToolMaterial("TITANIUM", 2, 1750, 8.0F, 4.0F, 30);
     public static ArmorMaterial enumArmorMaterialTitanium = EnumHelper.addArmorMaterial("TITANIUM", 37, new int[] {3, 8, 6, 3}, 30);
     public static ToolMaterial enumToolMaterialCopper = EnumHelper.addToolMaterial("COPPER", 2, 1400, 6.0F, 3.0F, 30);
     public static ToolMaterial enumToolMaterialBronze = EnumHelper.addToolMaterial("BRONZE", 3, 1700, 7.0F, 4.0F, 30);
     public static ArmorMaterial enumArmorMaterialBronze = EnumHelper.addArmorMaterial("BRONZE", 35, new int[] {3, 7, 5, 3}, 30);
     
public static void mainRegistry(){
	initThings();
	registerThings();


}

//Gui
public static final int guiIDKryptoniteFurnace = 0;
public static final int guiIDRedstoneFurnace = 1;
public static final int guiIDIronFurnace = 2;
public static final int guiIDGoldFurnace = 3;
public static final int guiIDDiamondFurnace = 4;

//Furnaces
public static Block KryptoniteFurnaceIdle;
public static Block KryptoniteFurnaceActive;

public static Block RedstoneFurnaceIdle;
public static Block RedstoneFurnaceActive;

public static Block IronFurnaceIdle;
public static Block IronFurnaceActive;

public static Block GoldFurnaceIdle;
public static Block GoldFurnaceActive;

public static Block DiamondFurnaceIdle;
public static Block DiamondFurnaceActive;

//InstaBlocks
public static Block BlockHouse;
public static Block GigaHouse;

//Sapphire
public static Block SapphireOre;
public static Block BlockSapphire;
public static Item SapphireIngot;
public static Item SwordSapphire;
public static Item PickaxeSapphire;
public static Item AxeSapphire;
public static Item ShovelSapphire;
public static Item HoeSapphire;
public static Item SapphireHelmet;
public static Item SapphireChestplate;
public static Item SapphireLegs;
public static Item SapphireBoots;

//Ruby
public static Block RubyOre;
public static Block RubyBlock;
public static Item RubyIngot;
public static Item SwordRuby;
public static Item PickaxeRuby;
public static Item AxeRuby;
public static Item HoeRuby;
public static Item ShovelRuby;
public static Item RubyHelmet;
public static Item RubyChestplate;
public static Item RubyLegs;
public static Item RubyBoots;

//Kryptonite
public static Block KryptoniteOre;
public static Block KryptoniteBlock;
public static Item Kryptonite;
public static Item ShovelKryptonite;
public static Item AxeKryptonite;
public static Item PickaxeKryptonite;
public static Item SwordKryptonite;
public static Item KryptoniteChestplate;
public static Item KryptoniteLegs;
public static Item KryptoniteBoots;

//Copper
public static Block CopperOre;
public static Block BlockCopper;
public static Item CopperIngot;
public static Item CopperWire;
public static Item SwordCopper;
public static Item AxeCopper;
public static Item ShovelCopper;
public static Item HoeCopper;
public static Item PickaxeCopper;

//Titanium
public static Block TitaniumOre;
public static Block BlockTitanium;
public static Item TitaniumIngot;
public static Item GoldTitaniumAlloy;
public static Item TitaniumAlloy;
public static Item TitaniumPlate;
public static Item SwordTitanium;
public static Item AxeTitanium;
public static Item ShovelTitanium;
public static Item HoeTitanium;
public static Item PickaxeTitanium;
public static Item TitaniumHelmet;
public static Item TitaniumChestplate;
public static Item TitaniumLegs;
public static Item TitaniumBoots;

//Iron Man Stuff
public static Block PalladiumOre;
public static Item IMRepulsor;
public static Item IMRocket;
public static Item AdvancedBooster;
public static Item PalladiumFragment;
public static Item PalladiumCore;
public static Item PalladiumArc;
public static Item IMHelmet;
public static Item IMChestplate;
public static Item IMLegs;
public static Item IMBoots;
public static Item IMScreen;

//Tin
public static Block TinOre;
public static Item TinIngot;
public static Block BlockTin;

//Bronze
public static Item BronzeIngot;
public static Block BlockBronze;
public static Item AxeBronze;
public static Item ShovelBronze;
public static Item SwordBronze;
public static Item HoeBronze;
public static Item PickaxeBronze;
public static Item BronzeHelmet;
public static Item BronzeChestplate;
public static Item BronzeLegs;
public static Item BronzeBoots;

public static void initThings(){
	
	 RenderingRegistry.addNewArmourRendererPrefix("5");
	 
	 
	 //Furnaces
	    KryptoniteFurnaceIdle = new KryptoniteFurnace(false).setBlockName("KryptoniteFurnaceIdle").setCreativeTab(moreOresTab);
	    KryptoniteFurnaceActive = new KryptoniteFurnace(true).setBlockName("KryptoniteFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
	    
	    RedstoneFurnaceIdle = new RedstoneFurnace(false).setBlockName("RedstoneFurnaceIdle").setCreativeTab(moreOresTab);
	    RedstoneFurnaceActive = new RedstoneFurnace(true).setBlockName("RedstoneFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
	    
	    IronFurnaceIdle = new IronFurnace(false).setBlockName("IronFurnaceIdle").setCreativeTab(moreOresTab);
	    IronFurnaceActive = new IronFurnace(true).setBlockName("IronFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
	    
	    GoldFurnaceIdle = new GoldFurnace(false).setBlockName("GoldFurnaceIdle").setCreativeTab(moreOresTab);
	    GoldFurnaceActive = new GoldFurnace(true).setBlockName("GoldFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
	    
	    DiamondFurnaceIdle = new DiamondFurnace(false).setBlockName("DiamondFurnaceIdle").setCreativeTab(moreOresTab);
	    DiamondFurnaceActive = new DiamondFurnace(true).setBlockName("DiamondFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
	 
	 //InstaBlocks
	    BlockHouse = new BlockHouse(Material.rock).setHardness(1.0F).setBlockName("BlockHouse");
	    GigaHouse = new GigaHouse(Material.rock).setHardness(1.0F).setBlockName("GigaHouse");
	    
	 //Sapphire
		SapphireOre = new SapphireOre(Material.rock).setHardness(1.5F).setBlockName("SapphireOre").setCreativeTab(moreOresTab);
	    BlockSapphire = new BlockSapphire(Material.rock).setHardness(2.0F).setBlockName("SapphireBlock").setCreativeTab(moreOresTab);
		SapphireIngot = new SapphireIngot().setUnlocalizedName("SapphireIngot").setCreativeTab(moreOresTab);
		SwordSapphire = new SwordSapphire(enumToolMaterialSapphire).setUnlocalizedName("SwordSapphire").setCreativeTab(moreOresTab);
		PickaxeSapphire = new PickaxeSapphire(enumToolMaterialSapphire).setUnlocalizedName("PickaxeSapphire").setCreativeTab(moreOresTab);
		AxeSapphire = new AxeSapphire(enumToolMaterialSapphire).setUnlocalizedName("AxeSapphire").setCreativeTab(moreOresTab);
		ShovelSapphire = new ShovelSapphire(enumToolMaterialSapphire).setUnlocalizedName("ShovelSapphire").setCreativeTab(moreOresTab);
		HoeSapphire = new HoeSapphire(enumToolMaterialSapphire).setUnlocalizedName("HoeSapphire").setCreativeTab(moreOresTab);
		SapphireHelmet = new SapphireArmor(enumArmorMaterialSapphire, 5, 0).setUnlocalizedName("SapphireHelmet").setCreativeTab(moreOresTab);
		SapphireChestplate = new SapphireArmor(enumArmorMaterialSapphire, 5, 1).setUnlocalizedName("SapphireChestplate").setCreativeTab(moreOresTab);
		SapphireLegs = new SapphireArmor(enumArmorMaterialSapphire, 5, 2).setUnlocalizedName("SapphireLegs").setCreativeTab(moreOresTab);
		SapphireBoots = new SapphireArmor(enumArmorMaterialSapphire, 5, 3).setUnlocalizedName("SapphireBoots").setCreativeTab(moreOresTab);
		
	//Ruby
		RubyOre = new RubyOre(Material.rock).setHardness(1.5F).setBlockName("RubyOre").setCreativeTab(moreOresTab);
		RubyBlock = new RubyBlock(Material.rock).setHardness(2.0F).setBlockName("RubyBlock").setCreativeTab(moreOresTab);
		RubyIngot = new RubyIngot().setUnlocalizedName("RubyIngot").setCreativeTab(moreOresTab);
		SwordRuby = new SwordRuby(enumToolMaterialRuby).setUnlocalizedName("SwordRuby").setCreativeTab(moreOresTab);
		PickaxeRuby = new PickaxeRuby(enumToolMaterialRuby).setUnlocalizedName("PickaxeRuby").setCreativeTab(moreOresTab);
		AxeRuby = new AxeRuby(enumToolMaterialRuby).setUnlocalizedName("AxeRuby").setCreativeTab(moreOresTab);
		HoeRuby = new HoeRuby(enumToolMaterialRuby).setUnlocalizedName("HoeRuby").setCreativeTab(moreOresTab);
		ShovelRuby = new ShovelRuby(enumToolMaterialRuby).setUnlocalizedName("ShovelRuby").setCreativeTab(moreOresTab);
		RubyHelmet = new RubyArmor(enumArmorMaterialRuby, 5, 0).setUnlocalizedName("RubyHelmet").setCreativeTab(moreOresTab);
		RubyChestplate = new RubyArmor(enumArmorMaterialRuby, 5, 1).setUnlocalizedName("RubyChestplate").setCreativeTab(moreOresTab);
		RubyLegs = new RubyArmor(enumArmorMaterialRuby, 5, 2).setUnlocalizedName("RubyLegs").setCreativeTab(moreOresTab);
		RubyBoots = new RubyArmor(enumArmorMaterialRuby, 5, 3).setUnlocalizedName("RubyBoots").setCreativeTab(moreOresTab);
		
	//Kryptonite
		KryptoniteOre = new KryptoniteOre(Material.rock).setHardness(1.5F).setBlockName("KryptoniteOre").setCreativeTab(moreOresTab);
		Kryptonite = new Kryptonite().setUnlocalizedName("Kryptonite").setCreativeTab(moreOresTab);
		KryptoniteBlock = new KryptoniteBlock(Material.rock).setHardness(2.0F).setBlockName("KryptoniteBlock").setCreativeTab(moreOresTab);
		ShovelKryptonite = new ShovelKryptonite(enumToolMaterialKryptonite).setUnlocalizedName("KryptoniteShovel").setCreativeTab(moreOresTab);
		AxeKryptonite = new AxeKryptonite(enumToolMaterialKryptonite).setUnlocalizedName("KryptoniteAxe").setCreativeTab(moreOresTab);
		PickaxeKryptonite = new PickaxeKryptonite(enumToolMaterialKryptonite).setUnlocalizedName("KryptonitePickaxe").setCreativeTab(moreOresTab);
		SwordKryptonite = new SwordKryptonite(enumToolMaterialKryptonite).setUnlocalizedName("KryptoniteSword").setCreativeTab(moreOresTab);
		KryptoniteChestplate = new KryptoniteArmor(enumArmorMaterialKryptonite, 5, 1).setUnlocalizedName("KryptoniteChestplate").setCreativeTab(moreOresTab);
		KryptoniteLegs = new KryptoniteArmor(enumArmorMaterialKryptonite, 5, 2).setUnlocalizedName("KryptoniteLeggings").setCreativeTab(moreOresTab);
		KryptoniteBoots = new KryptoniteArmor(enumArmorMaterialKryptonite, 5, 3).setUnlocalizedName("KryptoniteBoots").setCreativeTab(moreOresTab);
		
	//Copper
		CopperOre = new CopperOre(Material.rock).setHardness(1.5F).setBlockName("CopperOre").setCreativeTab(moreOresTab);
		CopperIngot = new CopperIngot().setUnlocalizedName("CopperIngot").setCreativeTab(moreOresTab);
		CopperWire = new CopperWire().setUnlocalizedName("CopperWire").setCreativeTab(moreOresTab);
		SwordCopper = new SwordCopper(enumToolMaterialCopper).setUnlocalizedName("SwordCopper").setCreativeTab(moreOresTab);
		AxeCopper = new AxeCopper(enumToolMaterialCopper).setUnlocalizedName("AxeCopper").setCreativeTab(moreOresTab);
		ShovelCopper = new ShovelCopper(enumToolMaterialCopper).setUnlocalizedName("ShovelCopper").setCreativeTab(moreOresTab);
		HoeCopper = new HoeCopper(enumToolMaterialCopper).setUnlocalizedName("HoeCopper").setCreativeTab(moreOresTab);
		PickaxeCopper = new PickaxeCopper(enumToolMaterialCopper).setUnlocalizedName("PickaxeCopper").setCreativeTab(moreOresTab);
		BlockCopper = new BlockCopper(Material.rock).setHardness(2.0F).setBlockName("CopperBlock").setCreativeTab(moreOresTab);
		
	//Titanium
		TitaniumOre = new TitaniumOre(Material.rock).setHardness(1.5F).setBlockName("TitaniumOre").setCreativeTab(moreOresTab);
		TitaniumIngot = new TitaniumIngot().setUnlocalizedName("TitaniumIngot").setCreativeTab(moreOresTab);
		GoldTitaniumAlloy = new GoldTitaniumAlloy().setUnlocalizedName("GoldTitaniumAlloy").setCreativeTab(moreOresTab);
		TitaniumAlloy = new TitaniumAlloy().setUnlocalizedName("TitaniumAlloy").setCreativeTab(moreOresTab);
		TitaniumPlate = new TitaniumPlate().setUnlocalizedName("TitaniumPlate").setCreativeTab(moreOresTab);
		SwordTitanium = new SwordTitanium(enumToolMaterialTitanium).setUnlocalizedName("TitaniumSword").setCreativeTab(moreOresTab);
		AxeTitanium = new AxeTitanium(enumToolMaterialTitanium).setUnlocalizedName("TitaniumAxe").setCreativeTab(moreOresTab);
		ShovelTitanium = new ShovelTitanium(enumToolMaterialTitanium).setUnlocalizedName("TitaniumShovel").setCreativeTab(moreOresTab);
		HoeTitanium = new HoeTitanium(enumToolMaterialTitanium).setUnlocalizedName("TitaniumHoe").setCreativeTab(moreOresTab);
		PickaxeTitanium = new PickaxeTitanium(enumToolMaterialTitanium).setUnlocalizedName("TitaniumPickaxe").setCreativeTab(moreOresTab);
		BlockTitanium = new BlockTitanium(Material.rock).setHardness(2.0F).setBlockName("TitaniumBlock").setCreativeTab(moreOresTab);
		TitaniumHelmet = new TitaniumArmor(enumArmorMaterialTitanium, 5, 0).setUnlocalizedName("TitaniumHelmet").setCreativeTab(BlocksandItems.moreOresTab);
		TitaniumChestplate = new TitaniumArmor(enumArmorMaterialTitanium, 5, 1).setUnlocalizedName("TitaniumChestplate").setCreativeTab(BlocksandItems.moreOresTab);
		TitaniumLegs = new TitaniumArmor(enumArmorMaterialTitanium, 5, 2).setUnlocalizedName("TitaniumLeggings").setCreativeTab(BlocksandItems.moreOresTab);
		TitaniumBoots = new TitaniumArmor(enumArmorMaterialTitanium, 5, 3).setUnlocalizedName("TitaniumBoots").setCreativeTab(BlocksandItems.moreOresTab);
		
	//Iron Man Stuff
		IMRocket = new IMRocket().setUnlocalizedName("IMRocket").setCreativeTab(moreOresTab);
		AdvancedBooster = new AdvancedBooster().setUnlocalizedName("AdvancedBooster").setCreativeTab(moreOresTab);
		PalladiumOre = new PalladiumOre(Material.rock).setHardness(1.5F).setBlockName("PalladiumOre").setCreativeTab(moreOresTab);
		PalladiumFragment = new PalladiumFragment().setUnlocalizedName("PalladiumFragment").setCreativeTab(moreOresTab);
		PalladiumCore = new PalladiumCore().setUnlocalizedName("PalladiumCore").setCreativeTab(moreOresTab);
		PalladiumArc = new PalladiumArc().setUnlocalizedName("PalladiumArc").setCreativeTab(moreOresTab);
		IMHelmet = new IMArmor(enumArmorMaterialIM, 5, 0).setUnlocalizedName("IMHelmet").setCreativeTab(BlocksandItems.moreOresTab);
		IMChestplate = new IMArmor(enumArmorMaterialIM, 5, 1).setUnlocalizedName("IMChestplate").setCreativeTab(BlocksandItems.moreOresTab);
		IMLegs = new IMArmor(enumArmorMaterialIM, 5, 2).setUnlocalizedName("IMLegs").setCreativeTab(BlocksandItems.moreOresTab);
		IMBoots = new IMArmor(enumArmorMaterialIM, 5, 3).setUnlocalizedName("IMBoots").setCreativeTab(BlocksandItems.moreOresTab);
		IMScreen = new IMScreen().setUnlocalizedName("IMScreen");
		
	//Tin
		TinOre = new TinOre(Material.rock).setHardness(1.5F).setBlockName("TinOre").setCreativeTab(moreOresTab);
		TinIngot = new TinIngot().setUnlocalizedName("TinIngot").setCreativeTab(moreOresTab);
		BlockTin = new BlockTin(Material.rock).setHardness(2.0F).setBlockName("TinBlock").setCreativeTab(moreOresTab);
		
	//Bronze
		BronzeIngot = new BronzeIngot().setUnlocalizedName("BronzeIngot").setCreativeTab(moreOresTab);
		BlockBronze = new BlockBronze(Material.rock).setHardness(2.0F).setBlockName("BronzeBlock").setCreativeTab(moreOresTab);
		AxeBronze = new AxeBronze(enumToolMaterialBronze).setUnlocalizedName("BronzeAxe").setCreativeTab(moreOresTab);
		ShovelBronze = new ShovelBronze(enumToolMaterialBronze).setUnlocalizedName("BronzeShovel").setCreativeTab(moreOresTab);
		SwordBronze = new SwordBronze(enumToolMaterialBronze).setUnlocalizedName("BronzeSword").setCreativeTab(moreOresTab);
		HoeBronze = new HoeBronze(enumToolMaterialBronze).setUnlocalizedName("BronzeHoe").setCreativeTab(moreOresTab);
		PickaxeBronze = new PickaxeBronze(enumToolMaterialBronze).setUnlocalizedName("BronzePickaxe").setCreativeTab(moreOresTab);
		BronzeHelmet = new BronzeArmor(enumArmorMaterialBronze, 5, 0).setUnlocalizedName("BronzeHelmet").setCreativeTab(moreOresTab);
		BronzeChestplate = new BronzeArmor(enumArmorMaterialBronze, 5, 1).setUnlocalizedName("BronzeChestplate").setCreativeTab(moreOresTab);
		BronzeLegs = new BronzeArmor(enumArmorMaterialBronze, 5, 2).setUnlocalizedName("BronzeLegs").setCreativeTab(moreOresTab);
		BronzeBoots = new BronzeArmor(enumArmorMaterialBronze, 5, 3).setUnlocalizedName("BronzeBoots").setCreativeTab(moreOresTab);
	
    }

public static void registerThings(){
	
	//TileEntity
	GameRegistry.registerTileEntity(KryptoniteFurnaceTileEntity.class, "KryptoniteFurnaceTileEntity");
	
	GameRegistry.registerTileEntity(RedstoneFurnaceTileEntity.class, "RedstoneFurnaceTileEntity");
	
	GameRegistry.registerTileEntity(IronFurnaceTileEntity.class, "IronFurnaceTileEntity");
	
	GameRegistry.registerTileEntity(GoldFurnaceTileEntity.class,  "GoldFurnaceTileEntity");
	
	GameRegistry.registerTileEntity(DiamondFurnaceTileEntity.class, "DiamondFurnaceTileEntity");
	
	//Furnaces
	GameRegistry.registerBlock(KryptoniteFurnaceIdle, "KryptoniteFurnaceIdle");
	GameRegistry.registerBlock(KryptoniteFurnaceActive, "KryptoniteFurnaceActive");
	
	GameRegistry.registerBlock(RedstoneFurnaceIdle, "RedstoneFurnaceIdle");
	GameRegistry.registerBlock(RedstoneFurnaceActive, "RedstoneFurnaceActive");
	
	GameRegistry.registerBlock(IronFurnaceIdle, "IronFurnaceIdle");
	GameRegistry.registerBlock(IronFurnaceActive, "IronFurnaceActive");
	
	GameRegistry.registerBlock(GoldFurnaceIdle, "GoldFurnaceIdle");
	GameRegistry.registerBlock(GoldFurnaceActive, "GoldFurnaceActive");
	
	GameRegistry.registerBlock(DiamondFurnaceIdle, "DiamondFurnaceIdle");
	GameRegistry.registerBlock(DiamondFurnaceActive, "DiamondFurnaceActive");
	
	//InstaBlocks
	GameRegistry.registerBlock(BlockHouse, "BlockHouse");
	GameRegistry.registerBlock(GigaHouse, "GigaHouse");
	
	//Sapphire
	GameRegistry.registerBlock(SapphireOre, "SapphireOre");
	GameRegistry.registerBlock(BlockSapphire, "SapphireBlock");
	GameRegistry.registerItem(SapphireIngot, "SapphireIngot");
	GameRegistry.registerItem(SwordSapphire, "SwordSapphire");
	GameRegistry.registerItem(PickaxeSapphire, "PickaxeSapphire");
	GameRegistry.registerItem(AxeSapphire, "AxeSapphire");
	GameRegistry.registerItem(ShovelSapphire, "ShovelSapphire");
	GameRegistry.registerItem(HoeSapphire, "HoeSapphire");
	GameRegistry.registerItem(SapphireHelmet, "SapphireHelmet");
	GameRegistry.registerItem(SapphireChestplate, "SapphireChestplate");
	GameRegistry.registerItem(SapphireLegs, "SapphireLegs");
	GameRegistry.registerItem(SapphireBoots, "SapphireBoots");
	
	//Ruby
	GameRegistry.registerBlock(RubyOre, "RubyOre");
	GameRegistry.registerBlock(RubyBlock, "RubyBlock");
	GameRegistry.registerItem(RubyIngot, "RubyIngot");
	GameRegistry.registerItem(SwordRuby, "SwordRuby");
	GameRegistry.registerItem(PickaxeRuby, "PickaxeRuby");
	GameRegistry.registerItem(AxeRuby, "AxeRuby");
	GameRegistry.registerItem(HoeRuby, "HoeRuby");
	GameRegistry.registerItem(ShovelRuby, "ShovelRuby");
	GameRegistry.registerItem(RubyHelmet, "RubyHemet");
	GameRegistry.registerItem(RubyChestplate, "RubyChestplate");
	GameRegistry.registerItem(RubyLegs, "RubyLegs");
    GameRegistry.registerItem(RubyBoots, "RubyBoots");
    
    //Copper
	GameRegistry.registerBlock(CopperOre, "CopperOre");
	GameRegistry.registerBlock(BlockCopper, "CopperBlock");
    GameRegistry.registerItem(CopperIngot, "Copperingot");
    GameRegistry.registerItem(CopperWire, "CopperWire");
    GameRegistry.registerItem(SwordCopper, "CopperSword");
    GameRegistry.registerItem(AxeCopper, "CopperAxe");
    GameRegistry.registerItem(ShovelCopper, "CopperShovel");
    GameRegistry.registerItem(HoeCopper, "CopperHoe");
    GameRegistry.registerItem(PickaxeCopper, "CopperPickaxe");
    
    //Kryptonite
	GameRegistry.registerBlock(KryptoniteOre, "KryptoniteOre");
	GameRegistry.registerBlock(KryptoniteBlock, "KryptoniteBlock");
    GameRegistry.registerItem(Kryptonite, "Kryptonite");
    GameRegistry.registerItem(ShovelKryptonite, "KryptoniteShovel");
    GameRegistry.registerItem(AxeKryptonite, "KryptoniteAxe");
    GameRegistry.registerItem(PickaxeKryptonite, "KryptonitePickaxe");
    GameRegistry.registerItem(SwordKryptonite, "KryptoniteSword");
    GameRegistry.registerItem(KryptoniteChestplate, "KryptoniteChestplate");
    GameRegistry.registerItem(KryptoniteLegs, "KryptoniteLeggings");
    GameRegistry.registerItem(KryptoniteBoots, "KryptoniteBoots");
    
    //Titanium
	GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
	GameRegistry.registerBlock(BlockTitanium, "TitaniumBlock");
    GameRegistry.registerItem(TitaniumIngot, "TitaniumIngot");
    GameRegistry.registerItem(GoldTitaniumAlloy, "GoldTitaniumAlloy");
    GameRegistry.registerItem(TitaniumAlloy, "TitaniumAlloy");
    GameRegistry.registerItem(TitaniumPlate, "TitaniumPlate");
    GameRegistry.registerItem(SwordTitanium, "TitaniumSword");
    GameRegistry.registerItem(AxeTitanium, "TitaniumAxe");
    GameRegistry.registerItem(ShovelTitanium, "TitaniumShovel");
    GameRegistry.registerItem(HoeTitanium, "TitaniumHoe");
    GameRegistry.registerItem(PickaxeTitanium, "TitaniumPickaxe");
    GameRegistry.registerItem(TitaniumHelmet, "TitaniumHelmet");
    GameRegistry.registerItem(TitaniumChestplate, "TitaniumChestplate");
    GameRegistry.registerItem(TitaniumLegs, "TitaniumLeggings");
    GameRegistry.registerItem(TitaniumBoots, "TitaniumBoots");
    
    //Iron Man Stuff
	GameRegistry.registerBlock(PalladiumOre, "PalladiumOre");
    GameRegistry.registerItem(IMRocket, "IMRocket");
    GameRegistry.registerItem(AdvancedBooster, "AdvancedBooster");
    GameRegistry.registerItem(PalladiumFragment, "PalladiumFragment");
    GameRegistry.registerItem(PalladiumCore, "PalladiumCore");
    GameRegistry.registerItem(PalladiumArc, "PalladiumArc");
    GameRegistry.registerItem(IMHelmet, "IMHelmet");
    GameRegistry.registerItem(IMChestplate, "IMChestplate");
    GameRegistry.registerItem(IMLegs, "IMLegs");
    GameRegistry.registerItem(IMBoots, "IMBoots");
    GameRegistry.registerItem(IMScreen, "IMScreen");
    
    //Tin
	GameRegistry.registerBlock(TinOre, "TinOre");
    GameRegistry.registerItem(TinIngot, "TinIngot");
    GameRegistry.registerBlock(BlockTin, "BlockTin");
    
    //Bronze
    GameRegistry.registerItem(BronzeIngot, "BronzeIngot");
    GameRegistry.registerBlock(BlockBronze, "BronzeBlock");
    GameRegistry.registerItem(AxeBronze, "BronzeAxe");
    GameRegistry.registerItem(ShovelBronze, "BronzeShovel");
    GameRegistry.registerItem(SwordBronze, "BronzeSword");
    GameRegistry.registerItem(HoeBronze, "BronzeHoe");
    GameRegistry.registerItem(PickaxeBronze, "BronzePickaxe");
    GameRegistry.registerItem(BronzeHelmet, "BronzeHelmet");
    GameRegistry.registerItem(BronzeChestplate, "BronzeChestplate");
    GameRegistry.registerItem(BronzeLegs, "BronzeLeggings");
    GameRegistry.registerItem(BronzeBoots, "BronzeBoots");
}

}

	

