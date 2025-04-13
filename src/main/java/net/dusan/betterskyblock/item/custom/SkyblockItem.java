package net.dusan.betterskyblock.item.custom;

import net.dusan.betterskyblock.util.Rarity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SkyblockItem extends Item {
    private final String itemId;
    private final Rarity baseRarity;

    public SkyblockItem(Properties pProperties, String id, Rarity rarity) {
        super(pProperties);
        this.itemId = id;
        this.baseRarity = rarity;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        Rarity rarity = Rarity.getRarityFromStack(stack, baseRarity);

        //translated tooltip
        tooltip.add(Component.translatable("tooltip.mccourse." + itemId + ".tooltip"));

        // rarity with color
        tooltip.add(Component.literal("\n" + rarity.getFormattedName()));

        // upgrade status
        if (stack.getTag() != null && stack.getTag().getBoolean("HasUpgradedRarity")) {
            tooltip.add(Component.literal("§7Rarity upgraded"));
        }
    }

    public Rarity getSRarity(ItemStack stack) {
        return Rarity.getRarityFromStack(stack, baseRarity);
    }

    public static void upgradeRarity(ItemStack stack) {
        CompoundTag tag = stack.getOrCreateTag();

        if (tag.getBoolean("HasUpgradedRarity")) return;

        if (stack.getItem() instanceof SkyblockItem item) {
            Rarity current = item.getSRarity(stack);
            Rarity upgraded = current.upgrade();
            if (upgraded != null) {
                tag.putString("SkyblockRarity", upgraded.name());
                tag.putBoolean("HasUpgradedRarity", true);
            }
        }
    }
}
