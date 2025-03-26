package net.youdzhi.spruniki.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzhi.spruniki.entity.Faro5Entity;

import net.minecraft.resources.ResourceLocation;

public class Faro5Model extends GeoModel<Faro5Entity> {
	@Override
	public ResourceLocation getAnimationResource(Faro5Entity entity) {
		return new ResourceLocation("spruniki", "animations/faro.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Faro5Entity entity) {
		return new ResourceLocation("spruniki", "geo/faro.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Faro5Entity entity) {
		return new ResourceLocation("spruniki", "textures/entities/" + entity.getTexture() + ".png");
	}

}
