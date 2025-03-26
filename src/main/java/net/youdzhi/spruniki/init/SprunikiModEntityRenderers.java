
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.youdzhi.spruniki.init;

import net.youdzhi.spruniki.client.renderer.WendaRenderer;
import net.youdzhi.spruniki.client.renderer.TreeGoodRenderer;
import net.youdzhi.spruniki.client.renderer.TreeBadRenderer;
import net.youdzhi.spruniki.client.renderer.Sprunik9Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik8Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik7Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik6Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik5Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik4Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik40Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik3Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik39Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik38Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik37Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik36Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik35Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik34Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik33Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik32Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik31Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik30Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik2Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik29Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik28Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik27Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik26Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik25Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik24Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik23Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik22Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik21Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik20Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik1Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik19Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik18Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik17Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik16Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik15Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik14Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik13Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik12Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik11Renderer;
import net.youdzhi.spruniki.client.renderer.Sprunik10Renderer;
import net.youdzhi.spruniki.client.renderer.FaroRenderer;
import net.youdzhi.spruniki.client.renderer.Faro7Renderer;
import net.youdzhi.spruniki.client.renderer.Faro6Renderer;
import net.youdzhi.spruniki.client.renderer.Faro5Renderer;
import net.youdzhi.spruniki.client.renderer.Faro4Renderer;
import net.youdzhi.spruniki.client.renderer.Faro3Renderer;
import net.youdzhi.spruniki.client.renderer.Faro2Renderer;
import net.youdzhi.spruniki.client.renderer.Faro1Renderer;
import net.youdzhi.spruniki.client.renderer.ComputerGoodRenderer;
import net.youdzhi.spruniki.client.renderer.ComputerEvilRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SprunikiModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_1.get(), Sprunik1Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_2.get(), Sprunik2Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_3.get(), Sprunik3Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_4.get(), Sprunik4Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_5.get(), Sprunik5Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_6.get(), Sprunik6Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_7.get(), Sprunik7Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_8.get(), Sprunik8Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_9.get(), Sprunik9Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_10.get(), Sprunik10Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_11.get(), Sprunik11Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_12.get(), Sprunik12Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_13.get(), Sprunik13Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_14.get(), Sprunik14Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_15.get(), Sprunik15Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_16.get(), Sprunik16Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_17.get(), Sprunik17Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_18.get(), Sprunik18Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_19.get(), Sprunik19Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_20.get(), Sprunik20Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.COMPUTER_GOOD.get(), ComputerGoodRenderer::new);
		event.registerEntityRenderer(SprunikiModEntities.COMPUTER_EVIL.get(), ComputerEvilRenderer::new);
		event.registerEntityRenderer(SprunikiModEntities.TREE_GOOD.get(), TreeGoodRenderer::new);
		event.registerEntityRenderer(SprunikiModEntities.TREE_BAD.get(), TreeBadRenderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_21.get(), Sprunik21Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_22.get(), Sprunik22Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_23.get(), Sprunik23Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_24.get(), Sprunik24Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_25.get(), Sprunik25Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_26.get(), Sprunik26Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_27.get(), Sprunik27Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_28.get(), Sprunik28Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_29.get(), Sprunik29Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_30.get(), Sprunik30Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.FARO.get(), FaroRenderer::new);
		event.registerEntityRenderer(SprunikiModEntities.FARO_1.get(), Faro1Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.FARO_2.get(), Faro2Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.FARO_3.get(), Faro3Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.FARO_4.get(), Faro4Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.FARO_5.get(), Faro5Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.FARO_6.get(), Faro6Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.FARO_7.get(), Faro7Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.WENDA.get(), WendaRenderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_31.get(), Sprunik31Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_32.get(), Sprunik32Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_33.get(), Sprunik33Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_34.get(), Sprunik34Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_35.get(), Sprunik35Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_36.get(), Sprunik36Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_37.get(), Sprunik37Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_38.get(), Sprunik38Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_39.get(), Sprunik39Renderer::new);
		event.registerEntityRenderer(SprunikiModEntities.SPRUNIK_40.get(), Sprunik40Renderer::new);
	}
}
