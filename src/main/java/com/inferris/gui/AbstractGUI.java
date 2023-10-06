package com.inferris.gui;

import com.inferris.builders.InventoryBuilder;
import org.bukkit.entity.Player;

public abstract class AbstractGUI {
    protected abstract String getDefaultTitle();
    protected abstract int getDefaultSize();

    protected InventoryBuilder inventoryBuilder;

    public AbstractGUI(Player player){
        this.inventoryBuilder = new InventoryBuilder(player, getDefaultTitle(), getDefaultSize());
    }

    public abstract void initializeContents();

    public void open(){
        inventoryBuilder.open();
    }
}
