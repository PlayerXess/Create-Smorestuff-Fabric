package net.playerxess.smorestuff.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.SmoreStuff;
import net.playerxess.smorestuff.fluid.ModFluids;
import net.playerxess.smorestuff.fluid.LiquidMarshmallow;

public class ModBlocks {

	public static final Block LIQUID_MARSHMALLOW = register(new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS).liquid()),"liquid_marshmallow",true);





	public static Block register(Block block, String name, boolean shouldRegisterItem) {

		Identifier id = new Identifier(SmoreStuff.MOD_ID, name);

		if (shouldRegisterItem) {
			BlockItem blockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, blockItem);
		}

		return Registry.register(Registries.BLOCK, id, block);
	}

	public static void registerModBlocks() {
        SmoreStuff.LOGGER.info(("Registering Blocks For Mod Create: Smorestuff"));

    }

}
