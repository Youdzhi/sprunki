package net.youdzhi.spruniki.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzhi.spruniki.entity.TreeGoodEntity;

import net.minecraft.resources.ResourceLocation;

public class TreeGoodModel extends GeoModel<TreeGoodEntity> {
	@Override
	public ResourceLocation getAnimationResource(TreeGoodEntity entity) {
		return new ResourceLocation("spruniki", "animations/treegood.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TreeGoodEntity entity) {
		return new ResourceLocation("spruniki", "geo/treegood.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TreeGoodEntity entity) {
		return new ResourceLocation("spruniki", "textures/entities/" + entity.getTexture() + ".png");
	}

}
