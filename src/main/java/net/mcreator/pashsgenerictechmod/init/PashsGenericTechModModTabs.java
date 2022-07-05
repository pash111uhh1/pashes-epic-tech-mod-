
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pashsgenerictechmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PashsGenericTechModModTabs {
	public static CreativeModeTab TAB_PASHSGENERICTECHMOD;

	public static void load() {
		TAB_PASHSGENERICTECHMOD = new CreativeModeTab("tabpashsgenerictechmod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PashsGenericTechModModItems.OILCANFULL.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
