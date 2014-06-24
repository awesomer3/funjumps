package me.awesomer3.jumppads;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MyPlayerListener implements Listener {
	public static JumpPads plugin;

	@EventHandler
	public void onJumpPadStep(PlayerMoveEvent event) {
		Player player = event.getPlayer();
		if (player.getLocation().subtract(0, 1, 0).getBlock().getType() == Material.REDSTONE_BLOCK) {
			if (player.getLocation().subtract(0, 0, 0).getBlock().getType() == Material.STONE_PLATE) {
				player.setVelocity(player.getLocation().getDirection()
						.multiply(10.5).setY(1.5));
				Location loc = player.getLocation();
				player.playSound(loc, Sound.GHAST_FIREBALL, 4F, 1F);
			}
		}

	}
}
