package net.voided.moremusicdiscs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.voided.moremusicdiscs.MoreMusicDiscs;

public class ModItemGroups {
    public static final ItemGroup JAMIESNAME_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMusicDiscs.MOD_ID, "jamiesname_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SHULK_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.moremusicdiscs.jamiesname_discs_group"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.SHULK_MUSIC_DISC);
                      entries.add(ModItems.MUSIC_DISC_18);
                      entries.add(ModItems.PILLAGED_MUSIC_DISC);
                      entries.add(ModItems.TALL_REMIX_MUSIC_DISC);
                    }).build());

    public static final ItemGroup BLING_BLING_CHEESE_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMusicDiscs.MOD_ID, "bling_bling_cheese_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FORT_STRESS_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.moremusicdiscs.bling_bling_cheese_discs_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BIRCH_BOP_MUSIC_DISC);
                        entries.add(ModItems.FORT_STRESS_MUSIC_DISC);
                        entries.add(ModItems.NEON_MUSIC_DISC);
                    }).build());

    public static final ItemGroup CANER_CREBES_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMusicDiscs.MOD_ID, "caner_crebes_cheese_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHORUS_FRUIT_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.moremusicdiscs.caner_crebes_cheese_discs_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CHORUS_FRUIT_MUSIC_DISC);
                    }).build());

    public static final ItemGroup FIRCH_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMusicDiscs.MOD_ID, "firch_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ANTI_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.moremusicdiscs.firch_discs_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ANTI_MUSIC_DISC);
                    }).build());

    public static final ItemGroup MICKEYSERBIA_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMusicDiscs.MOD_ID, "mickeyserbia_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SHOCK_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.moremusicdiscs.mickeyserbia_discs_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SHOCK_MUSIC_DISC);
                    }).build());

    public static final ItemGroup THATMUSICALSPARROW_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMusicDiscs.MOD_ID, "thatmusicalsparrow_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ICE_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.moremusicdiscs.thatmusicalsparrow_discs_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ICE_MUSIC_DISC);
                    }).build());

    public static final ItemGroup TOASTDOT_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMusicDiscs.MOD_ID, "toastdot_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.WEIRD_REALM_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.moremusicdiscs.toastdot_discs_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WEIRD_REALM_MUSIC_DISC);
                    }).build());

    public static final ItemGroup THAETAA_TERRAAINN_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMusicDiscs.MOD_ID, "thaetaa_terraainn_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LUSH_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.moremusicdiscs.thaetaa_terraainn_discs_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LUSH_MUSIC_DISC);
                        entries.add(ModItems.MESA_MUSIC_DISC);
                        entries.add(ModItems.REMNANT_MUSIC_DISC);
                        entries.add(ModItems.STORM_MUSIC_DISC);
                    }).build());

    public static final ItemGroup LAUDIVIDNI_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMusicDiscs.MOD_ID, "laudividni_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ADVENTURE_AWAITS_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.moremusicdiscs.laudividni_discs_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ADVENTURE_AWAITS_MUSIC_DISC);
                        entries.add(ModItems.ALL_FOR_ONE_MUSIC_DISC);
                        entries.add(ModItems.ANOTHER_DAY_MUSIC_DISC);
                        entries.add(ModItems.A_QUIET_PLACE_MUSIC_DISC);
                        entries.add(ModItems.AXOLOTL_PARADISE_MUSIC_DISC);
                        entries.add(ModItems.BEGINNING_MUSIC_DISC);
                        entries.add(ModItems.CELEBRATION_MUSIC_DISC);
                        entries.add(ModItems.CONQUEROR_MUSIC_DISC);
                        entries.add(ModItems.DIAMOND_CAVE_MUSIC_DISC);
                        entries.add(ModItems.EMPIRE_MUSIC_DISC);
                        entries.add(ModItems.FINAL_STAGE_MUSIC_DISC);
                        entries.add(ModItems.GOLD_RUSH_MUSIC_DISC);
                        entries.add(ModItems.HAUNTED_MANSION_MUSIC_DISC);
                        entries.add(ModItems.HORIZONS_MUSIC_DISC);
                        entries.add(ModItems.IRON_OATH_MUSIC_DISC);
                        entries.add(ModItems.LAST_HALLWAY_MUSIC_DISC);
                        entries.add(ModItems.NEW_WORLD_MUSIC_DISC);
                        entries.add(ModItems.NIGHTFALL_MUSIC_DISC);
                        entries.add(ModItems.SAKURA_VALLEY_MUSIC_DISC);
                        entries.add(ModItems.THE_END_MUSIC_DISC);
                        entries.add(ModItems.TINY_PAWS_MUSIC_DISC);
                        entries.add(ModItems.VANISHED_MUSIC_DISC);
                        entries.add(ModItems.WHISPERING_WOODS_MUSIC_DISC);
                    }).build());

    public static final ItemGroup T_EN_M_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreMusicDiscs.MOD_ID, "t_en_m_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BREEZE_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.moremusicdiscs.t_en_m_discs_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MUSIC_DISC_1K);
                        entries.add(ModItems.MUSIC_DISC_5K);
                        entries.add(ModItems.ALIVE_MUSIC_DISC);
                        entries.add(ModItems.BAD_OMEN_MUSIC_DISC);
                        entries.add(ModItems.BELOW_MUSIC_DISC);
                        entries.add(ModItems.BREEZE_MUSIC_DISC);
                        entries.add(ModItems.BRUTE_MUSIC_DISC);
                        entries.add(ModItems.CASCADE_MUSIC_DISC);
                        entries.add(ModItems.COMET_MUSIC_DISC);
                        entries.add(ModItems.GILDED_MUSIC_DISC);
                        entries.add(ModItems.GLIDE_MUSIC_DISC);
                        entries.add(ModItems.GUARDIAN_MUSIC_DISC);
                        entries.add(ModItems.HUSK_MUSIC_DISC);
                        entries.add(ModItems.LIGHTNING_MUSIC_DISC);
                        entries.add(ModItems.LUMINOUS_MUSIC_DISC);
                        entries.add(ModItems.MINESHAFT_MUSIC_DISC);
                        entries.add(ModItems.NO_ESCAPE_MUSIC_DISC);
                        entries.add(ModItems.NORTHERN_LIGHTS_MUSIC_DISC);
                        entries.add(ModItems.OCHRE_MUSIC_DISC);
                        entries.add(ModItems.OVERTUNE_MUSIC_DISC);
                        entries.add(ModItems.PUMPKIN_MUSIC_DISC);
                        entries.add(ModItems.RAIDERS_MUSIC_DISC);
                        entries.add(ModItems.SHRIEKER_MUSIC_DISC);
                        entries.add(ModItems.SHULKER_MUSIC_DISC);
                        entries.add(ModItems.SNOWSTORM_MUSIC_DISC);
                        entries.add(ModItems.STRIDE_MUSIC_DISC);
                        entries.add(ModItems.THE_ENDER_DRAGON_MUSIC_DISC);
                        entries.add(ModItems.THE_WITHER_MUSIC_DISC);
                        entries.add(ModItems.THUNDERSTORM_MUSIC_DISC);
                        entries.add(ModItems.TUNDRA_MUSIC_DISC);
                        entries.add(ModItems.WARDEN_RUN_MUSIC_DISC);
                    }).build());

    public static void registerItemGroups() {

    }
}
