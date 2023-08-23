package net.thehyvis.carbonated_fooba_core.misc;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.thehyvis.carbonated_fooba_core.CarbonatedFoobaCore;
import net.thehyvis.carbonated_fooba_core.item.ModItems;
public class CarbonatedFoobaTab {
    public static final CreativeModeTab CARBONATED_FOOBA_TAB = new CreativeModeTab("carbonated_fooba_core") {
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.CARBONATED_FOOBA.get());
    }
};
}