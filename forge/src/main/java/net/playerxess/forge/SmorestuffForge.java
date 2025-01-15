package net.playerxess.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.playerxess.smorestuff.SmoreStuff;

@Mod(SmoreStuff.MOD_ID)
public final class SmorestuffForge {
    public SmorestuffForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(SmoreStuff.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        SmoreStuff.init();
    }
}
