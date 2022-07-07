package net.mcreator.pashsgenerictechmod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.pashsgenerictechmod.network.PashsGenericTechModModVariables;
import net.mcreator.pashsgenerictechmod.init.PashsGenericTechModModItems;
import net.mcreator.pashsgenerictechmod.init.PashsGenericTechModModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class ResearchProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready == 0) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS);
				_setstack.setCount(1);
				((Slot) _slots.get(1)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.WHEAT_SEEDS) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(2)).remove(1);
					_player.containerMenu.broadcastChanges();
				}
				{
					String _setval = "research in progress";
					entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.researchstationtext = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						{
							double _setval = (entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready + 1;
							entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.reaserchdonealready = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = "research complete";
							entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.researchstationtext = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 200);
			}
		} else {
			if ((entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready == 1) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND_PICKAXE);
					_setstack.setCount(1);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND_PICKAXE) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						((Slot) _slots.get(2)).remove(1);
						_player.containerMenu.broadcastChanges();
					}
					{
						String _setval = "research in progress";
						entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.researchstationtext = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							{
								double _setval = (entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready + 1;
								entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.reaserchdonealready = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								String _setval = "research complete";
								entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.researchstationtext = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 200);
				}
			} else {
				if ((entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready == 2) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(PashsGenericTechModModItems.REFINEDOIL.get());
						_setstack.setCount(1);
						((Slot) _slots.get(1)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
							.getItem() == PashsGenericTechModModItems.REFINEDOIL.get()) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							((Slot) _slots.get(2)).remove(1);
							_player.containerMenu.broadcastChanges();
						}
						{
							String _setval = "research in progress";
							entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.researchstationtext = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								{
									double _setval = (entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready + 1;
									entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.reaserchdonealready = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									String _setval = "research complete";
									entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.researchstationtext = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 200);
					}
				} else {
					if ((entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready == 3) {
						if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
								&& _current.get() instanceof Map _slots) {
							ItemStack _setstack = new ItemStack(PashsGenericTechModModItems.ADVANCEDCURCUIT.get());
							_setstack.setCount(1);
							((Slot) _slots.get(1)).set(_setstack);
							_player.containerMenu.broadcastChanges();
						}
						if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
								.getItem() == PashsGenericTechModModItems.ADVANCEDCURCUIT.get()) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(2)).remove(1);
								_player.containerMenu.broadcastChanges();
							}
							{
								String _setval = "research in progress";
								entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.researchstationtext = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							new Object() {
								private int ticks = 0;
								private float waitTicks;
								private LevelAccessor world;

								public void start(LevelAccessor world, int waitTicks) {
									this.waitTicks = waitTicks;
									MinecraftForge.EVENT_BUS.register(this);
									this.world = world;
								}

								@SubscribeEvent
								public void tick(TickEvent.ServerTickEvent event) {
									if (event.phase == TickEvent.Phase.END) {
										this.ticks += 1;
										if (this.ticks >= this.waitTicks)
											run();
									}
								}

								private void run() {
									{
										double _setval = (entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready + 3;
										entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.ifPresent(capability -> {
													capability.reaserchdonealready = _setval;
													capability.syncPlayerVariables(entity);
												});
									}
									{
										String _setval = "research complete";
										entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.ifPresent(capability -> {
													capability.researchstationtext = _setval;
													capability.syncPlayerVariables(entity);
												});
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 200);
						}
					} else {
						if ((entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready == 6) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack _setstack = new ItemStack(PashsGenericTechModModBlocks.PLATINGMACHINE.get());
								_setstack.setCount(1);
								((Slot) _slots.get(1)).set(_setstack);
								_player.containerMenu.broadcastChanges();
							}
							if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
									.getItem() == PashsGenericTechModModBlocks.PLATINGMACHINE.get().asItem()) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									((Slot) _slots.get(2)).remove(1);
									_player.containerMenu.broadcastChanges();
								}
								{
									String _setval = "research in progress";
									entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.researchstationtext = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										{
											double _setval = (entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready + 4;
											entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.ifPresent(capability -> {
														capability.reaserchdonealready = _setval;
														capability.syncPlayerVariables(entity);
													});
										}
										{
											String _setval = "research complete";
											entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.ifPresent(capability -> {
														capability.researchstationtext = _setval;
														capability.syncPlayerVariables(entity);
													});
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 200);
							}
						} else {
							if ((entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready == 10) {
								if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
										&& _current.get() instanceof Map _slots) {
									ItemStack _setstack = new ItemStack(PashsGenericTechModModItems.OILY_ARMOR_BOOTS.get());
									_setstack.setCount(1);
									((Slot) _slots.get(1)).set(_setstack);
									_player.containerMenu.broadcastChanges();
								}
								if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
										.getItem() == PashsGenericTechModModItems.OILY_ARMOR_BOOTS.get()) {
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										((Slot) _slots.get(2)).remove(1);
										_player.containerMenu.broadcastChanges();
									}
									{
										String _setval = "research in progress";
										entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.ifPresent(capability -> {
													capability.researchstationtext = _setval;
													capability.syncPlayerVariables(entity);
												});
									}
									new Object() {
										private int ticks = 0;
										private float waitTicks;
										private LevelAccessor world;

										public void start(LevelAccessor world, int waitTicks) {
											this.waitTicks = waitTicks;
											MinecraftForge.EVENT_BUS.register(this);
											this.world = world;
										}

										@SubscribeEvent
										public void tick(TickEvent.ServerTickEvent event) {
											if (event.phase == TickEvent.Phase.END) {
												this.ticks += 1;
												if (this.ticks >= this.waitTicks)
													run();
											}
										}

										private void run() {
											{
												double _setval = (entity
														.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready + 4;
												entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.ifPresent(capability -> {
															capability.reaserchdonealready = _setval;
															capability.syncPlayerVariables(entity);
														});
											}
											{
												String _setval = "research complete";
												entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.ifPresent(capability -> {
															capability.researchstationtext = _setval;
															capability.syncPlayerVariables(entity);
														});
											}
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 200);
								}
							} else {
								if ((entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready == 14) {
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										ItemStack _setstack = new ItemStack(PashsGenericTechModModItems.ADVANCEDCURCUIT.get());
										_setstack.setCount(1);
										((Slot) _slots.get(1)).set(_setstack);
										_player.containerMenu.broadcastChanges();
									}
									if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
											&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
											.getItem() == PashsGenericTechModModItems.ADVANCEDCURCUIT.get()) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											((Slot) _slots.get(2)).remove(1);
											_player.containerMenu.broadcastChanges();
										}
										{
											String _setval = "research in progress";
											entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
													.ifPresent(capability -> {
														capability.researchstationtext = _setval;
														capability.syncPlayerVariables(entity);
													});
										}
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private LevelAccessor world;

											public void start(LevelAccessor world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												{
													double _setval = (entity
															.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.orElse(new PashsGenericTechModModVariables.PlayerVariables())).reaserchdonealready + 6;
													entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.ifPresent(capability -> {
																capability.reaserchdonealready = _setval;
																capability.syncPlayerVariables(entity);
															});
												}
												{
													String _setval = "research complete";
													entity.getCapability(PashsGenericTechModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.ifPresent(capability -> {
																capability.researchstationtext = _setval;
																capability.syncPlayerVariables(entity);
															});
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 200);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
