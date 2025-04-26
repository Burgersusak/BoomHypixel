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
    private final Rarity baseRarity;

    public SkyblockItem(Properties pProperties, Rarity rarity) {
        super(pProperties);
        this.baseRarity = rarity;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        Rarity rarity = Rarity.getRarityFromStack(stack, baseRarity);

        //translated tooltip
        tooltip.add(Component.translatable("tooltip." + this.getDescriptionId() + ".tooltip"));

        //upgrade text
        if (stack.getTag() != null && stack.getTag().getBoolean("HasUpgradedRarity")) {
            tooltip.add(Component.literal("\n§l§dRarity upgraded§r"));
            tooltip.add(Component.literal(rarity.getColor()+ "§kb§r" + rarity.getName() + "§kz"));
        } else {
            tooltip.add(Component.literal(rarity.getName()));
        }
    }

    @Override
    public Component getName(ItemStack stack) {
        Rarity rarity = getSRarity(stack); // gets current rarity, even upgraded one
        String coloredName = rarity.getColor() + Component.translatable(this.getDescriptionId()).getString();
        return Component.literal(coloredName);
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
