package fr.venodez.uhc.handlers;

import fr.venodez.uhc.Main;
import fr.venodez.uhc.commands.CommandTPW;

public class CommandsHandler {
	
	private static Main plugin = Main.getPlugin(Main.class);
	
	public static void register() {
		
		plugin.getCommand("tpw").setExecutor(new CommandTPW());
		
	}

}
