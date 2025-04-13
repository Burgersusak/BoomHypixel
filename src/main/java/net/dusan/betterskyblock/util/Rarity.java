package net.dusan.betterskyblock.util;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;

public enum Rarity {
    COMMON("§fCOMMON"),
    UNCOMMON("§aUNCOMMON"),
    RARE("§9RARE"),
    EPIC("§5EPIC"),
    LEGENDARY("§6LEGENDARY"),
    MYTHIC("§dMYTHIC"),
    DIVINE("§bDIVINE"),
    SPECIAL("§cSPECIAL");

    private final String formattedName;

    Rarity(String formattedName) {
        this.formattedName = formattedName;
    }

    public String getFormattedName() {
        return formattedName;
    }

    public static Rarity getRarityFromStack(ItemStack stack, Rarity defaultRarity) {
        CompoundTag tag = stack.getTag();
        if (tag != null && tag.contains("SkyblockRarity")) {
            try {
                return Rarity.valueOf(tag.getString("SkyblockRarity"));
            } catch (IllegalArgumentException ignored) {}
        }
        return defaultRarity;
    }

    public Rarity upgrade() {
        int index = this.ordinal();
        if (index < values().length - 1) {
            return values()[index + 1];
        }
        return null;
    }
}