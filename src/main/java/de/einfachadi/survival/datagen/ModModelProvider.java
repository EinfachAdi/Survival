package de.einfachadi.survival.datagen;

import de.einfachadi.survival.Item.ModArmorMaterials;
import de.einfachadi.survival.Item.ModItems;
import de.einfachadi.survival.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool netherEmeraldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_EMERALD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_NETHER_EMERALD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGICBLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.netheriteingot_diamondapple);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_EMERALD_GHOST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEAPON_BLOCK);

        //netherEmeraldPool.stairs(ModBlocks.NETHER_EMERALD_GHOST_STAIRS);
        netherEmeraldPool.slab(ModBlocks.NETHER_EMERALD_GHOST_SLAB);

        blockStateModelGenerator.registerDoor(ModBlocks.NETHER_EMERALD_GHOST_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.NETHER_EMERALD_GHOST_TRAPDOOR);

        netherEmeraldPool.slab(ModBlocks.NETHER_EMERALD_SLAB);

        netherEmeraldPool.button(ModBlocks.NETHER_EMERALD_BUTTON);
        netherEmeraldPool.pressurePlate(ModBlocks.NETHER_EMERALD_PRESSURE_PLATE);

        netherEmeraldPool.fence(ModBlocks.NETHER_EMERALD_FENCE);
        netherEmeraldPool.fenceGate(ModBlocks.NETHER_EMERALD_FENCE_GATE);
        netherEmeraldPool.wall(ModBlocks.NETHER_EMERALD_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.NETHER_EMERALD_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.NETHER_EMERALD_TRAPDOOR);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.NETHER_EMERALD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NETHER_EMERALD, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.Healthy_Snack, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.AIR_CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIRT_EMERALD_CLUMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_CLUMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.UPGRADE_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_HORSE_ARMOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHER_EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.GHOST_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GHOST_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRAGMENT_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRAGMENT_TEMPLATE, Models.GENERATED);
        itemModelGenerator.upload(ModItems.END_BOW, Models.BOW);
        itemModelGenerator.registerBow(ModItems.END_BOW);

        itemModelGenerator.registerArmor(ModItems.NETHER_EMERALD_HELMET, ModArmorMaterials.NETHER_EMERALD_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.NETHER_EMERALD_CHESTPLATE, ModArmorMaterials.NETHER_EMERALD_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.NETHER_EMERALD_LEGGINGS, ModArmorMaterials.NETHER_EMERALD_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(ModItems.NETHER_EMERALD_BOOTS, ModArmorMaterials.NETHER_EMERALD_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
    }
}
