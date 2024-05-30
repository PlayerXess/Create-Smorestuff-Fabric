package net.playerxess.smorestuff.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent TRADITIONALSMOREFOOD = new FoodComponent.Builder().hunger(10).saturationModifier(5).statusEffect(new StatusEffectInstance(StatusEffects.field_5922, 600, 1), 1.0F).build();
	public static final FoodComponent CRACKERFOOD = new FoodComponent.Builder().hunger(3).saturationModifier(2).build();
}
