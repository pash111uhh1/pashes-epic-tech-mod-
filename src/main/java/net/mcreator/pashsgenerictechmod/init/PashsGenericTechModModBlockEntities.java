
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pashsgenerictechmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.pashsgenerictechmod.block.entity.TELEPORTEROUTPUTBlockEntity;
import net.mcreator.pashsgenerictechmod.block.entity.Reaserchingthingy6000BlockEntity;
import net.mcreator.pashsgenerictechmod.block.entity.PlatingmachineBlockEntity;
import net.mcreator.pashsgenerictechmod.block.entity.OrepurifierBlockEntity;
import net.mcreator.pashsgenerictechmod.block.entity.OilrefineryBlockEntity;
import net.mcreator.pashsgenerictechmod.block.entity.OilextractorBlockEntity;
import net.mcreator.pashsgenerictechmod.block.entity.CrateBlockEntity;
import net.mcreator.pashsgenerictechmod.PashsGenericTechModMod;

public class PashsGenericTechModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			PashsGenericTechModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> OILREFINERY = register("oilrefinery", PashsGenericTechModModBlocks.OILREFINERY,
			OilrefineryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OREPURIFIER = register("orepurifier", PashsGenericTechModModBlocks.OREPURIFIER,
			OrepurifierBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLATINGMACHINE = register("platingmachine", PashsGenericTechModModBlocks.PLATINGMACHINE,
			PlatingmachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OILEXTRACTOR = register("oilextractor", PashsGenericTechModModBlocks.OILEXTRACTOR,
			OilextractorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REASERCHINGTHINGY_6000 = register("reaserchingthingy_6000",
			PashsGenericTechModModBlocks.REASERCHINGTHINGY_6000, Reaserchingthingy6000BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TELEPORTEROUTPUT = register("teleporteroutput",
			PashsGenericTechModModBlocks.TELEPORTEROUTPUT, TELEPORTEROUTPUTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRATE = register("crate", PashsGenericTechModModBlocks.CRATE, CrateBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
