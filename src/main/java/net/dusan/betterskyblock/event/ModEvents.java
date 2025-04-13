package net.dusan.betterskyblock.event;

import net.dusan.betterskyblock.BetterSkyblock;
import net.dusan.betterskyblock.commands.UpgradeRarityCommand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = BetterSkyblock.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {
        new UpgradeRarityCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }
}
