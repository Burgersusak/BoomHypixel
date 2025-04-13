package net.dusan.betterskyblock.util.mixin;

import net.dusan.betterskyblock.BetterSkyblock;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayerGameMode;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayerGameMode.class)
public class ExampleMixin {

    @Inject(method = "incrementDestroyProgress", at = @At("HEAD"))
    private void incrementDestroyProgress(BlockState pState, BlockPos pPos, int p_9279_, CallbackInfoReturnable<Float> cir) {
        BetterSkyblock.LOGGER.info("Mixin is working!");
    }
}
