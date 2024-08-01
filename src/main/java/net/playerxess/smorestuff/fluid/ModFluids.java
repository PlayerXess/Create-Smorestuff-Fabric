package net.playerxess.smorestuff.fluid;


import net.playerxess.smorestuff.SmoreStuff;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;


public class ModFluids {
    public static final FlowableFluid MARSHMALLOW_STILL = register("still_liquid_marshmallow", new LiquidMarshmallow.Still());
    public static final FlowableFluid MARSHMALLOW_FLOWING = register("flowing_liquid_marshmallow", new LiquidMarshmallow.Flowing());


    private static FlowableFluid register(String name, FlowableFluid flowableFluid) {
        return Registry.register(Registries.FLUID, new Identifier(SmoreStuff.MOD_ID, name), flowableFluid);
    }

	public static void registerModFluids() {
        SmoreStuff.LOGGER.info(("Registering Fluids For Mod Create: Smorestuff"));
    }
}


