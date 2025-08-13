package net.votreil.votresvanilla;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.votreil.votresvanilla.block.ModBlocks;

@Environment(EnvType.CLIENT)
public class VotresVanillaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex)
                        -> 0x3495eb, ModBlocks.GRASSY_DIRT);

    }
}