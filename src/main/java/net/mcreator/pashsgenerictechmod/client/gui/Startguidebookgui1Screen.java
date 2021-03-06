
package net.mcreator.pashsgenerictechmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.pashsgenerictechmod.world.inventory.Startguidebookgui1Menu;
import net.mcreator.pashsgenerictechmod.procedures.TextdisplayconditionProcedure;
import net.mcreator.pashsgenerictechmod.procedures.Textdisplaycondition1Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Textdisplaycond1Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Mommecanidisplayples1Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Mommacanidisplaymyfriend1Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Buttondisplaycondition1Procedure;
import net.mcreator.pashsgenerictechmod.procedures.ButtonDisplayConditionProcedure;
import net.mcreator.pashsgenerictechmod.procedures.Btndisplcond1Procedure;
import net.mcreator.pashsgenerictechmod.network.Startguidebookgui1ButtonMessage;
import net.mcreator.pashsgenerictechmod.network.PashsGenericTechModModVariables;
import net.mcreator.pashsgenerictechmod.PashsGenericTechModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Startguidebookgui1Screen extends AbstractContainerScreen<Startguidebookgui1Menu> {
	private final static HashMap<String, Object> guistate = Startguidebookgui1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Startguidebookgui1Screen(Startguidebookgui1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 237;
		this.imageHeight = 186;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("pashs_generic_tech_mod:textures/bookgui.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 237, 186, 237, 186);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "table of contents", 73, 6, -12829636);
		if (Mommacanidisplaymyfriend1Procedure.execute(entity))
			this.font.draw(poseStack, "REQUIRES 10 RESEARCH POINTS", 9, 148, -16777216);
		this.font.draw(poseStack, "research points - " + ((entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready) + "", 7, 169, -16777216);
		if (TextdisplayconditionProcedure.execute(entity))
			this.font.draw(poseStack, "REQUIRES 14", 160, 27, -16777216);
		if (TextdisplayconditionProcedure.execute(entity))
			this.font.draw(poseStack, "RESEARCH POINTS", 151, 37, -16777216);
		if (Textdisplaycondition1Procedure.execute(entity))
			this.font.draw(poseStack, "REQUIRES 20", 100, 49, -16777216);
		if (Textdisplaycondition1Procedure.execute(entity))
			this.font.draw(poseStack, "RESEARCH POINTS", 93, 63, -16777216);
		if (Textdisplaycond1Procedure.execute(entity))
			this.font.draw(poseStack, "REQUIRES 30 ", 100, 73, -16777216);
		if (Textdisplaycond1Procedure.execute(entity))
			this.font.draw(poseStack, "RESEARCH POINTS", 91, 85, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 10, this.topPos + 4, 35, 20, new TextComponent("<-"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(0, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 47, 87, 20, new TextComponent("extractor"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(1, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 70, 77, 20, new TextComponent("foodstuffs"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(2, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 95, 108, 20, new TextComponent("advanced circuit"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(3, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 118, 108, 20, new TextComponent("research station"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(4, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 143, 56, 20, new TextComponent("teleporter"), e -> {
			if (Mommecanidisplayples1Procedure.execute(entity)) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(5, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (Mommecanidisplayples1Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 5, this.topPos + 27, 140, 20, new TextComponent("sponge crafting recipe"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(6, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 148, this.topPos + 27, 82, 20, new TextComponent("speed boots"), e -> {
			if (ButtonDisplayConditionProcedure.execute(entity)) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(7, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ButtonDisplayConditionProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 102, this.topPos + 49, 51, 20, new TextComponent("crate"), e -> {
			if (Buttondisplaycondition1Procedure.execute(entity)) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(8, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (Buttondisplaycondition1Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 99, this.topPos + 74, 56, 20, new TextComponent("medkit"), e -> {
			if (Btndisplcond1Procedure.execute(entity)) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(9, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (Btndisplcond1Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
	}
}
