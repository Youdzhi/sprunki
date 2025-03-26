package net.youdzhi.spruniki.procedures;

import net.youdzhi.spruniki.entity.FaroEntity;
import net.youdzhi.spruniki.entity.Faro7Entity;
import net.youdzhi.spruniki.entity.Faro6Entity;
import net.youdzhi.spruniki.entity.Faro5Entity;
import net.youdzhi.spruniki.entity.Faro4Entity;
import net.youdzhi.spruniki.entity.Faro3Entity;
import net.youdzhi.spruniki.entity.Faro2Entity;
import net.youdzhi.spruniki.entity.Faro1Entity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import java.util.List;
import java.util.Comparator;

public class FaroOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof FaroEntity) && !(entityiterator instanceof Faro1Entity) && !(entityiterator instanceof Faro2Entity) && !(entityiterator instanceof Faro3Entity) && !(entityiterator instanceof Faro4Entity)
						&& !(entityiterator instanceof Faro5Entity) && !(entityiterator instanceof Faro7Entity) && !(entityiterator instanceof Faro6Entity)) {
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1);
				}
			}
		}
	}
}
