package net.voided.moremusicdiscs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.voided.moremusicdiscs.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SHULK_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_18, Models.GENERATED);
        itemModelGenerator.register(ModItems.PILLAGED_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TALL_REMIX_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIRCH_BOP_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FORT_STRESS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEON_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHORUS_FRUIT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANTI_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHOCK_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WEIRD_REALM_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUSH_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MESA_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.REMNANT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.STORM_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADVENTURE_AWAITS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALL_FOR_ONE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANOTHER_DAY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.A_QUIET_PLACE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.AXOLOTL_PARADISE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEGINNING_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONQUEROR_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_CAVE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMPIRE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FINAL_STAGE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_RUSH_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAUNTED_MANSION_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HORIZONS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_OATH_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAST_HALLWAY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEW_WORLD_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGHTFALL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAKURA_VALLEY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_END_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TINY_PAWS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.VANISHED_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHISPERING_WOODS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_1K, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_5K, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALIVE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAD_OMEN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BELOW_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BREEZE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRUTE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CASCADE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CELEBRATION_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.COMET_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.GILDED_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLIDE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.GUARDIAN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HUSK_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHTNING_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUMINOUS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINESHAFT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.NO_ESCAPE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.NORTHERN_LIGHTS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.OCHRE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.OVERTUNE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.PUMPKIN_MUSIC_DISC, Models.GENERATED);
    }
}
