package net.playerxess.smorestuff.util;

import net.playerxess.smorestuff.SmoreStuff;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModTags {

	public static class Blocks {

		private static TagKey<Block> create(String name) {
			return TagKey.of(RegistryKeys.field_41254, new Identifier(SmoreStuff.MOD_ID, name));
		}

	}

	public static class Items {

		public static final TagKey<Item> IS_COOKED_SMORE = create("is_cooked_smore");


		private static TagKey<Item> create(String name) {
			return TagKey.of(RegistryKeys.field_41197, new Identifier(SmoreStuff.MOD_ID, name));
		}

	}
}
