
package net.mcreator.pashsgenerictechmod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.pashsgenerictechmod.init.PashsGenericTechModModFluids;
import net.mcreator.pashsgenerictechmod.init.PashsGenericTechModModBlocks;

public abstract class OilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(PashsGenericTechModModFluids.OIL,
			PashsGenericTechModModFluids.FLOWING_OIL, FluidAttributes.builder(new ResourceLocation("pashs_generic_tech_mod:blocks/cheers"),
					new ResourceLocation("pashs_generic_tech_mod:blocks/oilfloweeeengbabe"))

	).explosionResistance(100f)

			.block(() -> (LiquidBlock) PashsGenericTechModModBlocks.OIL.get());

	private OilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends OilFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OilFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
