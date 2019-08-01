package epicsquid.superiorshields.shield.effect;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import epicsquid.superiorshields.capability.shield.IShieldCapability;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;

public class ShieldEffectNone implements IShieldEffect {

	@Override
	public void applyEffect(@Nonnull IShieldCapability shield, @Nonnull PlayerEntity player, @Nullable DamageSource source, float damage, EffectTrigger trigger) {

	}

	@Nonnull
	@Override
	public String getDescription() {
		return "";
	}
}
