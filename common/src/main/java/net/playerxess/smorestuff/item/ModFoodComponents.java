package net.playerxess.smorestuff.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CRACKERFOOD = new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build();
	public static final FoodComponent TRADITIONALSMOREFOOD = new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 600, 1), 1.0F).build();
	public static final FoodComponent CHOCOLATEYSMOREFOOD = new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 2400, 1), 1.0F).build();
	public static final FoodComponent MARSHMALLOWEYSMOREFOOD = new FoodComponent.Builder().hunger(10).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1200, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 600, 1), 1.0F).build();
}
