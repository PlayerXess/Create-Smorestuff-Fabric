package net.playerxess.smorestuff.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TRADSMORE = new FoodComponent.Builder().hunger(5).saturationModifier(3).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 600), 1.00f).build();
}
