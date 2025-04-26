package net.dusan.betterskyblock.item.custom;

import net.dusan.betterskyblock.util.Rarity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;

public class ContactTrioItem extends SkyblockItem{
    public ContactTrioItem(Properties pProperties) {
        super(pProperties, Rarity.SPECIAL);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Player player = pContext.getPlayer();
        if (player.getPersistentData().getInt("better_skyblock.abiphone.contact_trio") != 0) {
            player.getPersistentData().putInt("better_skyblock.abiphone.contact_trio",
                    player.getPersistentData().getInt("better_skyblock.abiphone.contact_trio") + 3);
            return InteractionResult.CONSUME;
        } else if(player.getPersistentData().getInt("better_skyblock.abiphone.contact_trio") + 3 == 45) {
            return InteractionResult.FAIL;
        } else {
            player.getPersistentData().putInt("better_skyblock.abiphone.contact_trio", 3);
            return InteractionResult.CONSUME;

        }

    }
}
