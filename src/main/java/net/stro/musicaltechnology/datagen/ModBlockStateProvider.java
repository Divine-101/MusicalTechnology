package net.stro.musicaltechnology.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.stro.musicaltechnology.MusicalTechnology;
import net.stro.musicaltechnology.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MusicalTechnology.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ZINC_BLOCK);
        blockWithItem(ModBlocks.ARGENCAD_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ARGENCAD_ORE);
        blockWithItem(ModBlocks.PLACEHOLDER);
        blockWithItem(ModBlocks.PERCUSSIVE_CASING);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
