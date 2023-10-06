package com.inferris.builders;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Collection;

public class PotionEffectBuilder {
    private final Collection<PotionEffect> potionEffects = new ArrayList<PotionEffect>();

    public PotionEffectBuilder(){

    }

    public PotionEffectBuilder addPotionEffect(PotionEffectType potionType, int duration, int amplifier, boolean ambient, boolean particles, boolean icon){
        potionEffects.add(new PotionEffect(potionType, duration, amplifier, ambient, particles, icon));
        return this;
    }

    public PotionEffectBuilder addPotionEffect(PotionEffectType potionType, boolean icon){
        potionEffects.add(new PotionEffect(potionType, PotionEffect.INFINITE_DURATION, 1, false, false, icon));
        return this;
    }

    public Collection<PotionEffect> build(){
        return potionEffects;
    }
}
