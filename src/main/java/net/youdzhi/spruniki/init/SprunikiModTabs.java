
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.youdzhi.spruniki.init;

import net.youdzhi.spruniki.SprunikiMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SprunikiModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SprunikiMod.MODID);
	public static final RegistryObject<CreativeModeTab> SPRUNKY = REGISTRY.register("sprunky",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.spruniki.sprunky")).icon(() -> new ItemStack(SprunikiModItems.SPRUNIK_1_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SprunikiModItems.SPRUNIK_2_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_1_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_3_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_4_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_5_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_6_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_7_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_8_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_9_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_10_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_11_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_12_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_13_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_14_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_15_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_16_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_17_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_18_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_19_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_20_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.COMPUTER_GOOD_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.COMPUTER_EVIL_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.TREE_GOOD_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.TREE_BAD_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_21_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_22_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_23_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_24_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_25_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_26_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_27_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_28_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_29_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_30_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.RAINBOW_BEAM.get());
				tabData.accept(SprunikiModItems.FARO_1_BEAM.get());
				tabData.accept(SprunikiModItems.FARO_2_BEAM.get());
				tabData.accept(SprunikiModItems.FARO_3_BEAM.get());
				tabData.accept(SprunikiModItems.FARO_4_BEAM.get());
				tabData.accept(SprunikiModItems.FARO_5_BEAM.get());
				tabData.accept(SprunikiModItems.FARO_7_BEAM.get());
				tabData.accept(SprunikiModItems.WENDA_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_31_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_32_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_33_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_34_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_35_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_36_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_37_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_38_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_39_SPAWN_EGG.get());
				tabData.accept(SprunikiModItems.SPRUNIK_40_SPAWN_EGG.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(SprunikiModItems.FARO_SPAWN_EGG.get());
		}
	}
}
