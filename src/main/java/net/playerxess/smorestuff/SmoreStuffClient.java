package net.playerxess.smorestuff;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.fluid.ModFluids;

public class SmoreStuffClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MARSHMALLOW_STILL, ModFluids.MARSHMALLOW_FLOWING,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xFFFFFF
                ));
    }
}
