
package net.mcreator.pashsgenerictechmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.pashsgenerictechmod.procedures.OilyArmorBootsTickEventProcedure;
import net.mcreator.pashsgenerictechmod.init.PashsGenericTechModModTabs;
import net.mcreator.pashsgenerictechmod.init.PashsGenericTechModModItems;

import java.util.List;

public abstract class OilyArmorItem extends ArmorItem {
	public OilyArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PashsGenericTechModModItems.GOLDENPLATE.get()));
			}

			@Override
			public String getName() {
				return "oily_armor";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends OilyArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("WARNING: WEARING ARMOR WITHOUT HAVING SUFFICENT AMOUNT OF FUEL WILL HURT YOU"));
			list.add(new TextComponent("requires refined fuel"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pashs_generic_tech_mod:textures/models/armor/oily_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			OilyArmorBootsTickEventProcedure.execute(world, entity);
		}
	}

	public static class Chestplate extends OilyArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("WARNING: WEARING ARMOR WITHOUT HAVING SUFFICENT AMOUNT OF FUEL WILL HURT YOU"));
			list.add(new TextComponent("requires refined fuel"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pashs_generic_tech_mod:textures/models/armor/oily_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			OilyArmorBootsTickEventProcedure.execute(world, entity);
		}
	}

	public static class Leggings extends OilyArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("WARNING: WEARING ARMOR WITHOUT HAVING SUFFICENT AMOUNT OF FUEL WILL HURT YOU"));
			list.add(new TextComponent("requires refined fuel"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pashs_generic_tech_mod:textures/models/armor/oily_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			OilyArmorBootsTickEventProcedure.execute(world, entity);
		}
	}

	public static class Boots extends OilyArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PashsGenericTechModModTabs.TAB_PASHSGENERICTECHMOD));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(new TextComponent("WARNING: WEARING ARMOR WITHOUT HAVING SUFFICENT AMOUNT OF FUEL WILL HURT YOU"));
			list.add(new TextComponent("requires refined fuel"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pashs_generic_tech_mod:textures/models/armor/oily_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			OilyArmorBootsTickEventProcedure.execute(world, entity);
		}
	}
}
