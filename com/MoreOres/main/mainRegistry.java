package com.MoreOres.main;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

import com.MoreOres.blocks.Gui.GuiHandler;
import com.MoreOres.blocksitems.BlocksandItems;
import com.MoreOres.lib.References;
import com.MoreOres.worldgeneration.KryptoniteWorld;
import com.MoreOres.worldgeneration.RubyWorld;
import com.MoreOres.worldgeneration.SapphireWorld;
import com.MoreOres.worldgeneration.imWorld;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class mainRegistry 
{
	//Proxy
	@SidedProxy(clientSide = References.PROXYCLIENT, serverSide = References.PROXYCOMMON)
	public static CommonProxy proxy;
	
	
	
	@Metadata
	public static ModMetadata meta;
	
	@Instance("MoreOresMod")
	public static mainRegistry instance;
	
	public static Achievement achievementSapphire;
	public static Achievement achievementSapphirePickaxe;
	
	public static Achievement achievementRuby;
	public static Achievement achievementRubyPickaxe;
	
	public static Achievement achievementKryptonite;
	public static Achievement achievementKryptonitePickaxe;
	
	
	@EventHandler
	public void PreLoad(FMLPreInitializationEvent PreEvent)
	{
		
		BlocksandItems.mainRegistry();
		SapphireWorld.mainRegistry();
		KryptoniteWorld.mainRegistry();
		RubyWorld.mainRegistry();
		imWorld.mainRegistry();
		CraftingManager.MainClass();
		
	
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		/*NetworkRegistry.INSTANCE.registerGuiHandler(this, new KryptoniteFurnaceGuiHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new RedstoneFurnaceGuiHandler());*/

	}
	
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderers();
		
		achievementSapphire = new Achievement("achievement.mineSapphire", "mineSapphire", 0, 0, new ItemStack(BlocksandItems.SapphireIngot), (Achievement)null).initIndependentStat().registerStat();
		achievementSapphirePickaxe = new Achievement("achievement.craftSapphirePickaxe", "craftSapphirePick", 2, 1, BlocksandItems.PickaxeSapphire, achievementSapphire).registerStat();
		
		achievementRuby = new Achievement("achievement.mineRuby", "mineRuby", 0, 0, new ItemStack(BlocksandItems.RubyIngot), (Achievement)null).initIndependentStat().registerStat();
		achievementRubyPickaxe = new Achievement("achievement.craftRubyPickaxe", "craftRubyPick", 2, 1, BlocksandItems.PickaxeRuby, achievementRuby).registerStat();
		
		achievementKryptonite = new Achievement("achievement.mineKryptonite", "mineKryptonite", 0, 0, new ItemStack(BlocksandItems.Kryptonite), (Achievement)null).initIndependentStat().registerStat();
		achievementKryptonitePickaxe = new Achievement("achievement.craftKryptonitePickaxe", "craftKryptonitePick", 2, 1, BlocksandItems.PickaxeKryptonite, achievementKryptonite).registerStat();
		
		AchievementPage.registerAchievementPage(new AchievementPage("Sapphire Achievements", new Achievement[]{achievementSapphire, achievementSapphirePickaxe}));
		AchievementPage.registerAchievementPage(new AchievementPage("Ruby Achievements", new Achievement[]{achievementRuby, achievementRubyPickaxe}));
		AchievementPage.registerAchievementPage(new AchievementPage("Kryptonite Achievements", new Achievement[]{achievementKryptonite, achievementKryptonitePickaxe}));
		
		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
		
		FMLCommonHandler.instance().bus().register(new SapphireOnMineEvent());
		FMLCommonHandler.instance().bus().register(new SapphireOnCraftEvent());
		FMLCommonHandler.instance().bus().register(new RubyOnMineEvent());
		FMLCommonHandler.instance().bus().register(new RubyOnCraftEvent());
		FMLCommonHandler.instance().bus().register(new KryptoniteOnMineEvent());
		FMLCommonHandler.instance().bus().register(new KryptoniteOnCraftEvent());
	}
	
	
	@EventHandler
	public void PostLoad(FMLPostInitializationEvent PostEvent)
	{
		
	}
	
	
	
	

}
