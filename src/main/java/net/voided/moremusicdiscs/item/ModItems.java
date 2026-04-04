package net.voided.moremusicdiscs.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.voided.moremusicdiscs.MoreMusicDiscs;
import net.voided.moremusicdiscs.sound.ModSounds;

public class ModItems {
    public static final Item SHULK_MUSIC_DISC = registerItem("shulk_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.SHULK_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item MUSIC_DISC_18 = registerItem("music_disc_18",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.KEY_18).maxCount(1).rarity(Rarity.RARE)));

    public static final Item PILLAGED_MUSIC_DISC = registerItem("pillaged_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.PILLAGED_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item TALL_REMIX_MUSIC_DISC = registerItem("tall_remix_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.TALL_REMIX_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item BIRCH_BOP_MUSIC_DISC = registerItem("birch_bop_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.BIRCH_BOP_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item FORT_STRESS_MUSIC_DISC = registerItem("fort-stress_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.FORT_STRESS_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item NEON_MUSIC_DISC = registerItem("neon_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.NEON_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item CHORUS_FRUIT_MUSIC_DISC = registerItem("chorus_fruit_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.CHORUS_FRUIT_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item ANTI_MUSIC_DISC = registerItem("anti_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ANTI_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item SHOCK_MUSIC_DISC = registerItem("shock_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.SHOCK_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item ICE_MUSIC_DISC = registerItem("ice_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ICE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item WEIRD_REALM_MUSIC_DISC = registerItem("weird_realm_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.WEIRD_REALM_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item LUSH_MUSIC_DISC = registerItem("lush_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.LUSH_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item MESA_MUSIC_DISC = registerItem("mesa_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MESA_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item REMNANT_MUSIC_DISC = registerItem("remnant_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.REMNANT_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item STORM_MUSIC_DISC = registerItem("storm_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.STORM_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item ADVENTURE_AWAITS_MUSIC_DISC = registerItem("adventure_awaits_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ADVENTURE_AWAITS_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item ALL_FOR_ONE_MUSIC_DISC = registerItem("all_for_one_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ALL_FOR_ONE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item ANOTHER_DAY_MUSIC_DISC = registerItem("another_day_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ANOTHER_DAY_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item A_QUIET_PLACE_MUSIC_DISC = registerItem("a_quiet_place_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.A_QUIET_PLACE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item AXOLOTL_PARADISE_MUSIC_DISC = registerItem("axolotl_paradise_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.AXOLOTL_PARADISE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item BEGINNING_MUSIC_DISC = registerItem("beginning_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.BEGINNING_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item CONQUEROR_MUSIC_DISC = registerItem("conqueror_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.CONQUEROR_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item DIAMOND_CAVE_MUSIC_DISC = registerItem("diamond_cave_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.DIAMOND_CAVE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item EMPIRE_MUSIC_DISC = registerItem("empire_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.EMPIRE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item FINAL_STAGE_MUSIC_DISC = registerItem("final_stage_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.FINAL_STAGE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item GOLD_RUSH_MUSIC_DISC = registerItem("gold_rush_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.GOLD_RUSH_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item HAUNTED_MANSION_MUSIC_DISC = registerItem("haunted_mansion_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.HAUNTED_MANSION_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item HORIZONS_MUSIC_DISC = registerItem("horizons_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.HORIZONS_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item IRON_OATH_MUSIC_DISC = registerItem("iron_oath_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.IRON_OATH_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item LAST_HALLWAY_MUSIC_DISC = registerItem("last_hallway_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.LAST_HALLWAY_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item NEW_WORLD_MUSIC_DISC = registerItem("new_world_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.NEW_WORLD_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item NIGHTFALL_MUSIC_DISC = registerItem("nightfall_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.NIGHTFALL_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item SAKURA_VALLEY_MUSIC_DISC = registerItem("sakura_valley_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.SAKURA_VALLEY_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item THE_END_MUSIC_DISC = registerItem("the_end_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.THE_END_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item TINY_PAWS_MUSIC_DISC = registerItem("tiny_paws_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.TINY_PAWS_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item VANISHED_MUSIC_DISC = registerItem("vanished_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.VANISHED_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item WHISPERING_WOODS_MUSIC_DISC = registerItem("whispering_woods_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.WHISPERING_WOODS_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item MUSIC_DISC_1K = registerItem("1k_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.KEY_1K).maxCount(1).rarity(Rarity.RARE)));

    public static final Item MUSIC_DISC_5K = registerItem("5k_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.KEY_5K).maxCount(1).rarity(Rarity.RARE)));

    public static final Item ALIVE_MUSIC_DISC = registerItem("alive_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ALIVE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item BAD_OMEN_MUSIC_DISC = registerItem("bad_omen_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.BAD_OMEN_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item BELOW_MUSIC_DISC = registerItem("below_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.BELOW_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item BREEZE_MUSIC_DISC = registerItem("breeze_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.BREEZE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item BRUTE_MUSIC_DISC = registerItem("brute_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.BRUTE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item CASCADE_MUSIC_DISC = registerItem("cascade_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.CASCADE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item CELEBRATION_MUSIC_DISC = registerItem("celebration_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.CELEBRATION_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item COMET_MUSIC_DISC = registerItem("comet_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.COMET_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item GILDED_MUSIC_DISC = registerItem("gilded_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.GILDED_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item GLIDE_MUSIC_DISC = registerItem("glide_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.GLIDE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item GUARDIAN_MUSIC_DISC = registerItem("guardian_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.GUARDIAN_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item HUSK_MUSIC_DISC = registerItem("husk_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.HUSK_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item LIGHTNING_MUSIC_DISC = registerItem("lightning_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.LIGHTNING_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item LUMINOUS_MUSIC_DISC = registerItem("luminous_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.LUMINOUS_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item MINESHAFT_MUSIC_DISC = registerItem("mineshaft_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MINESHAFT_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item NO_ESCAPE_MUSIC_DISC = registerItem("no_escape_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.NO_ESCAPE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item NORTHERN_LIGHTS_MUSIC_DISC = registerItem("northern_lights_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.NORTHERN_LIGHTS_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item OCHRE_MUSIC_DISC = registerItem("ochre_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.OCHRE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item OVERTUNE_MUSIC_DISC = registerItem("overtune_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.OVERTUNE_KEY).maxCount(1).rarity(Rarity.RARE)));

    public static final Item PUMPKIN_MUSIC_DISC = registerItem("pumpkin_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.PUMPKIN_KEY).maxCount(1).rarity(Rarity.RARE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreMusicDiscs.MOD_ID, name), item);
    }

    public static void registerModItems() {

    }
}
