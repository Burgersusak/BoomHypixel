package net.dusan.betterskyblock.datagen;

import net.dusan.betterskyblock.BetterSkyblock;
import net.dusan.betterskyblock.item.ModItems;
import net.dusan.betterskyblock.item.custom.AbiphoneItem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BetterSkyblock.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.PESTHUNTING_GUIDE);
        simpleItem(ModItems.ABIPHONE_X_PLUS);
        simpleItem(ModItems.ABIPHONE_X_PLUS_SPECIAL_EDITION);
        simpleItem(ModItems.ABIPHONE_XI_ULTRA);
        simpleItem(ModItems.ABIPHONE_XI_ULTRA_STYLE);
        simpleItem(ModItems.ABIPHONE_XII_MEGA);
        simpleItem(ModItems.ABIPHONE_XII_MEGA_COLOR);
        simpleItem(ModItems.ABIPHONE_XIII_PRO);
        simpleItem(ModItems.ABIPHONE_XIII_PRO_GIGA);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BetterSkyblock.MOD_ID,"item/" + item.getId().getPath()));
    }
}
