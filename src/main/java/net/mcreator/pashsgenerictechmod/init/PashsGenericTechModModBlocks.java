
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pashsgenerictechmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.pashsgenerictechmod.block.TinOreBlock;
import net.mcreator.pashsgenerictechmod.block.TinBlockBlock;
import net.mcreator.pashsgenerictechmod.block.TELEPORTEROUTPUTBlock;
import net.mcreator.pashsgenerictechmod.block.Reaserchingthingy6000Block;
import net.mcreator.pashsgenerictechmod.block.PlatingmachineBlock;
import net.mcreator.pashsgenerictechmod.block.OrepurifierBlock;
import net.mcreator.pashsgenerictechmod.block.OilygroundsBlock;
import net.mcreator.pashsgenerictechmod.block.OilrefineryBlock;
import net.mcreator.pashsgenerictechmod.block.OilextractorBlock;
import net.mcreator.pashsgenerictechmod.block.OilBlock;
import net.mcreator.pashsgenerictechmod.block.MachineCasingBlock;
import net.mcreator.pashsgenerictechmod.PashsGenericTechModMod;

public class PashsGenericTechModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PashsGenericTechModMod.MODID);
	public static final RegistryObject<Block> OIL = REGISTRY.register("oil", () -> new OilBlock());
	public static final RegistryObject<Block> OILREFINERY = REGISTRY.register("oilrefinery", () -> new OilrefineryBlock());
	public static final RegistryObject<Block> OILYGROUNDS = REGISTRY.register("oilygrounds", () -> new OilygroundsBlock());
	public static final RegistryObject<Block> MACHINE_CASING = REGISTRY.register("machine_casing", () -> new MachineCasingBlock());
	public static final RegistryObject<Block> OREPURIFIER = REGISTRY.register("orepurifier", () -> new OrepurifierBlock());
	public static final RegistryObject<Block> PLATINGMACHINE = REGISTRY.register("platingmachine", () -> new PlatingmachineBlock());
	public static final RegistryObject<Block> OILEXTRACTOR = REGISTRY.register("oilextractor", () -> new OilextractorBlock());
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final RegistryObject<Block> REASERCHINGTHINGY_6000 = REGISTRY.register("reaserchingthingy_6000",
			() -> new Reaserchingthingy6000Block());
	public static final RegistryObject<Block> TELEPORTEROUTPUT = REGISTRY.register("teleporteroutput", () -> new TELEPORTEROUTPUTBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			Reaserchingthingy6000Block.registerRenderLayer();
		}
	}
}
