package net.playerxess.smorestuff.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.SmoreStuff;

public class ModItemGroups {
    public static final ItemGroup SMORE_STUFF = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SmoreStuff.MOD_ID, "smore"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.smore"))
                    .icon(() -> new ItemStack(ModItems.SMORE)). entries((displayContext, entries) -> {
                        entries.add(ModItems.SMORE);
                        entries.add(ModItems.MARSHMALLOW);

                    }).build());

    public static void registerItemGroups() {
        SmoreStuff.LOGGER.info("Registering Item Groups for " +SmoreStuff.MOD_ID);
    }
}
