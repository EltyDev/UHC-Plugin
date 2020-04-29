package fr.venodez.uhc.handlers;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;

public class WorldHandler {
	
	public static void createWorld(String name, World.Environment environment, WorldType type) {
		
		WorldCreator world = new WorldCreator(name);
		world.environment(World.Environment.NORMAL);
		world.type(WorldType.NORMAL);
		world.createWorld();
		
	}

	public static void deleteWorld(String name) {
		
		if (Bukkit.getWorld(name) == null) return;
		
		World world = Bukkit.getWorld(name);
		Bukkit.unloadWorld(world, false);
		File folder = new File((Bukkit.getWorldContainer().getAbsolutePath() + "\\" + name).replace(".", ""));
		System.out.println(folder);
		System.out.println(folder.listFiles());
		
		if (folder.listFiles() != null) {
		
			for (File files : folder.listFiles()) {
			
				files.delete();
			  	
			}
		
		}
			
		folder.delete();
		
	}	
	
}
	
