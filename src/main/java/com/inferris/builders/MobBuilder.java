package com.inferris.builders;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class MobBuilder {
    private final EntityType entityType;
    private final Location location;
    private final LivingEntity livingEntity;

    public MobBuilder(EntityType entityType, Location spawnLocation){
        this.entityType = entityType;
        this.location = spawnLocation;
        this.livingEntity = (LivingEntity) spawnLocation.getWorld().spawnEntity(spawnLocation, entityType);
    }
    public MobBuilder setName(String name){
        livingEntity.setCustomName(name);
        livingEntity.setCustomNameVisible(true);
        return this;
    }

    public MobBuilder setInvisible(boolean invisible){
        livingEntity.setInvisible(invisible);
        return this;
    }

    public MobBuilder setAI(boolean isEnabled){
        livingEntity.setAI(isEnabled);
        return this;
    }

    public MobBuilder setArmor(ArmorSlots armorSlot, ItemStack item){
        EntityEquipment entityEquipment = livingEntity.getEquipment();
        switch (armorSlot){
            case HEAD -> entityEquipment.setHelmet(item);
            case CHEST -> entityEquipment.setChestplate(item);
            case LEGS -> entityEquipment.setLeggings(item);
            case FEET -> entityEquipment.setBoots(item);
        }
        return this;
    }

    public MobBuilder setItem(ItemSlots itemSlot, ItemStack item){
        EntityEquipment entityEquipment = livingEntity.getEquipment();
        switch (itemSlot){
            case MAINHAND -> entityEquipment.setItemInMainHand(item);
            case OFFHAND -> entityEquipment.setItemInOffHand(item);
        }
        return this;
    }

    public MobBuilder setActivePotionEffects(){
        return this;
    }

    public LivingEntity build(){
        return livingEntity;
    }

    enum ItemSlots {
        MAINHAND,
        OFFHAND;
    }

    enum ArmorSlots {
        HEAD,
        CHEST,
        LEGS,
        FEET
    }
}
