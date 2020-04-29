package fr.venodez.uhc.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTPW implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String aliases, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("tpw")) {
			
			if (sender instanceof Player) {
				
				Player player = (Player) sender;
				
				if (args.length == 0) {
					
					player.sendMessage("§cVeuillez donner le nom du monde voulu.");
					
				}
				
				else if (Bukkit.getWorld(args[0]) == null) {
					
					player.sendMessage("§cVeuillez donner le nom d'un monde valide");
					
				}
				
				else {
					
					player.teleport(new Location(Bukkit.getWorld(args[0]), 0, 120, 0));
					player.sendMessage("§aVous avez téléporté au monde §e" + args[0] + "§a au coordonnée x: 0 y: 120 z:0");
					return true;
					
				}
			
			}
			
		}
		
		return false;
	}

}
