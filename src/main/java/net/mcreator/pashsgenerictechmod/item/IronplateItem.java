
package net.mcreator.pashsgenerictechmod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.pashsgenerictechmod.init.PashsGenericTechModModTabs;

public class IronplateItem extends Item {
	public IronplateItem() {
		super(new Item.Properties().tab(PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
