package net.votreil.votresvanilla;

import net.fabricmc.api.ModInitializer;

import net.votreil.votresvanilla.block.ModBlocks;
import net.votreil.votresvanilla.components.ModDataComponentTypes;
import net.votreil.votresvanilla.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VotresVanilla implements ModInitializer {
	public static final String MOD_ID = "votresvanilla";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModDataComponentTypes.registerDataComponentTypes();
	}
}