package net.votreil.votresvanilla.components;

import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.votreil.votresvanilla.VotresVanilla;

import java.awt.*;
import java.util.function.UnaryOperator;

public class ModDataComponentTypes {

    private static <T>ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderUnaryOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(VotresVanilla.MOD_ID, name),
                builderUnaryOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentTypes() {
        VotresVanilla.LOGGER.info("Registering Data Component Types for " + VotresVanilla.MOD_ID);
    }
}
