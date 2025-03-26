package net.youdzhi.spruniki.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.youdzhi.spruniki.entity.ComputerGoodEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class ComputerGoodModel extends GeoModel<ComputerGoodEntity> {
	@Override
	public ResourceLocation getAnimationResource(ComputerGoodEntity entity) {
		return new ResourceLocation("spruniki", "animations/compgood.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ComputerGoodEntity entity) {
		return new ResourceLocation("spruniki", "geo/compgood.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ComputerGoodEntity entity) {
		return new ResourceLocation("spruniki", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ComputerGoodEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
