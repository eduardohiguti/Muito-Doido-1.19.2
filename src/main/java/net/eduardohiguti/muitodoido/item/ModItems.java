package net.eduardohiguti.muitodoido.item;

import net.eduardohiguti.muitodoido.MuitoDoido;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MuitoDoido.MOD_ID);

    public static final RegistryObject<Item> PEDROVITANIUM = ITEMS.register("pedrovitanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DOIDERA_TAB)));
    public static final RegistryObject<Item> KAIQUONIUM = ITEMS.register("kaiquonium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DOIDERA_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
