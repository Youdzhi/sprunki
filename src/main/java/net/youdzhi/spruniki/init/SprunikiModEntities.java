
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.youdzhi.spruniki.init;

import net.youdzhi.spruniki.entity.WendaEntity;
import net.youdzhi.spruniki.entity.TreeGoodEntity;
import net.youdzhi.spruniki.entity.TreeBadEntity;
import net.youdzhi.spruniki.entity.Sprunik9Entity;
import net.youdzhi.spruniki.entity.Sprunik8Entity;
import net.youdzhi.spruniki.entity.Sprunik7Entity;
import net.youdzhi.spruniki.entity.Sprunik6Entity;
import net.youdzhi.spruniki.entity.Sprunik5Entity;
import net.youdzhi.spruniki.entity.Sprunik4Entity;
import net.youdzhi.spruniki.entity.Sprunik40Entity;
import net.youdzhi.spruniki.entity.Sprunik3Entity;
import net.youdzhi.spruniki.entity.Sprunik39Entity;
import net.youdzhi.spruniki.entity.Sprunik38Entity;
import net.youdzhi.spruniki.entity.Sprunik37Entity;
import net.youdzhi.spruniki.entity.Sprunik36Entity;
import net.youdzhi.spruniki.entity.Sprunik35Entity;
import net.youdzhi.spruniki.entity.Sprunik34Entity;
import net.youdzhi.spruniki.entity.Sprunik33Entity;
import net.youdzhi.spruniki.entity.Sprunik32Entity;
import net.youdzhi.spruniki.entity.Sprunik31Entity;
import net.youdzhi.spruniki.entity.Sprunik30Entity;
import net.youdzhi.spruniki.entity.Sprunik2Entity;
import net.youdzhi.spruniki.entity.Sprunik29Entity;
import net.youdzhi.spruniki.entity.Sprunik28Entity;
import net.youdzhi.spruniki.entity.Sprunik27Entity;
import net.youdzhi.spruniki.entity.Sprunik26Entity;
import net.youdzhi.spruniki.entity.Sprunik25Entity;
import net.youdzhi.spruniki.entity.Sprunik24Entity;
import net.youdzhi.spruniki.entity.Sprunik23Entity;
import net.youdzhi.spruniki.entity.Sprunik22Entity;
import net.youdzhi.spruniki.entity.Sprunik21Entity;
import net.youdzhi.spruniki.entity.Sprunik20Entity;
import net.youdzhi.spruniki.entity.Sprunik1Entity;
import net.youdzhi.spruniki.entity.Sprunik19Entity;
import net.youdzhi.spruniki.entity.Sprunik18Entity;
import net.youdzhi.spruniki.entity.Sprunik17Entity;
import net.youdzhi.spruniki.entity.Sprunik16Entity;
import net.youdzhi.spruniki.entity.Sprunik15Entity;
import net.youdzhi.spruniki.entity.Sprunik14Entity;
import net.youdzhi.spruniki.entity.Sprunik13Entity;
import net.youdzhi.spruniki.entity.Sprunik12Entity;
import net.youdzhi.spruniki.entity.Sprunik11Entity;
import net.youdzhi.spruniki.entity.Sprunik10Entity;
import net.youdzhi.spruniki.entity.FaroEntity;
import net.youdzhi.spruniki.entity.Faro7Entity;
import net.youdzhi.spruniki.entity.Faro6Entity;
import net.youdzhi.spruniki.entity.Faro5Entity;
import net.youdzhi.spruniki.entity.Faro4Entity;
import net.youdzhi.spruniki.entity.Faro3Entity;
import net.youdzhi.spruniki.entity.Faro2Entity;
import net.youdzhi.spruniki.entity.Faro1Entity;
import net.youdzhi.spruniki.entity.ComputerGoodEntity;
import net.youdzhi.spruniki.entity.ComputerEvilEntity;
import net.youdzhi.spruniki.SprunikiMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SprunikiModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SprunikiMod.MODID);
	public static final RegistryObject<EntityType<Sprunik1Entity>> SPRUNIK_1 = register("sprunik_1",
			EntityType.Builder.<Sprunik1Entity>of(Sprunik1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik2Entity>> SPRUNIK_2 = register("sprunik_2",
			EntityType.Builder.<Sprunik2Entity>of(Sprunik2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik3Entity>> SPRUNIK_3 = register("sprunik_3",
			EntityType.Builder.<Sprunik3Entity>of(Sprunik3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik4Entity>> SPRUNIK_4 = register("sprunik_4",
			EntityType.Builder.<Sprunik4Entity>of(Sprunik4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik5Entity>> SPRUNIK_5 = register("sprunik_5",
			EntityType.Builder.<Sprunik5Entity>of(Sprunik5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik6Entity>> SPRUNIK_6 = register("sprunik_6",
			EntityType.Builder.<Sprunik6Entity>of(Sprunik6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik7Entity>> SPRUNIK_7 = register("sprunik_7",
			EntityType.Builder.<Sprunik7Entity>of(Sprunik7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik8Entity>> SPRUNIK_8 = register("sprunik_8",
			EntityType.Builder.<Sprunik8Entity>of(Sprunik8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik8Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik9Entity>> SPRUNIK_9 = register("sprunik_9",
			EntityType.Builder.<Sprunik9Entity>of(Sprunik9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik9Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik10Entity>> SPRUNIK_10 = register("sprunik_10",
			EntityType.Builder.<Sprunik10Entity>of(Sprunik10Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik10Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik11Entity>> SPRUNIK_11 = register("sprunik_11",
			EntityType.Builder.<Sprunik11Entity>of(Sprunik11Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik11Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik12Entity>> SPRUNIK_12 = register("sprunik_12",
			EntityType.Builder.<Sprunik12Entity>of(Sprunik12Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik12Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik13Entity>> SPRUNIK_13 = register("sprunik_13",
			EntityType.Builder.<Sprunik13Entity>of(Sprunik13Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik13Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik14Entity>> SPRUNIK_14 = register("sprunik_14",
			EntityType.Builder.<Sprunik14Entity>of(Sprunik14Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik14Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik15Entity>> SPRUNIK_15 = register("sprunik_15",
			EntityType.Builder.<Sprunik15Entity>of(Sprunik15Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik15Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik16Entity>> SPRUNIK_16 = register("sprunik_16",
			EntityType.Builder.<Sprunik16Entity>of(Sprunik16Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik16Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik17Entity>> SPRUNIK_17 = register("sprunik_17",
			EntityType.Builder.<Sprunik17Entity>of(Sprunik17Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik17Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik18Entity>> SPRUNIK_18 = register("sprunik_18",
			EntityType.Builder.<Sprunik18Entity>of(Sprunik18Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik18Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik19Entity>> SPRUNIK_19 = register("sprunik_19",
			EntityType.Builder.<Sprunik19Entity>of(Sprunik19Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik19Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik20Entity>> SPRUNIK_20 = register("sprunik_20",
			EntityType.Builder.<Sprunik20Entity>of(Sprunik20Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik20Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ComputerGoodEntity>> COMPUTER_GOOD = register("computer_good",
			EntityType.Builder.<ComputerGoodEntity>of(ComputerGoodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ComputerGoodEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ComputerEvilEntity>> COMPUTER_EVIL = register("computer_evil",
			EntityType.Builder.<ComputerEvilEntity>of(ComputerEvilEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ComputerEvilEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TreeGoodEntity>> TREE_GOOD = register("tree_good",
			EntityType.Builder.<TreeGoodEntity>of(TreeGoodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TreeGoodEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TreeBadEntity>> TREE_BAD = register("tree_bad",
			EntityType.Builder.<TreeBadEntity>of(TreeBadEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TreeBadEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik21Entity>> SPRUNIK_21 = register("sprunik_21",
			EntityType.Builder.<Sprunik21Entity>of(Sprunik21Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik21Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik22Entity>> SPRUNIK_22 = register("sprunik_22",
			EntityType.Builder.<Sprunik22Entity>of(Sprunik22Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik22Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik23Entity>> SPRUNIK_23 = register("sprunik_23",
			EntityType.Builder.<Sprunik23Entity>of(Sprunik23Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik23Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik24Entity>> SPRUNIK_24 = register("sprunik_24",
			EntityType.Builder.<Sprunik24Entity>of(Sprunik24Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik24Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik25Entity>> SPRUNIK_25 = register("sprunik_25",
			EntityType.Builder.<Sprunik25Entity>of(Sprunik25Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik25Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik26Entity>> SPRUNIK_26 = register("sprunik_26",
			EntityType.Builder.<Sprunik26Entity>of(Sprunik26Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik26Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik27Entity>> SPRUNIK_27 = register("sprunik_27",
			EntityType.Builder.<Sprunik27Entity>of(Sprunik27Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik27Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik28Entity>> SPRUNIK_28 = register("sprunik_28",
			EntityType.Builder.<Sprunik28Entity>of(Sprunik28Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik28Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik29Entity>> SPRUNIK_29 = register("sprunik_29",
			EntityType.Builder.<Sprunik29Entity>of(Sprunik29Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik29Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik30Entity>> SPRUNIK_30 = register("sprunik_30",
			EntityType.Builder.<Sprunik30Entity>of(Sprunik30Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik30Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FaroEntity>> FARO = register("faro",
			EntityType.Builder.<FaroEntity>of(FaroEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FaroEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Faro1Entity>> FARO_1 = register("faro_1",
			EntityType.Builder.<Faro1Entity>of(Faro1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Faro1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Faro2Entity>> FARO_2 = register("faro_2",
			EntityType.Builder.<Faro2Entity>of(Faro2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Faro2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Faro3Entity>> FARO_3 = register("faro_3",
			EntityType.Builder.<Faro3Entity>of(Faro3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Faro3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Faro4Entity>> FARO_4 = register("faro_4",
			EntityType.Builder.<Faro4Entity>of(Faro4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Faro4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Faro5Entity>> FARO_5 = register("faro_5",
			EntityType.Builder.<Faro5Entity>of(Faro5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Faro5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Faro6Entity>> FARO_6 = register("faro_6",
			EntityType.Builder.<Faro6Entity>of(Faro6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Faro6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Faro7Entity>> FARO_7 = register("faro_7",
			EntityType.Builder.<Faro7Entity>of(Faro7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Faro7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WendaEntity>> WENDA = register("wenda",
			EntityType.Builder.<WendaEntity>of(WendaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WendaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik31Entity>> SPRUNIK_31 = register("sprunik_31",
			EntityType.Builder.<Sprunik31Entity>of(Sprunik31Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik31Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik32Entity>> SPRUNIK_32 = register("sprunik_32",
			EntityType.Builder.<Sprunik32Entity>of(Sprunik32Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik32Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik33Entity>> SPRUNIK_33 = register("sprunik_33",
			EntityType.Builder.<Sprunik33Entity>of(Sprunik33Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik33Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik34Entity>> SPRUNIK_34 = register("sprunik_34",
			EntityType.Builder.<Sprunik34Entity>of(Sprunik34Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik34Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik35Entity>> SPRUNIK_35 = register("sprunik_35",
			EntityType.Builder.<Sprunik35Entity>of(Sprunik35Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik35Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik36Entity>> SPRUNIK_36 = register("sprunik_36",
			EntityType.Builder.<Sprunik36Entity>of(Sprunik36Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik36Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik37Entity>> SPRUNIK_37 = register("sprunik_37",
			EntityType.Builder.<Sprunik37Entity>of(Sprunik37Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik37Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik38Entity>> SPRUNIK_38 = register("sprunik_38",
			EntityType.Builder.<Sprunik38Entity>of(Sprunik38Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik38Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik39Entity>> SPRUNIK_39 = register("sprunik_39",
			EntityType.Builder.<Sprunik39Entity>of(Sprunik39Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik39Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Sprunik40Entity>> SPRUNIK_40 = register("sprunik_40",
			EntityType.Builder.<Sprunik40Entity>of(Sprunik40Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Sprunik40Entity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Sprunik1Entity.init();
			Sprunik2Entity.init();
			Sprunik3Entity.init();
			Sprunik4Entity.init();
			Sprunik5Entity.init();
			Sprunik6Entity.init();
			Sprunik7Entity.init();
			Sprunik8Entity.init();
			Sprunik9Entity.init();
			Sprunik10Entity.init();
			Sprunik11Entity.init();
			Sprunik12Entity.init();
			Sprunik13Entity.init();
			Sprunik14Entity.init();
			Sprunik15Entity.init();
			Sprunik16Entity.init();
			Sprunik17Entity.init();
			Sprunik18Entity.init();
			Sprunik19Entity.init();
			Sprunik20Entity.init();
			ComputerGoodEntity.init();
			ComputerEvilEntity.init();
			TreeGoodEntity.init();
			TreeBadEntity.init();
			Sprunik21Entity.init();
			Sprunik22Entity.init();
			Sprunik23Entity.init();
			Sprunik24Entity.init();
			Sprunik25Entity.init();
			Sprunik26Entity.init();
			Sprunik27Entity.init();
			Sprunik28Entity.init();
			Sprunik29Entity.init();
			Sprunik30Entity.init();
			FaroEntity.init();
			Faro1Entity.init();
			Faro2Entity.init();
			Faro3Entity.init();
			Faro4Entity.init();
			Faro5Entity.init();
			Faro6Entity.init();
			Faro7Entity.init();
			WendaEntity.init();
			Sprunik31Entity.init();
			Sprunik32Entity.init();
			Sprunik33Entity.init();
			Sprunik34Entity.init();
			Sprunik35Entity.init();
			Sprunik36Entity.init();
			Sprunik37Entity.init();
			Sprunik38Entity.init();
			Sprunik39Entity.init();
			Sprunik40Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SPRUNIK_1.get(), Sprunik1Entity.createAttributes().build());
		event.put(SPRUNIK_2.get(), Sprunik2Entity.createAttributes().build());
		event.put(SPRUNIK_3.get(), Sprunik3Entity.createAttributes().build());
		event.put(SPRUNIK_4.get(), Sprunik4Entity.createAttributes().build());
		event.put(SPRUNIK_5.get(), Sprunik5Entity.createAttributes().build());
		event.put(SPRUNIK_6.get(), Sprunik6Entity.createAttributes().build());
		event.put(SPRUNIK_7.get(), Sprunik7Entity.createAttributes().build());
		event.put(SPRUNIK_8.get(), Sprunik8Entity.createAttributes().build());
		event.put(SPRUNIK_9.get(), Sprunik9Entity.createAttributes().build());
		event.put(SPRUNIK_10.get(), Sprunik10Entity.createAttributes().build());
		event.put(SPRUNIK_11.get(), Sprunik11Entity.createAttributes().build());
		event.put(SPRUNIK_12.get(), Sprunik12Entity.createAttributes().build());
		event.put(SPRUNIK_13.get(), Sprunik13Entity.createAttributes().build());
		event.put(SPRUNIK_14.get(), Sprunik14Entity.createAttributes().build());
		event.put(SPRUNIK_15.get(), Sprunik15Entity.createAttributes().build());
		event.put(SPRUNIK_16.get(), Sprunik16Entity.createAttributes().build());
		event.put(SPRUNIK_17.get(), Sprunik17Entity.createAttributes().build());
		event.put(SPRUNIK_18.get(), Sprunik18Entity.createAttributes().build());
		event.put(SPRUNIK_19.get(), Sprunik19Entity.createAttributes().build());
		event.put(SPRUNIK_20.get(), Sprunik20Entity.createAttributes().build());
		event.put(COMPUTER_GOOD.get(), ComputerGoodEntity.createAttributes().build());
		event.put(COMPUTER_EVIL.get(), ComputerEvilEntity.createAttributes().build());
		event.put(TREE_GOOD.get(), TreeGoodEntity.createAttributes().build());
		event.put(TREE_BAD.get(), TreeBadEntity.createAttributes().build());
		event.put(SPRUNIK_21.get(), Sprunik21Entity.createAttributes().build());
		event.put(SPRUNIK_22.get(), Sprunik22Entity.createAttributes().build());
		event.put(SPRUNIK_23.get(), Sprunik23Entity.createAttributes().build());
		event.put(SPRUNIK_24.get(), Sprunik24Entity.createAttributes().build());
		event.put(SPRUNIK_25.get(), Sprunik25Entity.createAttributes().build());
		event.put(SPRUNIK_26.get(), Sprunik26Entity.createAttributes().build());
		event.put(SPRUNIK_27.get(), Sprunik27Entity.createAttributes().build());
		event.put(SPRUNIK_28.get(), Sprunik28Entity.createAttributes().build());
		event.put(SPRUNIK_29.get(), Sprunik29Entity.createAttributes().build());
		event.put(SPRUNIK_30.get(), Sprunik30Entity.createAttributes().build());
		event.put(FARO.get(), FaroEntity.createAttributes().build());
		event.put(FARO_1.get(), Faro1Entity.createAttributes().build());
		event.put(FARO_2.get(), Faro2Entity.createAttributes().build());
		event.put(FARO_3.get(), Faro3Entity.createAttributes().build());
		event.put(FARO_4.get(), Faro4Entity.createAttributes().build());
		event.put(FARO_5.get(), Faro5Entity.createAttributes().build());
		event.put(FARO_6.get(), Faro6Entity.createAttributes().build());
		event.put(FARO_7.get(), Faro7Entity.createAttributes().build());
		event.put(WENDA.get(), WendaEntity.createAttributes().build());
		event.put(SPRUNIK_31.get(), Sprunik31Entity.createAttributes().build());
		event.put(SPRUNIK_32.get(), Sprunik32Entity.createAttributes().build());
		event.put(SPRUNIK_33.get(), Sprunik33Entity.createAttributes().build());
		event.put(SPRUNIK_34.get(), Sprunik34Entity.createAttributes().build());
		event.put(SPRUNIK_35.get(), Sprunik35Entity.createAttributes().build());
		event.put(SPRUNIK_36.get(), Sprunik36Entity.createAttributes().build());
		event.put(SPRUNIK_37.get(), Sprunik37Entity.createAttributes().build());
		event.put(SPRUNIK_38.get(), Sprunik38Entity.createAttributes().build());
		event.put(SPRUNIK_39.get(), Sprunik39Entity.createAttributes().build());
		event.put(SPRUNIK_40.get(), Sprunik40Entity.createAttributes().build());
	}
}
