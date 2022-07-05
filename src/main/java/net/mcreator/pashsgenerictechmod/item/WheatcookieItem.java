
package net.mcreator.pashsgenerictechmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.pashsgenerictechmod.init.PashsGenericTechModModTabs;

public class WheatcookieItem extends Item {
	public WheatcookieItem() {
		super(new Item.Properties().tab(PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(2).saturationMod(1f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
