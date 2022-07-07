
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pashsgenerictechmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.pashsgenerictechmod.item.WheatcookieItem;
import net.mcreator.pashsgenerictechmod.item.TinplateItem;
import net.mcreator.pashsgenerictechmod.item.TindustItem;
import net.mcreator.pashsgenerictechmod.item.TinSwordItem;
import net.mcreator.pashsgenerictechmod.item.TinShovelItem;
import net.mcreator.pashsgenerictechmod.item.TinPickaxeItem;
import net.mcreator.pashsgenerictechmod.item.TinIngotItem;
import net.mcreator.pashsgenerictechmod.item.TinHoeItem;
import net.mcreator.pashsgenerictechmod.item.TinAxeItem;
import net.mcreator.pashsgenerictechmod.item.TeleporttuningtoolItem;
import net.mcreator.pashsgenerictechmod.item.Speed_bootsArmorItem;
import net.mcreator.pashsgenerictechmod.item.ResetresearchtoolItem;
import net.mcreator.pashsgenerictechmod.item.RefinedoilItem;
import net.mcreator.pashsgenerictechmod.item.OilyArmorItem;
import net.mcreator.pashsgenerictechmod.item.OilcanfullItem;
import net.mcreator.pashsgenerictechmod.item.OilcanItem;
import net.mcreator.pashsgenerictechmod.item.IronplateItem;
import net.mcreator.pashsgenerictechmod.item.HeatDissipatingElementItem;
import net.mcreator.pashsgenerictechmod.item.GoldenplateItem;
import net.mcreator.pashsgenerictechmod.item.GenerictechmodbookItem;
import net.mcreator.pashsgenerictechmod.item.FilteringelementItem;
import net.mcreator.pashsgenerictechmod.item.ExtractorItem;
import net.mcreator.pashsgenerictechmod.item.CurcuitItem;
import net.mcreator.pashsgenerictechmod.item.CrushedironItem;
import net.mcreator.pashsgenerictechmod.item.CrushedgoldItem;
import net.mcreator.pashsgenerictechmod.item.CrushedcopperItem;
import net.mcreator.pashsgenerictechmod.item.CopperplateItem;
import net.mcreator.pashsgenerictechmod.item.ChocolateItem;
import net.mcreator.pashsgenerictechmod.item.AdvancedcurcuitItem;
import net.mcreator.pashsgenerictechmod.PashsGenericTechModMod;

