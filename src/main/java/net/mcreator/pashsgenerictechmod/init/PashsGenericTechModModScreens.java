
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pashsgenerictechmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.pashsgenerictechmod.client.gui.TeleportguiScreen;
import net.mcreator.pashsgenerictechmod.client.gui.StartguidebookguiScreen;
import net.mcreator.pashsgenerictechmod.client.gui.Startguidebookgui1Screen;
import net.mcreator.pashsgenerictechmod.client.gui.SpongecraftrecipeScreen;
import net.mcreator.pashsgenerictechmod.client.gui.SpeedbootsrecipeScreen;
import net.mcreator.pashsgenerictechmod.client.gui.ReaserchGUIScreen;
import net.mcreator.pashsgenerictechmod.client.gui.PlatingmachineGUIScreen;
import net.mcreator.pashsgenerictechmod.client.gui.OrepurifierguiScreen;
import net.mcreator.pashsgenerictechmod.client.gui.OilrefineryGUIScreen;
import net.mcreator.pashsgenerictechmod.client.gui.OilextractorguiScreen;
import net.mcreator.pashsgenerictechmod.client.gui.GuidebookteleporterstuningScreen;
import net.mcreator.pashsgenerictechmod.client.gui.GuidebookteleportersScreen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart9Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart8Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart7Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart6Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart5Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart4Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart22Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart21Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart20Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart19Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart18Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart17Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart16Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart15Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart14Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart13Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart12Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart11Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookpart10Screen;
import net.mcreator.pashsgenerictechmod.client.gui.GuidebookorganicmatterScreen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookguipart3Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookguipart2Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebookguipart1Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebook23Screen;
import net.mcreator.pashsgenerictechmod.client.gui.Guidebnookpart7Screen;
import net.mcreator.pashsgenerictechmod.client.gui.BlooodespyScreen;
import net.mcreator.pashsgenerictechmod.client.gui.BloodyhellScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PashsGenericTechModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PashsGenericTechModModMenus.OILREFINERY_GUI, OilrefineryGUIScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.OREPURIFIERGUI, OrepurifierguiScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.PLATINGMACHINE_GUI, PlatingmachineGUIScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKGUIPART_1, Guidebookguipart1Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKGUIPART_2, Guidebookguipart2Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKGUIPART_3, Guidebookguipart3Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_4, Guidebookpart4Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_5, Guidebookpart5Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_6, Guidebookpart6Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_7, Guidebookpart7Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_8, Guidebookpart8Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_9, Guidebookpart9Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_10, Guidebookpart10Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_11, Guidebookpart11Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_12, Guidebookpart12Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_13, Guidebookpart13Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_14, Guidebookpart14Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_15, Guidebookpart15Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_16, Guidebookpart16Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_17, Guidebookpart17Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.BLOODYHELL, BloodyhellScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.BLOOODESPY, BlooodespyScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_18, Guidebookpart18Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.OILEXTRACTORGUI, OilextractorguiScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_19, Guidebookpart19Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_20, Guidebookpart20Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_21, Guidebookpart21Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKPART_22, Guidebookpart22Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOK_23, Guidebook23Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.STARTGUIDEBOOKGUI, StartguidebookguiScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.STARTGUIDEBOOKGUI_1, Startguidebookgui1Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBNOOKPART_7, Guidebnookpart7Screen::new);
			MenuScreens.register(PashsGenericTechModModMenus.REASERCH_GUI, ReaserchGUIScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKORGANICMATTER, GuidebookorganicmatterScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.TELEPORTGUI, TeleportguiScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKTELEPORTERS, GuidebookteleportersScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.GUIDEBOOKTELEPORTERSTUNING, GuidebookteleporterstuningScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.SPONGECRAFTRECIPE, SpongecraftrecipeScreen::new);
			MenuScreens.register(PashsGenericTechModModMenus.SPEEDBOOTSRECIPE, SpeedbootsrecipeScreen::new);
		});
	}
}
