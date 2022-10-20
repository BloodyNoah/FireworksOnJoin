package io.github.bloodynoah.fireworksonjoin.Listeners;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class onJoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){

                Firework firework = event.getPlayer().getWorld().spawn(event.getPlayer().getLocation(), Firework.class);
                FireworkMeta data = (FireworkMeta) firework.getFireworkMeta();
                data.addEffect(FireworkEffect.builder().withColor(Color.LIME).withColor(Color.GREEN).with(FireworkEffect.Type.BALL_LARGE).withFlicker().build());
                data.setPower(2);
                firework.setFireworkMeta(data);
                System.out.println("Launched Firework");

    }
}