public class PashsGenericTechModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PashsGenericTechModMod.MODID);
	public static final RegistryObject<Item> OILCAN = REGISTRY.register("oilcan", () -> new OilcanItem());
	public static final RegistryObject<Item> OILCANFULL = REGISTRY.register("oilcanfull", () -> new OilcanfullItem());
	public static final RegistryObject<Item> OILREFINERY = block(PashsGenericTechModModBlocks.OILREFINERY,
			PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD);
	public static final RegistryObject<Item> FILTERINGELEMENT = REGISTRY.register("filteringelement", () -> new FilteringelementItem());
	public static final RegistryObject<Item> IRONPLATE = REGISTRY.register("ironplate", () -> new IronplateItem());
	public static final RegistryObject<Item> OILYGROUNDS = block(PashsGenericTechModModBlocks.OILYGROUNDS,
			PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD);
	public static final RegistryObject<Item> MACHINE_CASING = block(PashsGenericTechModModBlocks.MACHINE_CASING,
			PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD);
	public static final RegistryObject<Item> COPPERPLATE = REGISTRY.register("copperplate", () -> new CopperplateItem());
	public static final RegistryObject<Item> GOLDENPLATE = REGISTRY.register("goldenplate", () -> new GoldenplateItem());
	public static final RegistryObject<Item> CURCUIT = REGISTRY.register("curcuit", () -> new CurcuitItem());
	public static final RegistryObject<Item> OREPURIFIER = block(PashsGenericTechModModBlocks.OREPURIFIER,
			PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD);
	public static final RegistryObject<Item> CRUSHEDIRON = REGISTRY.register("crushediron", () -> new CrushedironItem());
	public static final RegistryObject<Item> CRUSHEDCOPPER = REGISTRY.register("crushedcopper", () -> new CrushedcopperItem());
	public static final RegistryObject<Item> CRUSHEDGOLD = REGISTRY.register("crushedgold", () -> new CrushedgoldItem());
	public static final RegistryObject<Item> PLATINGMACHINE = block(PashsGenericTechModModBlocks.PLATINGMACHINE,
			PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD);
	public static final RegistryObject<Item> ADVANCEDCURCUIT = REGISTRY.register("advancedcurcuit", () -> new AdvancedcurcuitItem());
	public static final RegistryObject<Item> OILY_ARMOR_HELMET = REGISTRY.register("oily_armor_helmet", () -> new OilyArmorItem.Helmet());
	public static final RegistryObject<Item> OILY_ARMOR_CHESTPLATE = REGISTRY.register("oily_armor_chestplate", () -> new OilyArmorItem.Chestplate());
	public static final RegistryObject<Item> OILY_ARMOR_LEGGINGS = REGISTRY.register("oily_armor_leggings", () -> new OilyArmorItem.Leggings());
	public static final RegistryObject<Item> OILY_ARMOR_BOOTS = REGISTRY.register("oily_armor_boots", () -> new OilyArmorItem.Boots());
	public static final RegistryObject<Item> GENERICTECHMODBOOK = REGISTRY.register("generictechmodbook", () -> new GenerictechmodbookItem());
	public static final RegistryObject<Item> OILEXTRACTOR = block(PashsGenericTechModModBlocks.OILEXTRACTOR,
			PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD);
	public static final RegistryObject<Item> HEAT_DISSIPATING_ELEMENT = REGISTRY.register("heat_dissipating_element",
			() -> new HeatDissipatingElementItem());
	public static final RegistryObject<Item> EXTRACTOR = REGISTRY.register("extractor", () -> new ExtractorItem());
	public static final RegistryObject<Item> CHOCOLATE = REGISTRY.register("chocolate", () -> new ChocolateItem());
	public static final RegistryObject<Item> WHEATCOOKIE = REGISTRY.register("wheatcookie", () -> new WheatcookieItem());
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> TIN_ORE = block(PashsGenericTechModModBlocks.TIN_ORE,
			PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD);
	public static final RegistryObject<Item> TIN_BLOCK = block(PashsGenericTechModModBlocks.TIN_BLOCK,
			PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD);
	public static final RegistryObject<Item> TINPLATE = REGISTRY.register("tinplate", () -> new TinplateItem());
	public static final RegistryObject<Item> TIN_PICKAXE = REGISTRY.register("tin_pickaxe", () -> new TinPickaxeItem());
	public static final RegistryObject<Item> TIN_AXE = REGISTRY.register("tin_axe", () -> new TinAxeItem());
	public static final RegistryObject<Item> TIN_SWORD = REGISTRY.register("tin_sword", () -> new TinSwordItem());
	public static final RegistryObject<Item> TIN_SHOVEL = REGISTRY.register("tin_shovel", () -> new TinShovelItem());
	public static final RegistryObject<Item> TIN_HOE = REGISTRY.register("tin_hoe", () -> new TinHoeItem());
	public static final RegistryObject<Item> TINDUST = REGISTRY.register("tindust", () -> new TindustItem());
	public static final RegistryObject<Item> REASERCHINGTHINGY_6000 = block(PashsGenericTechModModBlocks.REASERCHINGTHINGY_6000,
			PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD);
	public static final RegistryObject<Item> REFINEDOIL = REGISTRY.register("refinedoil", () -> new RefinedoilItem());
	public static final RegistryObject<Item> TELEPORTEROUTPUT = block(PashsGenericTechModModBlocks.TELEPORTEROUTPUT,
			PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD);
	public static final RegistryObject<Item> TELEPORTTUNINGTOOL = REGISTRY.register("teleporttuningtool", () -> new TeleporttuningtoolItem());
	public static final RegistryObject<Item> RESETRESEARCHTOOL = REGISTRY.register("resetresearchtool", () -> new ResetresearchtoolItem());
	public static final RegistryObject<Item> SPEED_BOOTS_ARMOR_BOOTS = REGISTRY.register("speed_boots_armor_boots",
			() -> new Speed_bootsArmorItem.Boots());
	public static final RegistryObject<Item> CRATE = block(PashsGenericTechModModBlocks.CRATE, PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
