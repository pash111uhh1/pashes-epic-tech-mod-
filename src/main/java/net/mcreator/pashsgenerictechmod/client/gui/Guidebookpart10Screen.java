
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

import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookpart10Menu;
import net.mcreator.pashsgenerictechmod.network.Guidebookpart10ButtonMessage;
import net.mcreator.pashsgenerictechmod.PashsGenericTechModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Guidebookpart10Screen extends AbstractContainerScreen<Guidebookpart10Menu> {
	private final static HashMap<String, Object> guistate = Guidebookpart10Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Guidebookpart10Screen(Guidebookpart10Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 237;
		this.imageHeight = 186;
	}

	private static final ResourceLocation texture = new ResourceLocation("pashs_generic_tech_mod:textures/guidebookpart_10.png");

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
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("pashs_generic_tech_mod:textures/bookgui.png"));
		this.blit(ms, this.leftPos + 2, this.topPos + 0, 0, 0, 237, 186, 237, 186);

		RenderSystem.setShaderTexture(0, new ResourceLocation("pashs_generic_tech_mod:textures/amdronkblackscotteshcyclops.png"));
		this.blit(ms, this.leftPos + 36, this.topPos + 74, 0, 0, 197, 90, 197, 90);

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
		this.font.draw(poseStack, "how to use plating machine", 51, 7, -12829636);
		this.font.draw(poseStack, "here is how you use plating machine! ", 5, 26, -12829636);
		this.font.draw(poseStack, "requires:", 5, 38, -12829636);
		this.font.draw(poseStack, "copper or gold or iron ingot ( any amount)", 4, 49, -12829636);
		this.font.draw(poseStack, "insert any ingot here", 6, 129, -12829636);
		this.font.draw(poseStack, "insert refined oil here", 47, 150, -12829636);
		this.font.draw(poseStack, "output", 182, 128, -12829636);
		this.font.draw(poseStack, "refined oil", 4, 60, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 189, this.topPos + 5, 35, 20, new TextComponent("->"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Guidebookpart10ButtonMessage(0, x, y, z));
				Guidebookpart10ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 10, this.topPos + 4, 35, 20, new TextComponent("<-"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Guidebookpart10ButtonMessage(1, x, y, z));
				Guidebookpart10ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
