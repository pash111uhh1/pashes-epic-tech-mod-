
package net.mcreator.pashsgenerictechmod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.pashsgenerictechmod.procedures.OilcanRightclickedOnBlockProcedure;
import net.mcreator.pashsgenerictechmod.init.PashsGenericTechModModTabs;

public class OilcanItem extends Item {
	public OilcanItem() {
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

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		OilcanRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
