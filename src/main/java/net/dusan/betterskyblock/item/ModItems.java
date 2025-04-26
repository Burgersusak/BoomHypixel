package net.dusan.betterskyblock.item;

import net.dusan.betterskyblock.BetterSkyblock;
import net.dusan.betterskyblock.item.custom.AbiphoneItem;
import net.dusan.betterskyblock.item.custom.SkyblockItem;
import net.dusan.betterskyblock.util.Rarity;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterSkyblock.MOD_ID);


    public static final RegistryObject<Item> PESTHUNTING_GUIDE = ITEMS.register("pesthunting_guide", () -> new SkyblockItem(new Item.Properties(), Rarity.LEGENDARY));

    //Abiphone items
    public static final RegistryObject<Item> ABIPHONE_X_PLUS = ModItems.ITEMS.register("abiphone_x_plus", () -> new AbiphoneItem(new Item.Properties(), Rarity.UNCOMMON, 5, 0, false, false, false, false));
    public static final RegistryObject<Item> ABIPHONE_X_PLUS_SPECIAL_EDITION = ModItems.ITEMS.register("abiphone_x_plus_special_edition", () -> new AbiphoneItem(new Item.Properties(), Rarity.UNCOMMON, 5, 0, false, false, false, false));
    public static final RegistryObject<Item> ABIPHONE_XI_ULTRA = ModItems.ITEMS.register("abiphone_xi_ultra", () -> new AbiphoneItem(new Item.Properties(), Rarity.UNCOMMON, 5, 2, false, false, false, false));
    public static final RegistryObject<Item> ABIPHONE_XI_ULTRA_STYLE = ModItems.ITEMS.register("abiphone_xi_ultra_style", () -> new AbiphoneItem(new Item.Properties(), Rarity.RARE, 5, 2, true, false, false, false));
    public static final RegistryObject<Item> ABIPHONE_XII_MEGA = ModItems.ITEMS.register("abiphone_xii_mega", () -> new AbiphoneItem(new Item.Properties(), Rarity.RARE, 7, 4, true, false, false, false));
    public static final RegistryObject<Item> ABIPHONE_XII_MEGA_COLOR = ModItems.ITEMS.register("abiphone_xii_mega_color", () -> new AbiphoneItem(new Item.Properties(), Rarity.EPIC, 7, 4, true, false, true, false));
    public static final RegistryObject<Item> ABIPHONE_XIII_PRO = ModItems.ITEMS.register("abiphone_xiii_pro", () -> new AbiphoneItem(new Item.Properties(), Rarity.EPIC, 8, 10, true, false, true, false));
    public static final RegistryObject<Item> ABIPHONE_XIII_PRO_GIGA = ModItems.ITEMS.register("abiphone_xiii_pro_giga", () -> new AbiphoneItem(new Item.Properties(), Rarity.EPIC, 7, 4, true, true, true, true));
    public static final RegistryObject<Item> ABIPHONE_XIV_ENORMOUS = ModItems.ITEMS.register("abiphone_xiv_enormous", () -> new AbiphoneItem(new Item.Properties(), Rarity.LEGENDARY, 11, 25, true, true, true, true));
    public static final RegistryObject<Item> ABIPHONE_XIV_ENORMOUS_PURPLE = ModItems.ITEMS.register("abiphone_xiv_enormous_purple", () -> new AbiphoneItem(new Item.Properties(), Rarity.LEGENDARY, 11, 25, true, true, true, true));
    public static final RegistryObject<Item> ABIPHONE_XIV_ENORMOUS_BLACK = ModItems.ITEMS.register("abiphone_xiv_enormous_black", () -> new AbiphoneItem(new Item.Properties(), Rarity.LEGENDARY, 11, 25, true, true, true, true));
    public static final RegistryObject<Item> ABIPHONE_FLIP_DRAGON = ModItems.ITEMS.register("abiphone_flip_dragon", () -> new AbiphoneItem(new Item.Properties(), Rarity.LEGENDARY, 12, 25, true, true, true, true));
    public static final RegistryObject<Item> ABIPHONE_FLIP_NUCLEUS = ModItems.ITEMS.register("abiphone_flip_nucleus", () -> new AbiphoneItem(new Item.Properties(), Rarity.LEGENDARY, 12, 25, true, true, true, true));
    public static final RegistryObject<Item> ABIPHONE_FLIP_VOLCANO = ModItems.ITEMS.register("abiphone_flip_volcano", () -> new AbiphoneItem(new Item.Properties(), Rarity.LEGENDARY, 12, 25, true, true, true, true));
    public static final RegistryObject<Item> ABINGOPHONE = ModItems.ITEMS.register("abingophone", () -> new AbiphoneItem(new Item.Properties(), Rarity.SPECIAL, 20, 0, true, true, false, false));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
