package net.mcreator.pashsgenerictechmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.pashsgenerictechmod.network.PashsGenericTechModModVariables;

public class ResetresearchtoolRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.reaserchdonealready = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
