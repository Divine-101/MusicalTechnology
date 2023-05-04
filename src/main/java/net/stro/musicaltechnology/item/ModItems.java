package net.stro.musicaltechnology.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stro.musicaltechnology.MusicalTechnology;

import java.math.BigInteger;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MusicalTechnology.MOD_ID);

    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Properties()));
    public static final RegistryObject<Item> RAW_ARGENCAD = ITEMS.register("raw_argencad",
            () -> new Item(new Properties()));
    public static final RegistryObject<Item> BOOMWHACKER = ITEMS.register("boomwhacker",
            () -> new SwordItem(Tiers.STONE, 3, 0, new Item.Properties().stacksTo(1).durability(251)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
