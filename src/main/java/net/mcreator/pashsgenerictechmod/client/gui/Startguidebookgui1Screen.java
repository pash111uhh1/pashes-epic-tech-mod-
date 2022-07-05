
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
import net.mcreator.pashsgenerictechmod.procedures.Mommecanidisplayples1Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Mommacanidisplaymyfriend1Procedure;
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
			this.font.draw(poseStack, "REQUIRES 10 RESEARCH POINTS", 9, 130, -16777216);
		this.font.draw(poseStack, "research points - " + ((entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready) + "", 7, 169, -16777216);
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
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 31, 87, 20, new TextComponent("extractor"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(1, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 55, 77, 20, new TextComponent("foodstuffs"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(2, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 79, 108, 20, new TextComponent("advanced circuit"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(3, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 102, 108, 20, new TextComponent("research station"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Startguidebookgui1ButtonMessage(4, x, y, z));
				Startguidebookgui1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 7, this.topPos + 124, 56, 20, new TextComponent("teleporter"), e -> {
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
	}
}
