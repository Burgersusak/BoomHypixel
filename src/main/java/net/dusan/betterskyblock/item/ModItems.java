package net.dusan.betterskyblock.item;

import net.dusan.betterskyblock.BetterSkyblock;
import net.dusan.betterskyblock.item.custom.SkyblockItem;
import net.dusan.betterskyblock.util.Rarity;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterSkyblock.MOD_ID);


    public static final RegistryObject<Item> PESTHUNTING_GUIDE = ITEMS.register("pesthunting_guide",
            () -> new SkyblockItem(new Item.Properties(), "pesthunting_guide", Rarity.LEGENDARY));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
