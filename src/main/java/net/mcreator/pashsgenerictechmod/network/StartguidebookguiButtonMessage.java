
package net.mcreator.pashsgenerictechmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.pashsgenerictechmod.world.inventory.StartguidebookguiMenu;
import net.mcreator.pashsgenerictechmod.procedures.WeGoBackNowBishProcedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage9Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage8Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage7Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage4Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage3Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage2Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage20Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage1Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage13Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Iregretmydicision1Procedure;
import net.mcreator.pashsgenerictechmod.procedures.IregretmydicidiotProcedure;
import net.mcreator.pashsgenerictechmod.procedures.Gotostartguidebookgui1Procedure;
import net.mcreator.pashsgenerictechmod.PashsGenericTechModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StartguidebookguiButtonMessage {
	private final int buttonID, x, y, z;

	public StartguidebookguiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StartguidebookguiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StartguidebookguiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StartguidebookguiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = StartguidebookguiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			WeGoBackNowBishProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			Turnpage1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			Turnpage2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			Turnpage3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			Turnpage4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			Turnpage7Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			Turnpage8Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			Turnpage9Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			Turnpage13Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			IregretmydicidiotProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			Iregretmydicision1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			Turnpage20Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 13) {

			Gotostartguidebookgui1Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PashsGenericTechModMod.addNetworkMessage(StartguidebookguiButtonMessage.class, StartguidebookguiButtonMessage::buffer,
				StartguidebookguiButtonMessage::new, StartguidebookguiButtonMessage::handler);
	}
}
