package net.youdzhi.spruniki.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.youdzhi.spruniki.entity.Sprunik39Entity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class Sprunik39Model extends GeoModel<Sprunik39Entity> {
	@Override
	public ResourceLocation getAnimationResource(Sprunik39Entity entity) {
		return new ResourceLocation("spruniki", "animations/sprunky_39.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Sprunik39Entity entity) {
		return new ResourceLocation("spruniki", "geo/sprunky_39.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Sprunik39Entity entity) {
		return new ResourceLocation("spruniki", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(Sprunik39Entity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("bone2");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
