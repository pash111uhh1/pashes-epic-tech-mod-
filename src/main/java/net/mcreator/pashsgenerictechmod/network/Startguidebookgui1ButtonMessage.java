
package net.mcreator.pashsgenerictechmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.pashsgenerictechmod.world.inventory.Startguidebookgui1Menu;
import net.mcreator.pashsgenerictechmod.procedures.WeGoBackNowBishProcedure;
import net.mcreator.pashsgenerictechmod.procedures.TurnpagetoteleportProcedure;
import net.mcreator.pashsgenerictechmod.procedures.TurnpagetospongecraftProcedure;
import net.mcreator.pashsgenerictechmod.procedures.TurnpagetospeedbootrecipeProcedure;
import net.mcreator.pashsgenerictechmod.procedures.TurnpagetoresearchProcedure;
import net.mcreator.pashsgenerictechmod.procedures.TurnpagetocrateProcedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage22Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage19Procedure;
import net.mcreator.pashsgenerictechmod.procedures.Turnpage12Procedure;
import net.mcreator.pashsgenerictechmod.PashsGenericTechModMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Startguidebookgui1ButtonMessage {
	private final int buttonID, x, y, z;

	public Startguidebookgui1ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public Startguidebookgui1ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(Startguidebookgui1ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(Startguidebookgui1ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = Startguidebookgui1Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			WeGoBackNowBishProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			Turnpage19Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			Turnpage22Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			Turnpage12Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			TurnpagetoresearchProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			TurnpagetoteleportProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			TurnpagetospongecraftProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			TurnpagetospeedbootrecipeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			TurnpagetocrateProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PashsGenericTechModMod.addNetworkMessage(Startguidebookgui1ButtonMessage.class, Startguidebookgui1ButtonMessage::buffer,
				Startguidebookgui1ButtonMessage::new, Startguidebookgui1ButtonMessage::handler);
	}
}
