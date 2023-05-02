package net.stro.musicaltechnology.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.stro.musicaltechnology.MusicalTechnology;

@Mod.EventBusSubscriber(modid = MusicalTechnology.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab MUSICAL_TECH_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MUSICAL_TECH_TAB = event.registerCreativeModeTab(new ResourceLocation(MusicalTechnology.MOD_ID, "musical_tech_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.RAW_ARGENCAD.get()))
                        .title(Component.translatable("creativemodetab.musical_tech_tab")));
    }
}
