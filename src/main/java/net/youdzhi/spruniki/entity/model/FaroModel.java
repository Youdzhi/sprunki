package net.youdzhi.spruniki.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzhi.spruniki.entity.FaroEntity;

import net.minecraft.resources.ResourceLocation;

public class FaroModel extends GeoModel<FaroEntity> {
	@Override
	public ResourceLocation getAnimationResource(FaroEntity entity) {
		return new ResourceLocation("spruniki", "animations/faro.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FaroEntity entity) {
		return new ResourceLocation("spruniki", "geo/faro.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FaroEntity entity) {
		return new ResourceLocation("spruniki", "textures/entities/" + entity.getTexture() + ".png");
	}

}
