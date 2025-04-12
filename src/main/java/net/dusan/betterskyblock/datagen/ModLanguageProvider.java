package net.dusan.betterskyblock.datagen;

import net.dusan.betterskyblock.BetterSkyblock;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {

    public ModLanguageProvider(PackOutput output) {
        super(output, BetterSkyblock.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
    }

    private void addRarityAndTooltip(String id, String tooltip, Integer rarity) {
        String[] rarities = {
                "§fCOMMON",    // white
                "§aUNCOMMON",  // lime
                "§9RARE",      // blue
                "§5EPIC",      // purple
                "§6LEGENDARY", // gold
                "§dMYTHIC",    // pink
                "§bDIVINE",    // light blue
                "§cSPECIAL"    // red
        };

        if (rarity >= 0 && rarity < rarities.length) {
            add("item.betterskyblock." + id + ".tooltip", tooltip + rarities[rarity]);
        }
    }
}
