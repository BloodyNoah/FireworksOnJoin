package io.github.bloodynoah.fireworksonjoin;

import io.github.bloodynoah.fireworksonjoin.Listeners.onJoinListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FireworksOnJoin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
         getServer().getPluginManager().registerEvents(new onJoinListener(), this);
        }
    }


