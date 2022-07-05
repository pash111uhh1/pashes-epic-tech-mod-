
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pashsgenerictechmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class PashsGenericTechModModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == PashsGenericTechModModItems.OILCANFULL.get())
			event.setBurnTime(20000);
	}
}
