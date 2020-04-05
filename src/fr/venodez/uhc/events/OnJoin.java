package fr.venodez.uhc.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.venodez.uhc.utils.Methods;

public class OnJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		
		Player player = event.getPlayer();
		player.teleport(new Location(Bukkit.getServer().getWorld("world"), 0, 121, 0, 90, 0));
		player.getInventory().clear();
		player.getInventory().setItem(8, Methods.generateItem(Material.BANNER, 1, 15, "§f§lTeams"));
		
		if (player.getName().equalsIgnoreCase("EnzoLeMagnifique")) {
			
			player.getInventory().setItem(0, Methods.generateItem(Material.NETHER_STAR, 1, 0, "§f§l✔  Choix de UHC"));
			player.getInventory().setItem(1, Methods.generateItem(Material.DIODE, 1, 0, "§c§lParamètres"));
			
		}
		
	}

}
