package net.playerxess.smorestuff.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.*;
import java.util.function.Consumer;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.item.ModItems;

public class AdvancementsProvider extends FabricAdvancementProvider {
	protected AdvancementsProvider(FabricDataOutput dataGenerator) {
		super(dataGenerator);
	}

	@Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement rootAdvancement = Advancement.Builder.create()
                .display(
                        Items.DIRT, // The display icon
                        Text.literal("A Taste Of Tradition"), // The title
                        Text.literal("Make Your First Traditional S'more"), // The description
                        new Identifier("src/main/resources/assets/smorestuff/textures/item/traditional_smore.png"), // Background image used
                        AdvancementFrame.field_1254, // Options: TASK(field_1254), CHALLENGE(field_1250), GOAL(field_1249)
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_dirt", InventoryChangedCriterion.Conditions.items(ModItems.TRADITIONALSMORE))
                .build(consumer, "smorestuff" + "/root");
    }
}

