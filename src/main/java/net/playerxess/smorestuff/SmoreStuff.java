package net.playerxess.smorestuff;

import net.fabricmc.api.ModInitializer;
import net.playerxess.smorestuff.item.ModItemGroups;
import net.playerxess.smorestuff.item.ModItems;
import net.playerxess.smorestuff.block.ModBlocks;
import net.playerxess.smorestuff.fluid.ModFluids;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmoreStuff implements ModInitializer {
	public static final String MOD_ID = "smorestuff";
	public static final Logger LOGGER = LoggerFactory.getLogger("Smorestuff");

	@Override
	public void onInitialize() {

		SmoreStuff.LOGGER.info("Hello From Smorestuff! Thank You For Downloading And Enjoy!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFluids.registerModFluids();
	}
}
