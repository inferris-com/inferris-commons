package com.inferris.builders;

import com.inferris.utils.SkinUtil;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.profile.PlayerProfile;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {
    private final ItemStack itemStack;
    private final ItemMeta itemMeta;
    private final List<String> lore = new ArrayList<>();

    public ItemBuilder(Material material){
        itemStack = new ItemStack(material);
        itemMeta = itemStack.getItemMeta();
    }

    public ItemBuilder setName(String name){
        itemMeta.setDisplayName(name);
        return this;
    }

    public ItemBuilder addLore(String loreEntry){
        lore.add(loreEntry);
        return this;
    }

    public ItemBuilder setLore(){
        itemMeta.setLore(lore);
        return this;
    }

    public ItemBuilder setGlowing(boolean glowing){
        if(glowing) {
            itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            itemMeta.addEnchant(Enchantment.DURABILITY, 1, false);
        }else{
            itemMeta.removeEnchant(Enchantment.DURABILITY);
        }
        return this;
    }

    public ItemBuilder hideEnchantments(boolean hide){
        if(hide){
            itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }else{
            itemMeta.removeItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
        return this;
    }

    public ItemBuilder setOwnerProfile(String value){
        if(itemMeta instanceof SkullMeta skullMeta){
            PlayerProfile profile = SkinUtil.getProfile("https://textures.minecraft.net/texture/" + value);
            skullMeta.setOwnerProfile(profile); // Set the owning player of the head to the player profile
        }
        return this;
    }

    public ItemStack build(){
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
