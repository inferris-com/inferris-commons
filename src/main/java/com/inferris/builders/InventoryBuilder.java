package com.inferris.builders;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;

public class InventoryBuilder {
    private Player player;
    private final Inventory inventory;
    private final String inventoryName;
    private final Map<Integer, ItemStack> items;

    public InventoryBuilder(Player player, String inventoryName, int size) {
        this.player = player;
        this.inventoryName = inventoryName;
        this.inventory = Bukkit.createInventory(null, size, inventoryName);
        this.items = new HashMap<>();
    }

    public InventoryBuilder addItem(ItemStack itemStack, int slot) {
        items.put(slot, itemStack);
        return this;
    }

    public void open() {
        for (Map.Entry<Integer, ItemStack> entry : items.entrySet()) {
            int slot = entry.getKey();
            ItemStack itemStack = entry.getValue();
            ItemMeta itemMeta = itemStack.getItemMeta();
            itemStack.setItemMeta(itemMeta);
            inventory.setItem(slot, itemStack);
        }

        player.openInventory(inventory);
    }
}
