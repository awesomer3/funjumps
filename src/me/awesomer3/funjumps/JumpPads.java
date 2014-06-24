package me.awesomer3.jumppads;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class JumpPads extends JavaPlugin{
	public final MyPlayerListener pl = new MyPlayerListener();
	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		getLogger().info(ChatColor.GOLD + "JumpPads has been enabled");
		pm.registerEvents(this.pl,  this);
	}
	@Override
	public void onDisable() {
		getLogger().info(ChatColor.GOLD + "JumpPads has been disabled");
	}
	
//Events	
	
/**	
	@EventHandler
	public void onPlayerToggleFlight(PlayerToggleFlightEvent event) {
		Player player = event.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE)
			return;
		event.setCancelled(true);
		player.setAllowFlight(false);
		player.setFlying(false);
		player.setVelocity(player.getLocation().getDirection().multiply(1.5)
				.setY(1));
		Location loc = player.getLocation();
		player.playSound(loc, Sound.GHAST_FIREBALL, 4F, 1F);
		player.setFallDistance(0);
	}
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) {
		Player player = event.getPlayer();
		if ((player.getGameMode() != GameMode.CREATIVE) && (player.getLocation().subtract(0, 1, 0).getBlock().getType() != Material.AIR) && (!player.isFlying())) {
			player.setAllowFlight(true);
		}
	}

	@EventHandler
	public void onEntityDamage(EntityDamageEvent event) {
		if (!(event.getEntity() instanceof Player)) {
			return;
		}
		if ((event.getCause().equals(EntityDamageEvent.DamageCause.FALL))) {
			event.setCancelled(true);
		}
	}
*/
}