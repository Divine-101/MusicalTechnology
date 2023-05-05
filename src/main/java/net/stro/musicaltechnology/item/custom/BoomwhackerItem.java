package net.stro.musicaltechnology.item.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.stro.musicaltechnology.sound.ModSounds;

public class BoomwhackerItem extends SwordItem {

    public BoomwhackerItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(ItemStack item, LivingEntity player, LivingEntity mob) {
        player.level.playSound(player, player.blockPosition(), ModSounds.BOOMWHACKER_HIT.get(), player.getSoundSource(), 1f, 1f);
        item.hurtAndBreak(1, player, (p_43296_) -> {
            p_43296_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });
        return true;
    }



}
