package fr.venodez.uhc.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnQuit implements Listener {

	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		
		OnJoin.nPlayers--;
		Player player = event.getPlayer();
		event.setQuitMessage("§8" + player.getName() + " a quitté la partie (§e" + OnJoin.nPlayers + "/" + OnInventoryClick.slots + "§8)");
		
	}
	
	
}
