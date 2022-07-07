
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

import net.mcreator.pashsgenerictechmod.world.inventory.SpeedbootsrecipeMenu;
import net.mcreator.pashsgenerictechmod.network.SpeedbootsrecipeButtonMessage;
import net.mcreator.pashsgenerictechmod.PashsGenericTechModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SpeedbootsrecipeScreen extends AbstractContainerScreen<SpeedbootsrecipeMenu> {
	private final static HashMap<String, Object> guistate = SpeedbootsrecipeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SpeedbootsrecipeScreen(SpeedbootsrecipeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 237;
		this.imageHeight = 186;
	}

	private static final ResourceLocation texture = new ResourceLocation("pashs_generic_tech_mod:textures/speedbootsrecipe.png");

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
		this.blit(ms, this.leftPos + -1, this.topPos + -1, 0, 0, 237, 186, 237, 186);

		RenderSystem.setShaderTexture(0, new ResourceLocation("pashs_generic_tech_mod:textures/oilybootsplus4ironplate.png"));
		this.blit(ms, this.leftPos + 111, this.topPos + 58, 0, 0, 114, 116, 114, 116);

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
		this.font.draw(poseStack, "speed boots", 85, 7, -12829636);
		this.font.draw(poseStack, "consumes oil at the same rate as oily boots", 6, 26, -12829636);
		this.font.draw(poseStack, "requires:", 10, 67, -12829636);
		this.font.draw(poseStack, "any coal x4", 9, 83, -12829636);
		this.font.draw(poseStack, "oily boots x1", 8, 96, -12829636);
		this.font.draw(poseStack, "!REQUIRES REFINED OIL!", 4, 50, -3407821);
		this.font.draw(poseStack, "provides speed boost if fueled ", 5, 37, -12829636);
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
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new SpeedbootsrecipeButtonMessage(0, x, y, z));
				SpeedbootsrecipeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
