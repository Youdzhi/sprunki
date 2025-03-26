package net.youdzhi.spruniki.procedures;

import net.youdzhi.spruniki.init.SprunikiModEntities;
import net.youdzhi.spruniki.SprunikiMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class FF2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.NOTE, x, y, z, 128, 1, 1, 1, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.AMBIENT_ENTITY_EFFECT, x, y, z, 64, 1, 1, 1, 0);
			SprunikiMod.queueServerWork(30, () -> {
				for (int index0 = 0; index0 < 12; index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = SprunikiModEntities.FARO_1.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
				}
				SprunikiMod.queueServerWork(10, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "spreadplayers ~ ~ 1 16 false @e[type=spruniki:faro_1]");
						}
					}
				});
			});
		}
	}
}
