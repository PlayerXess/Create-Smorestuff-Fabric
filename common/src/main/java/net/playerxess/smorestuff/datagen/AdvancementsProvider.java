package net.playerxess.smorestuff.datagen;

import java.util.function.Consumer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.item.ModItems;

public class AdvancementsProvider extends FabricAdvancementProvider {

	public AdvancementsProvider(FabricDataOutput dataGenerator) {
		super(dataGenerator);
	}

	@Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement rootAdvancement = Advancement.Builder.create()
                .display(
                        ModItems.TRADITIONALSMORE, // The display icon
                        Text.literal("A Taste Of Tradition"), // The title
                        Text.literal("Make Your First Traditional S'more"), // The description
                        new Identifier("src/main/resources/assets/smorestuff/textures/item/traditional_smore.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_s'more", InventoryChangedCriterion.Conditions.items(ModItems.TRADITIONALSMORE))
                .build(consumer, "smorestuff" + "/root");
    }
}

