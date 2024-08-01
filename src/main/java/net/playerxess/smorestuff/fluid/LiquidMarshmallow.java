package net.playerxess.smorestuff.fluid;


import net.playerxess.smorestuff.block.ModBlocks;
import net.playerxess.smorestuff.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;


import java.util.Optional;
import java.util.Random;


public abstract class LiquidMarshmallow extends FlowableFluid {
    public Fluid getFlowing() {
        return ModFluids.MARSHMALLOW_FLOWING;
    }


    public Fluid getStill() {
        return ModFluids.MARSHMALLOW_STILL;
    }


    public Item getBucketItem() {
        return ModItems.BUCKET_OF_MARSHMALLOW;
    }


    public void randomDisplayTick(World world, BlockPos pos, FluidState state, Random random) {
        if (!state.isStill() && !(Boolean)state.get(FALLING)) {
            if (random.nextInt(64) == 0) {
                world.playSound((double)pos.getX() + 0.5D,
                        (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D,
                        SoundEvents.field_21074, SoundCategory.field_15245,
                        random.nextFloat() * 0.25F + 0.75F, random.nextFloat() + 0.5F,
                        false);
            }
        } else if (random.nextInt(10) == 0) {
            world.addParticle(ParticleTypes.field_11210, (double)pos.getX() + random.nextDouble(),
                    (double)pos.getY() + random.nextDouble(),
                    (double)pos.getZ() + random.nextDouble(),
                    0.0D, 0.0D, 0.0D);
        }


    }


    @Nullable
    public ParticleEffect getParticle() {
        return ParticleTypes.field_11232;
    }


    protected boolean isInfinite() {
        return true;
    }


    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state) {
        BlockEntity blockEntity = state.hasBlockEntity() ? world.getBlockEntity(pos) : null;
        Block.dropStacks(state, world, pos, blockEntity);
    }


    public int getFlowSpeed(WorldView world) {
        return 4;
    }


    public BlockState toBlockState(FluidState state) {
        return ModBlocks.LIQUID_MARSHMALLOW.getDefaultState().with(FluidBlock.LEVEL, getBlockStateLevel(state));
    }


    public boolean matchesType(Fluid fluid) {
        return fluid == ModFluids.MARSHMALLOW_STILL || fluid == ModFluids.MARSHMALLOW_FLOWING;
    }


    public int getLevelDecreasePerBlock(WorldView world) {
        return 1;
    }


    public int getTickRate(WorldView world) {
        return 5;
    }


    public boolean canBeReplacedWith(FluidState state, BlockView world, BlockPos pos, Fluid fluid, Direction direction) {
        return direction == Direction.field_11033 && !fluid.isIn(FluidTags.field_15517);
    }


    protected float getBlastResistance() {
        return 100.0F;
    }


    public Optional<SoundEvent> getBucketFillSound() {
        return Optional.of(SoundEvents.field_15126);
    }


    public static class Flowing extends LiquidMarshmallow {


        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }


        public int getLevel(FluidState state) {
            return (Integer)state.get(LEVEL);
        }


        public boolean isStill(FluidState state) {
            return false;
        }


        @Override
        protected boolean isInfinite(World world) {
            return true;
        }
    }
	public static class Still extends LiquidMarshmallow {


            public int getLevel(FluidState state) {
                return 8;
            }


            public boolean isStill(FluidState state) {
                return true;
            }


            @Override
            protected boolean isInfinite(World world) {
                return true;
            }
        }
}


