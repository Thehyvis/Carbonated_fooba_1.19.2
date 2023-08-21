package net.thehyvis.carbonated_fooba_core.item;

import net.thehyvis.carbonated_fooba_core.CarbonatedFoobaCore;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thehyvis.carbonated_fooba_core.CarbonatedFoobaCore;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CarbonatedFoobaCore.MOD_ID);

    public static final RegistryObject<Item> CARBONATED_FOOBA = ITEMS.register("carbonated_fooba",
            () -> new Item(new Item.Properties().stacksTo(7)));

    public static final RegistryObject<Item> EMPTY_CAN = ITEMS.register("empty_can",
            () -> new Item(new Item.Properties().stacksTo(7)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}