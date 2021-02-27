package com.github.chaosindustry.landmine;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Landmine extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Mine(), this);
        Bukkit.getLogger().info("Landmineが有効になりました");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Landmineが無効になりました");
    }
}

