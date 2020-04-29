package fr.venodez.uhc;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldType;
import org.bukkit.plugin.java.JavaPlugin;

import fr.venodez.uhc.handlers.CommandsHandler;
import fr.venodez.uhc.handlers.EventsHandler;
import fr.venodez.uhc.handlers.ScoreboardHandler;
import fr.venodez.uhc.handlers.WorldHandler;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		
		WorldHandler.deleteWorld("uhc");
		EventsHandler.register();
		CommandsHandler.register();
		ScoreboardHandler.createScoreboard("UHC","§e§l");
		WorldHandler.createWorld("uhc", World.Environment.NORMAL, WorldType.NORMAL);
		Bukkit.getWorld("uhc").getWorldBorder().setCenter(0.0,0.0);
		Bukkit.getWorld("uhc").getWorldBorder().setSize(2000);
	
	}
		
	public void onDisable() {
		
		WorldHandler.deleteWorld("uhc");
		
	}

}
