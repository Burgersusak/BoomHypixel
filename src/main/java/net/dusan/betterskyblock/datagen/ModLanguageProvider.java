package net.dusan.betterskyblock.datagen;

import net.dusan.betterskyblock.BetterSkyblock;
import net.dusan.betterskyblock.item.ModItems;
import net.dusan.betterskyblock.item.custom.SkyblockItem;
import net.dusan.betterskyblock.util.Rarity;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output) {
        super(output, BetterSkyblock.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addNameAndRarity(ModItems.PESTHUNTING_GUIDE, "A Beginner's Guide To Pesthunting", """
                        §0Combinable in anvil
                        
                        §7When applied to armor, increases its
                        §1Pesterminator§7 level by §a!§7!
                        §0Can be applied once,
                        Requires Pesterminator V!
                        
                        An old, well-used handbook detailing
                        how to wrangle various pest types.
                        Many of these pests don’t seem to
                        exist anymore - looks like someone
                        did a good job!""");
    }

    private void addNameAndRarity(RegistryObject<Item> item, String name, String tooltip) {
        add(item.get(), name);
        add("tooltip.mccourse." + item.getId() + ".tooltip", tooltip);

    }
}
