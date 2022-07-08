package net.mcreator.pashsgenerictechmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.pashsgenerictechmod.network.PashsGenericTechModModVariables;

public class Textdisplaycond1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready < 30) {
			return true;
		}
		return false;
	}
}
