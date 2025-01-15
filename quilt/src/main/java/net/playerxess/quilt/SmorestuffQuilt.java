package net.playerxess.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import net.playerxess.fabriclike.SmorestuffFabricLike;

public final class SmorestuffQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run the Fabric-like setup.
        SmorestuffFabricLike.init();
    }
}
