package net.stro.musicaltechnology.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stro.musicaltechnology.MusicalTechnology;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MusicalTechnology.MOD_ID);

    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Properties()));
    public static final RegistryObject<Item> RAW_ARGENCAD = ITEMS.register("raw_argencad",
            () -> new Item(new Properties()));
    public static final RegistryObject<Item> BOOMWHACKER = ITEMS.register("boomwhacker",
            () -> new SwordItem(new Tier() {
                @Override
                public int getUses() {
                    return 0;
                }

                @Override
                public float getSpeed() {
                    return 0;
                }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() {
                    return 0;
                }

                @Override
                public int getEnchantmentValue() {
                    return 0;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return null;
                }
            }, 5, (float) 1.6, new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
