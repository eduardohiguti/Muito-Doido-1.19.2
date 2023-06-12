package net.eduardohiguti.muitodoido.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab DOIDERA_TAB = new CreativeModeTab("muitodoidotab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PEDROVITANIUM.get());
        }
    };
}
