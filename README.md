# EliteBazaarAPI
This is an API that allows other plugins to interact with [EliteBazaar](https://builtbybit.com/resources/elitebazaar-supply-and-demand-market.57715)

# Initialization
Disable the plugin if EliteBazaar is not found:
```java
if (!Bukkit.getPluginManager().isPluginEnabled("EliteBazaar")) {
    getLogger().severe("EliteBazaar plugin is not enabled! Disabling the plugin...");
    getServer().getPluginManager().disablePlugin(this);
    return;
}
```
Add the [API jar](https://github.com/HexyeDEV/EliteBazaarAPI/releases/latest) to your project (E.g. in the libs folder)

Compile against it:
```
dependencies {
    compileOnly files("libs/EliteBazaarAPI.jar")
}
```

# Listening to events
```java
import com.google.common.eventbus.Subscribe;
import me.hexye.elitebazaarapi.EBAPI;
import me.hexye.elitebazaarapi.events.BuyOrderFilled;

public class MyListener {
    public MyListener() {
        EBAPI.getEventBus().register(this)
    }

    @Subscribe
    public void onBuyOrderFilled(BuyOrderFilled event) {
        // your code here...
    }
}
```

# Events
All events are in the package me.hexye.elitebazaarapi.events
- BuyOrderFilled: Triggered when a buy ordered is completly filled
  Methods:
  - getItemname() returns String The name of the item 
  - getItem() returns ItemStack The ItemStack object
  - getAmount() returns int The amount of the item filled in the order
  - getPrice() returns double The price for each item
  - getPlayer() returns OfflinePlayer The player that placed the original order
- BuyOrderPlaced: Triggered when a buy ordered is placed
  Methods:
  - getItemname() returns String The name of the item 
  - getItem() returns ItemStack The ItemStack object
  - getAmount() returns int The amount of the item filled in the order
  - getPrice() returns double The price for each item
  - getPlayer() returns OfflinePlayer The player that placed the original order
- SellOrderFilled:
  Methods:
  - getItemname() returns String The name of the item 
  - getItem() returns ItemStack The ItemStack object
  - getAmount() returns int The amount of the item filled in the order
  - getPrice() returns double The price for each item
  - getPlayer() returns OfflinePlayer The player that placed the original order
  - getTotal() returns Double The total that was paid for the full sell order
- SellOrderPlaced:
  Methods:
  - getItemname() returns String The name of the item 
  - getItem() returns ItemStack The ItemStack object
  - getAmount() returns int The amount of the item filled in the order
  - getPrice() returns double The price for each item
  - getPlayer() returns OfflinePlayer The player that placed the original order
