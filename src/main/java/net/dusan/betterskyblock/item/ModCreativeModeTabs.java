package net.dusan.betterskyblock.item;

import net.dusan.betterskyblock.BetterSkyblock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterSkyblock.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ITEMS = CREATIVE_MODE_TABS.register("items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.NETHER_STAR))
                    .title(Component.translatable("creativetab.better_skyblock.item_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.PESTHUNTING_GUIDE.get());
                        output.accept(ModItems.ABIPHONE_X_PLUS.get());
                        output.accept(ModItems.ABIPHONE_X_PLUS_SPECIAL_EDITION.get());
                        output.accept(ModItems.ABIPHONE_XI_ULTRA.get());
                        output.accept(ModItems.ABIPHONE_XI_ULTRA_STYLE.get());
                        output.accept(ModItems.ABIPHONE_XII_MEGA.get());
                        output.accept(ModItems.ABIPHONE_XII_MEGA_COLOR.get());
                        output.accept(ModItems.ABIPHONE_XIII_PRO.get());
                        output.accept(ModItems.ABIPHONE_XIII_PRO_GIGA.get());
                        output.accept(ModItems.ABIPHONE_XIV_ENORMOUS.get());
                        output.accept(ModItems.ABIPHONE_XIV_ENORMOUS_BLACK.get());
                        output.accept(ModItems.ABIPHONE_XIV_ENORMOUS_PURPLE.get());
                        output.accept(ModItems.ABIPHONE_FLIP_DRAGON.get());
                        output.accept(ModItems.ABIPHONE_FLIP_NUCLEUS.get());
                        output.accept(ModItems.ABIPHONE_FLIP_VOLCANO.get());
                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
