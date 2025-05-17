package net.votreil.votresvanilla.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.votreil.votresvanilla.VotresVanilla;

public class ModItems {

    public static final Item COPPER_HORN = registerItem("copper_horn",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VotresVanilla.MOD_ID, "copper_horn")))));
    public static final Item EMERALD_SHARD = registerItem("emerald_shard",
            new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VotresVanilla.MOD_ID, "emerald_shard")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VotresVanilla.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VotresVanilla.LOGGER.info("Registering Mod Items for " + VotresVanilla.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(COPPER_HORN);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(EMERALD_SHARD);
        });

    }
}
