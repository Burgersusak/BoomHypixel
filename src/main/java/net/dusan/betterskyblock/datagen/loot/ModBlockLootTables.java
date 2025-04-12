package net.dusan.betterskyblock.datagen.loot;

import net.dusan.betterskyblock.block.Modblocks;
import net.dusan.betterskyblock.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(Modblocks.PLACEHOLDER_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Modblocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
