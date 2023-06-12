package net.eduardohiguti.muitodoido.block;

import com.mojang.blaze3d.shaders.Uniform;
import net.eduardohiguti.muitodoido.MuitoDoido;
import net.eduardohiguti.muitodoido.item.ModCreativeModeTab;
import net.eduardohiguti.muitodoido.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MuitoDoido.MOD_ID);

    public static final RegistryObject<Block> PEDROVITANIUM_BLOCK = registerBlock("pedrovitanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DOIDERA_TAB);
    public static final RegistryObject<Block> PEDROVITANIUM_ORE = registerBlock("pedrovitanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(1,15)), ModCreativeModeTab.DOIDERA_TAB);
    public static final RegistryObject<Block> DEEPSLATE_PEDROVITANIUM_ORE = registerBlock("deepslate_pedrovitanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(1,15)), ModCreativeModeTab.DOIDERA_TAB);


    public static final RegistryObject<Block> KAIQUONIUM_BLOCK = registerBlock("kaiquonium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DOIDERA_TAB);
    public static final RegistryObject<Block> KAIQUONIUM_ORE = registerBlock("kaiquonium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(1,15)), ModCreativeModeTab.DOIDERA_TAB);
    public static final RegistryObject<Block> DEEPSLATE_KAIQUONIUM_ORE = registerBlock("deepslate_kaiquonium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(1,15)), ModCreativeModeTab.DOIDERA_TAB);




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
