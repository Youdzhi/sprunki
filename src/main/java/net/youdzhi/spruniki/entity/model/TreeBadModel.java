package net.youdzhi.spruniki.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzhi.spruniki.entity.TreeBadEntity;

import net.minecraft.resources.ResourceLocation;

public class TreeBadModel extends GeoModel<TreeBadEntity> {
	@Override
	public ResourceLocation getAnimationResource(TreeBadEntity entity) {
		return new ResourceLocation("spruniki", "animations/treeevil.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TreeBadEntity entity) {
		return new ResourceLocation("spruniki", "geo/treeevil.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TreeBadEntity entity) {
		return new ResourceLocation("spruniki", "textures/entities/" + entity.getTexture() + ".png");
	}

}
