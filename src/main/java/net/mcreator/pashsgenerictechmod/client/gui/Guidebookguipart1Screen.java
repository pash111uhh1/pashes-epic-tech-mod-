
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

import net.mcreator.pashsgenerictechmod.world.inventory.Guidebookguipart1Menu;
import net.mcreator.pashsgenerictechmod.network.Guidebookguipart1ButtonMessage;
import net.mcreator.pashsgenerictechmod.PashsGenericTechModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Guidebookguipart1Screen extends AbstractContainerScreen<Guidebookguipart1Menu> {
	private final static HashMap<String, Object> guistate = Guidebookguipart1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public Guidebookguipart1Screen(Guidebookguipart1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 237;
		this.imageHeight = 186;
	}

	private static final ResourceLocation texture = new ResourceLocation("pashs_generic_tech_mod:textures/guidebookguipart_1.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("pashs_generic_tech_mod:textures/oilrefinerycraftrecipe.png"));
		this.blit(ms, this.leftPos + 103, this.topPos + 60, 0, 0, 114, 110, 114, 110);

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
		this.font.draw(poseStack, "oil refinery", 85, 7, -12829636);
		this.font.draw(poseStack, "oil refinery is your gateway into this mod!", 5, 29, -12829636);
		this.font.draw(poseStack, "requires:", 10, 67, -12829636);
		this.font.draw(poseStack, "oil canister", 7, 86, -12829636);
		this.font.draw(poseStack, "circuit", 7, 100, -12829636);
		this.font.draw(poseStack, "machine casing", 6, 114, -12829636);
		this.font.draw(poseStack, "copper plate", 5, 128, -12829636);
		this.font.draw(poseStack, "filtering sponge", 5, 142, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 8, this.topPos + 4, 35, 20, new TextComponent("<-"), e -> {
			if (true) {
				PashsGenericTechModMod.PACKET_HANDLER.sendToServer(new Guidebookguipart1ButtonMessage(0, x, y, z));
				Guidebookguipart1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
