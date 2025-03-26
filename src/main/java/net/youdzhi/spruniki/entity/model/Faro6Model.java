package net.youdzhi.spruniki.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzhi.spruniki.entity.Faro6Entity;

import net.minecraft.resources.ResourceLocation;

public class Faro6Model extends GeoModel<Faro6Entity> {
	@Override
	public ResourceLocation getAnimationResource(Faro6Entity entity) {
		return new ResourceLocation("spruniki", "animations/faro.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Faro6Entity entity) {
		return new ResourceLocation("spruniki", "geo/faro.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Faro6Entity entity) {
		return new ResourceLocation("spruniki", "textures/entities/" + entity.getTexture() + ".png");
	}

}
