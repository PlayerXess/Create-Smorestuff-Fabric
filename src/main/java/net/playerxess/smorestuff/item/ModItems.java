package net.playerxess.smorestuff.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.playerxess.smorestuff.SmoreStuff;
import net.minecraft.item.Item;

public class ModItems {
    public static final Item MARSHMALLOW = registerItem("marshmallow", new Item(new FabricItemSettings()));
	public static final Item PRESSED_DOUGH = registerItem("pressed_dough", new Item(new FabricItemSettings()));
	public static final Item CRACKER = registerItem("cracker", new Item(new FabricItemSettings().food(ModFoodComponents.CRACKERFOOD)));
	public static final Item GRAHAMCRACKER = registerItem("graham_cracker", new Item(new FabricItemSettings()));
	public static final Item RAWSMORE = registerItem("raw_smore", new Item(new FabricItemSettings()));
	public static final Item TRADITIONALSMORE = registerItem("traditional_smore", new Item(new FabricItemSettings().food(ModFoodComponents.TRADITIONALSMOREFOOD)));
	public static final Item RAWCHOCOLATEYSMORE = registerItem("raw_chocolatey_smore", new Item(new FabricItemSettings()));
	public static final Item CHOCOLATEYSMORE = registerItem("chocolatey_smore", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATEYSMOREFOOD)));
	public static final Item RAWMARSHMALLOWEYSMORE = registerItem("raw_marshmallowey_smore", new Item(new FabricItemSettings()));
	public static final Item MARSHMALLOWEYSMORE = registerItem("marshmallowey_smore", new Item(new FabricItemSettings().food(ModFoodComponents.CHOCOLATEYSMOREFOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SmoreStuff.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SmoreStuff.LOGGER.info(("Registering Mod Items for Create: Smorestuff"));

    }
}
