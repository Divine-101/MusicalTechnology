package net.stro.musicaltechnology.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.stro.musicaltechnology.block.ModBlocks;
import net.stro.musicaltechnology.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    protected ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ZINC_BLOCK.get());
        dropSelf(ModBlocks.PLACEHOLDER.get());
        add(ModBlocks.ARGENCAD_ORE.get(), (block) -> createOreDrop(ModBlocks.ARGENCAD_ORE.get(), ModItems.RAW_ARGENCAD.get()));
        add(ModBlocks.DEEPSLATE_ARGENCAD_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_ARGENCAD_ORE.get(), ModItems.RAW_ARGENCAD.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
