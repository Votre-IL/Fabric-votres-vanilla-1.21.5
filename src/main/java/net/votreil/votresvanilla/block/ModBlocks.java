package net.votreil.votresvanilla.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.votreil.votresvanilla.VotresVanilla;

public class ModBlocks {

    public static final Block CUT_ANDESITE = registerBlock("cut_andesite",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "cut_andesite")))
                    .mapColor(MapColor.STONE_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block GRASSY_DIRT = registerBlock("grassy_dirt",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "grassy_dirt")))
                    .mapColor(MapColor.DIRT_BROWN)
                    .strength(0.5f)
                    .sounds(BlockSoundGroup.GRAVEL)));
    public static final Block FINE_BLACK_GLAZED_TERRACOTTA = registerBlock("fine_black_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_black_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_BLUE_GLAZED_TERRACOTTA = registerBlock("fine_blue_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_blue_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_BROWN_GLAZED_TERRACOTTA = registerBlock("fine_brown_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_brown_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_CYAN_GLAZED_TERRACOTTA = registerBlock("fine_cyan_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_cyan_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_GRAY_GLAZED_TERRACOTTA = registerBlock("fine_gray_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_gray_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_GREEN_GLAZED_TERRACOTTA = registerBlock("fine_green_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_green_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_LIGHT_BLUE_GLAZED_TERRACOTTA = registerBlock("fine_light_blue_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_light_blue_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_LIGHT_GRAY_GLAZED_TERRACOTTA = registerBlock("fine_light_gray_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_light_gray_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_LIME_GLAZED_TERRACOTTA = registerBlock("fine_lime_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_lime_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_LIME)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_MAGENTA_GLAZED_TERRACOTTA = registerBlock("fine_magenta_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_magenta_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_ORANGE_GLAZED_TERRACOTTA = registerBlock("fine_orange_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_orange_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_PINK_GLAZED_TERRACOTTA = registerBlock("fine_pink_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_pink_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_PURPLE_GLAZED_TERRACOTTA = registerBlock("fine_purple_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_purple_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_RED_GLAZED_TERRACOTTA = registerBlock("fine_red_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_red_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_WHITE_GLAZED_TERRACOTTA = registerBlock("fine_white_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_white_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block FINE_YELLOW_GLAZED_TERRACOTTA = registerBlock("fine_yellow_glazed_terracotta",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VotresVanilla.MOD_ID, "fine_yellow_glazed_terracotta")))
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.25f, 4.2f)
                    .sounds(BlockSoundGroup.STONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VotresVanilla.MOD_ID, name), block);
    }
    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(VotresVanilla.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VotresVanilla.MOD_ID, name)))
                        .useBlockPrefixedTranslationKey()));
    }
    public static void registerModBlocks() {
        VotresVanilla.LOGGER.info("Registering Mod Blocks for "+ VotresVanilla.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(CUT_ANDESITE);
            entries.add(FINE_BLACK_GLAZED_TERRACOTTA);
            entries.add(FINE_BLUE_GLAZED_TERRACOTTA);
            entries.add(FINE_BROWN_GLAZED_TERRACOTTA);
            entries.add(FINE_CYAN_GLAZED_TERRACOTTA);
            entries.add(FINE_GREEN_GLAZED_TERRACOTTA);
            entries.add(FINE_LIGHT_BLUE_GLAZED_TERRACOTTA);
            entries.add(FINE_LIGHT_GRAY_GLAZED_TERRACOTTA);
            entries.add(FINE_LIME_GLAZED_TERRACOTTA);
            entries.add(FINE_MAGENTA_GLAZED_TERRACOTTA);
            entries.add(FINE_ORANGE_GLAZED_TERRACOTTA);
            entries.add(FINE_PINK_GLAZED_TERRACOTTA);
            entries.add(FINE_PURPLE_GLAZED_TERRACOTTA);
            entries.add(FINE_RED_GLAZED_TERRACOTTA);
            entries.add(FINE_WHITE_GLAZED_TERRACOTTA);
            entries.add(FINE_YELLOW_GLAZED_TERRACOTTA);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(GRASSY_DIRT);
        });
    }
}
