package net.dusan.betterskyblock.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.dusan.betterskyblock.item.custom.SkyblockItem;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;

public class UpgradeRarityCommand {
    public UpgradeRarityCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("home").then(Commands.literal("set")
                .executes(this::execute)));
    }

    private int execute(CommandContext<CommandSourceStack> context) {
        ServerPlayer player = context.getSource().getPlayer();
        ItemStack itemStack = player.getMainHandItem();
        if (itemStack.getItem() instanceof SkyblockItem skyblockItem) {
            skyblockItem.upgradeRarity(itemStack);
            context.getSource().sendSuccess(() -> Component.literal("Item upgraded"), true);
        } else {
            context.getSource().sendFailure(Component.literal("Item doesn't have a rarity"));
        }
        return 1;
    }
}
