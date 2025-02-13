
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hardzombies.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.hardzombies.block.BlocksBlock;
import net.mcreator.hardzombies.HardZombiesMod;

public class HardZombiesModBlocks {
	public static Block BLOCKS;

	public static void load() {
		BLOCKS = register("blocks", new BlocksBlock());
	}

	public static void clientLoad() {
		BlocksBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HardZombiesMod.MODID, registryName), block);
	}
}
