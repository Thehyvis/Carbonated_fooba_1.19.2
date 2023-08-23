package net.thehyvis.carbonated_fooba_core.item;
import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.thehyvis.carbonated_fooba_core.CarbonatedFoobaCore;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thehyvis.carbonated_fooba_core.CarbonatedFoobaCore;
import net.thehyvis.carbonated_fooba_core.item.custom.FoobaItem;
import net.thehyvis.carbonated_fooba_core.misc.CarbonatedFoobaTab;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CarbonatedFoobaCore.MOD_ID);

    public static final RegistryObject<Item> CARBONATED_FOOBA = ITEMS.register("carbonated_fooba",
            () -> new FoobaItem(new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB)
                    .stacksTo(17).food(new FoodProperties.Builder().nutrition(4)
                            .saturationMod(4).alwaysEat()
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2000, 2), 1F)
                            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 10*20, 0), 0.2F)
                            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 2), 1F)
                            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 2), 0.05F)
                            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 60, 3), 0.05F).build())));

    public static final RegistryObject<Item> EMPTY_CAN = ITEMS.register("empty_can",
            () -> new Item(new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB).stacksTo(17)));
    public static final RegistryObject<Item> TIN_CAN = ITEMS.register("tin_can",
            () -> new Item(new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB).stacksTo(17)));


    public static final RegistryObject<Item> ENLARGED_GLASS_BOTTLE = ITEMS.register("enlarged_glass_bottle",
            () -> new Item(new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB).stacksTo(17)));

    public static final RegistryObject<Item> ENLARGED_WATER_BOTTLE = ITEMS.register("enlarged_water_bottle",
            () -> new Item(new Item.Properties().craftRemainder(ModItems.ENLARGED_GLASS_BOTTLE.get()).tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB).stacksTo(17)));

    public static final RegistryObject<Item> ETIQUETTE = ITEMS.register("etiquette",
            () -> new Item(new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB).stacksTo(17)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}