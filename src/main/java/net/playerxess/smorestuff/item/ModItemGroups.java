package net.playerxess.smorestuff.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.SmoreStuff;
import net.playerxess.smorestuff.fluid.ModFluids;
import net.playerxess.smorestuff.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SMORE_STUFF = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SmoreStuff.MOD_ID, "smore"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smore"))
                    .icon(() -> new ItemStack(ModItems.TRADITIONALSMORE)). entries((displayContext, entries) -> {
                        entries.add(ModItems.MARSHMALLOW);
						entries.add(ModItems.PRESSED_DOUGH);
						entries.add(ModItems.CRACKER);
						entries.add(ModItems.GRAHAMCRACKER);
						entries.add(ModItems.RAWSMORE);
						entries.add(ModItems.TRADITIONALSMORE);
						entries.add(ModItems.RAWCHOCOLATEYSMORE);
						entries.add(ModItems.CHOCOLATEYSMORE);
						entries.add(ModItems.RAWMARSHMALLOWEYSMORE);
						entries.add(ModItems.MARSHMALLOWEYSMORE);
						entries.add(ModFluids.MARSHMALLOW_BUCKET);

                    }).build());

    public static void registerItemGroups() {
        SmoreStuff.LOGGER.info("Registering Item Groups For Mod Create: Smorestuff");
    }
}
