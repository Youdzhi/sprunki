package net.youdzhi.spruniki.procedures;

import net.youdzhi.spruniki.SprunikiMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class FaroOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		SprunikiMod.queueServerWork(60, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
