package net.youdzhi.spruniki.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.youdzhi.spruniki.entity.ComputerEvilEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class ComputerEvilModel extends GeoModel<ComputerEvilEntity> {
	@Override
	public ResourceLocation getAnimationResource(ComputerEvilEntity entity) {
		return new ResourceLocation("spruniki", "animations/compevil.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ComputerEvilEntity entity) {
		return new ResourceLocation("spruniki", "geo/compevil.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ComputerEvilEntity entity) {
		return new ResourceLocation("spruniki", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ComputerEvilEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
