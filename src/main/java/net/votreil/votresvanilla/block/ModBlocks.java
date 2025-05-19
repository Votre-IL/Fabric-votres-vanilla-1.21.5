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
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(GRASSY_DIRT);
        });
    }
}
