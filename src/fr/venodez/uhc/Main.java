package fr.venodez.uhc;

import org.bukkit.plugin.java.JavaPlugin;

import fr.venodez.uhc.handlers.EventsHandler;
import fr.venodez.uhc.handlers.ScoreboardHandler;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		
		EventsHandler.register();
		ScoreboardHandler.createScoreboard();
		
	}
	
	public void onDisable() {
		
		
	}

}
