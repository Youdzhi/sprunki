package net.youdzhi.spruniki.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.youdzhi.spruniki.entity.WendaEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class WendaModel extends GeoModel<WendaEntity> {
	@Override
	public ResourceLocation getAnimationResource(WendaEntity entity) {
		return new ResourceLocation("spruniki", "animations/sprunkiwenda.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WendaEntity entity) {
		return new ResourceLocation("spruniki", "geo/sprunkiwenda.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WendaEntity entity) {
		return new ResourceLocation("spruniki", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(WendaEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
