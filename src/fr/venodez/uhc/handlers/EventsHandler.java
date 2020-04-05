package fr.venodez.uhc.handlers;

import fr.venodez.uhc.Main;
import fr.venodez.uhc.events.OnInventoryClick;
import fr.venodez.uhc.events.OnJoin;
import fr.venodez.uhc.events.OnRightClick;

public class EventsHandler {
	
	private static Main plugin = Main.getPlugin(Main.class);
	
	public static void register() {
		
		plugin.getServer().getPluginManager().registerEvents(new OnJoin(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new OnRightClick(), plugin);
		plugin.getServer().getPluginManager().registerEvents(new OnInventoryClick(), plugin);
		
	}
	
}
