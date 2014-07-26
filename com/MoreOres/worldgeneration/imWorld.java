package com.MoreOres.worldgeneration;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.MoreOres.blocksitems.BlocksandItems;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class imWorld implements IWorldGenerator
{
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 0:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
        }
    }
    
    private void generateEnd(World world, Random random, int x, int z) {}
    
    private void generateSurface(World world, Random rand, int chunkX, int chunkZ){
		for (int i = 0; i < 5; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(40);
			int randPosZ = chunkZ + rand.nextInt(16);

			(new WorldGenMinable(BlocksandItems.TinOre, 5)).generate(world, rand, randPosX, randPosY, randPosZ);

		}
		
		for (int i = 0; i < 4; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(30);
			int randPosZ = chunkZ + rand.nextInt(16);

			(new WorldGenMinable(BlocksandItems.TitaniumOre, 5)).generate(world, rand, randPosX, randPosY, randPosZ);

		}
		
		for (int i = 0; i < 3; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(30);
			int randPosZ = chunkZ + rand.nextInt(16);

			(new WorldGenMinable(BlocksandItems.PalladiumOre, 4)).generate(world, rand, randPosX, randPosY, randPosZ);

		}
		
		for (int i = 0; i < 5; i++){
			int randPosX = chunkX + rand.nextInt(16);
			int randPosY = rand.nextInt(40);
			int randPosZ = chunkZ + rand.nextInt(16);

			(new WorldGenMinable(BlocksandItems.CopperOre, 5)).generate(world, rand, randPosX, randPosY, randPosZ);

		}
	}

    private void generateNether(World world, Random rand, int i, int j) {


	}

    public static void mainRegistry(){
		initWorldGen();
	}

	public static void initWorldGen(){
		registerWorldGen(new imWorld(), 1);
	}

	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbabaility){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbabaility);
	}
}
