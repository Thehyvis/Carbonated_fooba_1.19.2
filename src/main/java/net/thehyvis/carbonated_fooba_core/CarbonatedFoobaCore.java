package net.thehyvis.carbonated_fooba_core;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thehyvis.carbonated_fooba_core.block.ModBlocks;
import net.thehyvis.carbonated_fooba_core.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CarbonatedFoobaCore.MOD_ID)
public class CarbonatedFoobaCore
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "carbonated_fooba_core";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public CarbonatedFoobaCore()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        //fluid



        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

 // Keep this in sync with the constructor

    // You can use SubscribeEvent and let the Event Bus discover methods to call

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("Server Successfully Carbonated Fooba");
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

            // Some client setup code
            LOGGER.info("Client Successfully Carbonated Fooba");

            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());


        }
    }
}
