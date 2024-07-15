package net.playerxess.smorestuff;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.playerxess.smorestuff.item.ModItems;
import net.minecraft.util.Identifier;
import java.util.function.Consumer;
import net.minecraft.advancement.*;
import net.minecraft.item.Items;
import net.minecraft.text.Text;

public class SmorestuffDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        //Put Providers Here

        pack.addProvider(AdvancementsProvider::new);
    }


    static class AdvancementsProvider extends FabricAdvancementProvider {
		protected AdvancementsProvider(FabricDataOutput dataGenerator) {
			super(dataGenerator);
		}

		@Override
		public void generateAdvancement(Consumer<Advancement> consumer) {
			Advancement rootAdvancement = Advancement.Builder.create()
					.display(
							ModItems.TRADITIONALSMORE, // The display icon
							Text.literal("Ol' Reliable S'more"), // The title
							Text.literal("Now Make More"), // The description
							new Identifier("smorestuff:item/traditional_smore.png"), // Background image used
							AdvancementFrame.field_1254, // Options: TASK (field_1254), CHALLENGE (field_1250), GOAL (1field_249)
							true, // Show toast top right
							true, // Announce to chat
							false // Hidden in the advancement tab
					)
					// The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
					.criterion("got_smore", InventoryChangedCriterion.Conditions.items(ModItems.TRADITIONALSMORE))
					.build(consumer, "smorestuff" + "/root");
		}
	}

}
