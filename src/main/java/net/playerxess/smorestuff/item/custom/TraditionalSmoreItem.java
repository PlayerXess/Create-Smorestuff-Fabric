package net.playerxess.smorestuff.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.text.Text;

import org.jetbrains.annotations.Nullable;
import java.util.List;

public class TraditionalSmoreItem extends Item{
	public TraditionalSmoreItem(Settings settings) {
		super(settings);
	}

	@Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.smorestuff.traditional_smore_tooltip.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }

}
