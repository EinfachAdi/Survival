package de.einfachadi.survival.datagen;

import de.einfachadi.survival.block.ModBlocks;
import de.einfachadi.survival.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ModTags.Blocks.NEEDS_NETHER_EMERALD_TOOL)
                .add(ModBlocks.NETHER_EMERALD_BLOCK)
                .add(ModBlocks.NETHER_EMERALD_BUTTON)
                .add(ModBlocks.NETHER_EMERALD_GHOST_BLOCK)
                .add(ModBlocks.MAGICBLOCK)
                .add(ModBlocks.NETHER_EMERALD_FENCE_GATE)
                .add(ModBlocks.NETHER_EMERALD_FENCE)
                .add(ModBlocks.NETHER_EMERALD_GHOST_SLAB)
                .add(ModBlocks.NETHER_EMERALD_GHOST_TRAPDOOR)
                .add(ModBlocks.NETHER_EMERALD_PRESSURE_PLATE)
                .add(ModBlocks.NETHER_EMERALD_TRAPDOOR)
                .add(ModBlocks.NETHER_EMERALD_WALL)
                .add(ModBlocks.netheriteingot_diamondapple);

        valueLookupBuilder(BlockTags.FENCES).add(ModBlocks.NETHER_EMERALD_FENCE);
        valueLookupBuilder(BlockTags.FENCE_GATES).add(ModBlocks.NETHER_EMERALD_FENCE_GATE);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.NETHER_EMERALD_WALL);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NETHER_EMERALD_ORE);

    }
}
