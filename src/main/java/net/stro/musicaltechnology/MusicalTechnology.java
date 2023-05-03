package net.stro.musicaltechnology;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.stro.musicaltechnology.block.ModBlocks;
import net.stro.musicaltechnology.item.ModCreativeModeTabs;
import net.stro.musicaltechnology.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MusicalTechnology.MOD_ID)
public class MusicalTechnology {
    public static final String MOD_ID = "musicaltechnology";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MusicalTechnology() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.ZINC_INGOT);
            event.accept(ModItems.RAW_ARGENCAD);
        }
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ModBlocks.ZINC_BLOCK);
        }
        if(event.getTab() == CreativeModeTabs.NATURAL_BLOCKS){
            event.accept(ModBlocks.ARGENCAD_ORE);
            event.accept(ModBlocks.DEEPSLATE_ARGENCAD_ORE);
        }
        if(event.getTab() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.BOOMWHACKER);
        }
        if(event.getTab() == ModCreativeModeTabs.MUSICAL_TECH_TAB) {
            event.accept(ModItems.ZINC_INGOT);
            event.accept(ModBlocks.ZINC_BLOCK);
            event.accept(ModItems.RAW_ARGENCAD);
            event.accept(ModBlocks.ARGENCAD_ORE);
            event.accept(ModBlocks.DEEPSLATE_ARGENCAD_ORE);
            event.accept(ModItems.BOOMWHACKER);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
