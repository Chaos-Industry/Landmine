package com.github.chaosindustry.landmine;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class Mine implements Listener {
    @EventHandler
    public void jiray(PlayerInteractEvent event) {
        if (event.getAction().toString().equalsIgnoreCase("PHYSICAL")) {
            if (event.getClickedBlock().getType().toString().equalsIgnoreCase("OAK_PRESSURE_PLATE")) {
                Player player = event.getPlayer();
                Location loc = event.getClickedBlock().getLocation();
                Block b = loc.getBlock();
                event.setCancelled(true);
                b.setType(Material.AIR);
                loc.getWorld().createExplosion(loc,1,true,false);

            }
        }

        if (event.getAction().toString().equalsIgnoreCase("RIGHT_CLICK_BLOCK")) {
            if (event.getClickedBlock().getType().toString().equalsIgnoreCase("OAK_PRESSURE_PLATE")) {
                Location loc = event.getClickedBlock().getLocation();
                Block b = loc.getBlock();
                event.setCancelled(true);
                b.setType(Material.AIR);

            }
        }
    }
}