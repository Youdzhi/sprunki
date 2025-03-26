package net.youdzhi.spruniki.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzhi.spruniki.entity.Faro4Entity;

import net.minecraft.resources.ResourceLocation;

public class Faro4Model extends GeoModel<Faro4Entity> {
	@Override
	public ResourceLocation getAnimationResource(Faro4Entity entity) {
		return new ResourceLocation("spruniki", "animations/faro.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Faro4Entity entity) {
		return new ResourceLocation("spruniki", "geo/faro.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Faro4Entity entity) {
		return new ResourceLocation("spruniki", "textures/entities/" + entity.getTexture() + ".png");
	}

}
