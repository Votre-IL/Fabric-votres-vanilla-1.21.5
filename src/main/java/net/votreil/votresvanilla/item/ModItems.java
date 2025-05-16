package net.votreil.votresvanilla.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.votreil.votresvanilla.VotresVanilla;

public class ModItems {

    public static final Item EMERALD_SHARD = registerItem("emerald_shard", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VotresVanilla.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VotresVanilla.LOGGER.info("Registering Mod Itemps for" + VotresVanilla.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(EMERALD_SHARD);
        });
    }
}
