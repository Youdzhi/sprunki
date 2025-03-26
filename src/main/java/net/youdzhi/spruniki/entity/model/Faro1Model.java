package net.youdzhi.spruniki.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzhi.spruniki.entity.Faro1Entity;

import net.minecraft.resources.ResourceLocation;

public class Faro1Model extends GeoModel<Faro1Entity> {
	@Override
	public ResourceLocation getAnimationResource(Faro1Entity entity) {
		return new ResourceLocation("spruniki", "animations/faro.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Faro1Entity entity) {
		return new ResourceLocation("spruniki", "geo/faro.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Faro1Entity entity) {
		return new ResourceLocation("spruniki", "textures/entities/" + entity.getTexture() + ".png");
	}

}
