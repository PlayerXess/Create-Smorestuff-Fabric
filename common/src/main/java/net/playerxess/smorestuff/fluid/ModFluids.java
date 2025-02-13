package net.playerxess.smorestuff.fluid;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.SmoreStuff;

public class ModFluids {

    public static FlowableFluid MARSHMALLOW_STILL;
    public static FlowableFluid MARSHMALLOW_FLOWING;
    public static Block FLUID_MARSHMALLOW;
    public static Item MARSHMALLOW_BUCKET;

    public static void registerModFluids() {
        MARSHMALLOW_STILL = Registry.register(Registries.FLUID,
                new Identifier(SmoreStuff.MOD_ID, "fluid_marshmallow"), new MarshmallowFluid.Still());
        MARSHMALLOW_FLOWING = Registry.register(Registries.FLUID,
                new Identifier(SmoreStuff.MOD_ID, "flowing_marshmallow"), new MarshmallowFluid.Flowing());

        FLUID_MARSHMALLOW = Registry.register(Registries.BLOCK, new Identifier(SmoreStuff.MOD_ID, "fluid_marshmallow"),
                new FluidBlock(ModFluids.MARSHMALLOW_STILL, FabricBlockSettings.copyOf(Blocks.WATER)){ });
        MARSHMALLOW_BUCKET = Registry.register(Registries.ITEM, new Identifier(SmoreStuff.MOD_ID, "marshmallow_bucket"),
                new BucketItem(ModFluids.MARSHMALLOW_STILL, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
    }

}
