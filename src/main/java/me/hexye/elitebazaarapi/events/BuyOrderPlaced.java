package me.hexye.elitebazaarapi.events;

import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;

public class BuyOrderPlaced {
    private final String itemName;
    private final ItemStack item;
    private final int amount;
    private final double price;
    private final OfflinePlayer player;

    public BuyOrderPlaced(String itemName, ItemStack item, int amount, double price, OfflinePlayer player) {
        this.itemName = itemName;
        this.item = item;
        this.amount = amount;
        this.price = price;
        this.player = player;
    }

    public String getItemName() {
        return itemName;
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
