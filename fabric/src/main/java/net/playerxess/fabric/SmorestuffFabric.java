package net.playerxess.fabric;

import net.fabricmc.api.ModInitializer;

import net.playerxess.fabriclike.SmorestuffFabricLike;

public final class SmorestuffFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run the Fabric-like setup.
        SmorestuffFabricLike.init();
    }
}
