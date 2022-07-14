package net.stryphic.everythingisworse.misc;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.stryphic.everythingisworse.EverythingIsWorse;

public class EverythingIsWorseTab extends CreativeModeTab {
    public static final EverythingIsWorseTab instance = new EverythingIsWorseTab(CreativeModeTab.TABS.length, "everythingisworse");
    public EverythingIsWorseTab(String label) {
        super(label);
    }

    public EverythingIsWorseTab(int p_40773_, String p_40774_) {
        super(p_40773_, p_40774_);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(EverythingIsWorse.POOP_ITEM.get());
    }
}
