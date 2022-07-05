package net.mcreator.pashsgenerictechmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.pashsgenerictechmod.network.PashsGenericTechModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RANDOMGOBRRRRRRProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.world);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		PashsGenericTechModModVariables.WorldVariables.get(world).RANDOMNUMBEERRRRR = Math.random() * 10;
		PashsGenericTechModModVariables.WorldVariables.get(world).syncData(world);
	}
}
