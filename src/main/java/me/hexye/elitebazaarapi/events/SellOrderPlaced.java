package me.hexye.elitebazaarapi.events;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

public class SellOrderPlaced {
    private final String item_name;
    private final ItemStack item;
    private final int amount;
    private final double price;
    private final OfflinePlayer player;

    public SellOrderPlaced(String item_name, ItemStack item, int amount, double price, OfflinePlayer player) {
        this.item_name = item_name;
        this.item = item;
        this.amount = amount;
        this.price = price;
        this.player = player;
    }

    public String getItemName() {
        return item_name;
    }

    public ItemStack getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public OfflinePlayer getPlayer() {
        return player;
    }
}
