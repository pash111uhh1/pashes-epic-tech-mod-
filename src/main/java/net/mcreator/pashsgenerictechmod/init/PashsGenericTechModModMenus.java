
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pashsgenerictechmod.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.pashsgenerictechmod.world.inventory.TeleportguiMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.StartguidebookguiMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.Startguidebookgui1Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.SpongecraftrecipeMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.SpeedbootsrecipeMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.ReaserchGUIMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.PlatingmachineGUIMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.OrepurifierguiMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.OilrefineryGUIMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.OilextractorguiMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.GuidebookteleporterstuningMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.GuidebookteleportersMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart9Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart8Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart7Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart6Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart5Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart4Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart22Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart21Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart20Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart19Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart18Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart17Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart16Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart15Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart14Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart13Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart12Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart11Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart10Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.GuidebookorganicmatterMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookguipart3Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookguipart2Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookguipart1Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebook23Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.Guidebnookpart7Menu;
import net.mcreator.pashsgenerictechmod.world.inventory.CrateGUIMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.BlooodespyMenu;
import net.mcreator.pashsgenerictechmod.world.inventory.BloodyhellMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PashsGenericTechModModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<OilrefineryGUIMenu> OILREFINERY_GUI = register("oilrefinery_gui",
			(id, inv, extraData) -> new OilrefineryGUIMenu(id, inv, extraData));
	public static final MenuType<OrepurifierguiMenu> OREPURIFIERGUI = register("orepurifiergui",
			(id, inv, extraData) -> new OrepurifierguiMenu(id, inv, extraData));
	public static final MenuType<PlatingmachineGUIMenu> PLATINGMACHINE_GUI = register("platingmachine_gui",
			(id, inv, extraData) -> new PlatingmachineGUIMenu(id, inv, extraData));
	public static final MenuType<Guidebookguipart1Menu> GUIDEBOOKGUIPART_1 = register("guidebookguipart_1",
			(id, inv, extraData) -> new Guidebookguipart1Menu(id, inv, extraData));
	public static final MenuType<Guidebookguipart2Menu> GUIDEBOOKGUIPART_2 = register("guidebookguipart_2",
			(id, inv, extraData) -> new Guidebookguipart2Menu(id, inv, extraData));
	public static final MenuType<Guidebookguipart3Menu> GUIDEBOOKGUIPART_3 = register("guidebookguipart_3",
			(id, inv, extraData) -> new Guidebookguipart3Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart4Menu> GUIDEBOOKPART_4 = register("guidebookpart_4",
			(id, inv, extraData) -> new Guidebookpart4Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart5Menu> GUIDEBOOKPART_5 = register("guidebookpart_5",
			(id, inv, extraData) -> new Guidebookpart5Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart6Menu> GUIDEBOOKPART_6 = register("guidebookpart_6",
			(id, inv, extraData) -> new Guidebookpart6Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart7Menu> GUIDEBOOKPART_7 = register("guidebookpart_7",
			(id, inv, extraData) -> new Guidebookpart7Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart8Menu> GUIDEBOOKPART_8 = register("guidebookpart_8",
			(id, inv, extraData) -> new Guidebookpart8Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart9Menu> GUIDEBOOKPART_9 = register("guidebookpart_9",
			(id, inv, extraData) -> new Guidebookpart9Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart10Menu> GUIDEBOOKPART_10 = register("guidebookpart_10",
			(id, inv, extraData) -> new Guidebookpart10Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart11Menu> GUIDEBOOKPART_11 = register("guidebookpart_11",
			(id, inv, extraData) -> new Guidebookpart11Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart12Menu> GUIDEBOOKPART_12 = register("guidebookpart_12",
			(id, inv, extraData) -> new Guidebookpart12Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart13Menu> GUIDEBOOKPART_13 = register("guidebookpart_13",
			(id, inv, extraData) -> new Guidebookpart13Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart14Menu> GUIDEBOOKPART_14 = register("guidebookpart_14",
			(id, inv, extraData) -> new Guidebookpart14Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart15Menu> GUIDEBOOKPART_15 = register("guidebookpart_15",
			(id, inv, extraData) -> new Guidebookpart15Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart16Menu> GUIDEBOOKPART_16 = register("guidebookpart_16",
			(id, inv, extraData) -> new Guidebookpart16Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart17Menu> GUIDEBOOKPART_17 = register("guidebookpart_17",
			(id, inv, extraData) -> new Guidebookpart17Menu(id, inv, extraData));
	public static final MenuType<BloodyhellMenu> BLOODYHELL = register("bloodyhell", (id, inv, extraData) -> new BloodyhellMenu(id, inv, extraData));
	public static final MenuType<BlooodespyMenu> BLOOODESPY = register("blooodespy", (id, inv, extraData) -> new BlooodespyMenu(id, inv, extraData));
	public static final MenuType<Guidebookpart18Menu> GUIDEBOOKPART_18 = register("guidebookpart_18",
			(id, inv, extraData) -> new Guidebookpart18Menu(id, inv, extraData));
	public static final MenuType<OilextractorguiMenu> OILEXTRACTORGUI = register("oilextractorgui",
			(id, inv, extraData) -> new OilextractorguiMenu(id, inv, extraData));
	public static final MenuType<Guidebookpart19Menu> GUIDEBOOKPART_19 = register("guidebookpart_19",
			(id, inv, extraData) -> new Guidebookpart19Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart20Menu> GUIDEBOOKPART_20 = register("guidebookpart_20",
			(id, inv, extraData) -> new Guidebookpart20Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart21Menu> GUIDEBOOKPART_21 = register("guidebookpart_21",
			(id, inv, extraData) -> new Guidebookpart21Menu(id, inv, extraData));
	public static final MenuType<Guidebookpart22Menu> GUIDEBOOKPART_22 = register("guidebookpart_22",
			(id, inv, extraData) -> new Guidebookpart22Menu(id, inv, extraData));
	public static final MenuType<Guidebook23Menu> GUIDEBOOK_23 = register("guidebook_23",
			(id, inv, extraData) -> new Guidebook23Menu(id, inv, extraData));
	public static final MenuType<StartguidebookguiMenu> STARTGUIDEBOOKGUI = register("startguidebookgui",
			(id, inv, extraData) -> new StartguidebookguiMenu(id, inv, extraData));
	public static final MenuType<Startguidebookgui1Menu> STARTGUIDEBOOKGUI_1 = register("startguidebookgui_1",
			(id, inv, extraData) -> new Startguidebookgui1Menu(id, inv, extraData));
	public static final MenuType<Guidebnookpart7Menu> GUIDEBNOOKPART_7 = register("guidebnookpart_7",
			(id, inv, extraData) -> new Guidebnookpart7Menu(id, inv, extraData));
	public static final MenuType<ReaserchGUIMenu> REASERCH_GUI = register("reaserch_gui",
			(id, inv, extraData) -> new ReaserchGUIMenu(id, inv, extraData));
	public static final MenuType<GuidebookorganicmatterMenu> GUIDEBOOKORGANICMATTER = register("guidebookorganicmatter",
			(id, inv, extraData) -> new GuidebookorganicmatterMenu(id, inv, extraData));
	public static final MenuType<TeleportguiMenu> TELEPORTGUI = register("teleportgui",
			(id, inv, extraData) -> new TeleportguiMenu(id, inv, extraData));
	public static final MenuType<GuidebookteleportersMenu> GUIDEBOOKTELEPORTERS = register("guidebookteleporters",
			(id, inv, extraData) -> new GuidebookteleportersMenu(id, inv, extraData));
	public static final MenuType<GuidebookteleporterstuningMenu> GUIDEBOOKTELEPORTERSTUNING = register("guidebookteleporterstuning",
			(id, inv, extraData) -> new GuidebookteleporterstuningMenu(id, inv, extraData));
	public static final MenuType<SpongecraftrecipeMenu> SPONGECRAFTRECIPE = register("spongecraftrecipe",
			(id, inv, extraData) -> new SpongecraftrecipeMenu(id, inv, extraData));
	public static final MenuType<SpeedbootsrecipeMenu> SPEEDBOOTSRECIPE = register("speedbootsrecipe",
			(id, inv, extraData) -> new SpeedbootsrecipeMenu(id, inv, extraData));
	public static final MenuType<CrateGUIMenu> CRATE_GUI = register("crate_gui", (id, inv, extraData) -> new CrateGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
