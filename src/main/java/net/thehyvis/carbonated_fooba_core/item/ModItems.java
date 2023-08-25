package net.thehyvis.carbonated_fooba_core.item;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemNameBlockItem;
import net.thehyvis.carbonated_fooba_core.CarbonatedFoobaCore;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thehyvis.carbonated_fooba_core.block.ModBlocks;
import net.thehyvis.carbonated_fooba_core.item.custom.FoobaItem;
import net.thehyvis.carbonated_fooba_core.item.custom.SupremeFoobaItem;
import net.thehyvis.carbonated_fooba_core.misc.CarbonatedFoobaTab;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CarbonatedFoobaCore.MOD_ID);

    public static final RegistryObject<Item> CARBONATED_FOOBA = ITEMS.register("carbonated_fooba",
            () -> new FoobaItem(new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB)
                    .stacksTo(17).food(new FoodProperties.Builder().nutrition(4)
                            .saturationMod(4).alwaysEat()
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2000, 3), 1F)
                            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 10*20, 0), 0.2F)
                            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 2), 1F)
                            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 2), 0.05F)
                            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 60, 3), 0.05F).build())));
    public static final RegistryObject<Item> SUPREME_FOOBA = ITEMS.register("supreme_fooba",
            () -> new SupremeFoobaItem(new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB)
                    .stacksTo(17).food(new FoodProperties.Builder().nutrition(4)
                            .saturationMod(4).fast().alwaysEat()
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2000, 3), 1F)
                            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 10*20, 0), 0.2F)
                            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 2), 1F)
                            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 2), 0.05F)
                            .effect(() -> new MobEffectInstance(MobEffects.WITHER, 60, 3), 0.05F).build())));


    public static final RegistryObject<Item> EMPTY_SUPREME_FOOBA_CAN = ITEMS.register("empty_supreme_fooba_can",
            () -> new Item(new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB).stacksTo(17)));

    public static final RegistryObject<Item> GOLD_CAN = ITEMS.register("gold_can",
            () -> new Item(new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB).stacksTo(17)));

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
    public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("tin_plate",
            () -> new Item(new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB).stacksTo(17)));

    public static final RegistryObject<Item> INCOMPLETE_TIN_CAN = ITEMS.register("incomplete_tin_can",
            () -> new Item(new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB).stacksTo(17)));

    public static final RegistryObject<Item> FOOBERRY_SEEDS = ITEMS.register("fooberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.FOOBERRY_CROP.get(),
               new Item.Properties().tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB).stacksTo(17)));

    public static final RegistryObject<Item> FOOBERRY = ITEMS.register("fooberry",
            () -> new Item(new Item.Properties().fireResistant().food(new FoodProperties.Builder().nutrition(4).saturationMod(4).build()).tab(CarbonatedFoobaTab.CARBONATED_FOOBA_TAB).stacksTo(17)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}