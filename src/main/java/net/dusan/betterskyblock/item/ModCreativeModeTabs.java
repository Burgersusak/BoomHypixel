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
                    .title(Component.translatable("creativetab.course_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.PESTHUNTING_GUIDE.get());
                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
