package me.colinconnolly.sonicboomdisable;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class SonicBoomDisable extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(this, this);
        System.out.println("Plugin successfully loaded");
    }
    @EventHandler
    public void playerDamage(EntityDamageEvent e){
            if (e.getCause() == EntityDamageEvent.DamageCause.SONIC_BOOM) {
                e.setDamage(0);
        }
            else{
                return;
            }
    }

    @Override
    public void onDisable() {

    }
}
