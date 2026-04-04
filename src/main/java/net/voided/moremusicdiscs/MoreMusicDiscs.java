package net.voided.moremusicdiscs;

import net.fabricmc.api.ModInitializer;

import net.voided.moremusicdiscs.item.ModItemGroups;
import net.voided.moremusicdiscs.item.ModItems;
import net.voided.moremusicdiscs.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMusicDiscs implements ModInitializer {
	public static final String MOD_ID = "moremusicdiscs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModSounds.registerSounds();
	}
}