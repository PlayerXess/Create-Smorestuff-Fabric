package net.playerxess.smorestuff;

import net.fabricmc.api.ModInitializer;

import net.playerxess.smorestuff.item.ModItemGroups;
import net.playerxess.smorestuff.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmoreStuff implements ModInitializer {
	public static final String MOD_ID = "smorestuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}