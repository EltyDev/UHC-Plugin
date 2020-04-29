package fr.venodez.uhc.handlers;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import fr.venodez.uhc.events.OnInventoryClick;
import fr.venodez.uhc.events.OnJoin;

public class ScoreboardHandler {
	
	public static Objective sidebar;
	final static ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
	final static Scoreboard scoreboard = scoreboardManager.getMainScoreboard();
	
	public static void createScoreboard(String name, String color) {
		
		for (Objective objective : scoreboard.getObjectives()) {
			
			objective.unregister();
			
		}
		
		Objective objective = scoreboard.registerNewObjective(name, "dummy");
		sidebar = objective;
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		objective.setDisplayName(color+name);
		Score empty = objective.getScore("§7");
		empty.setScore(5);
		Score slots = objective.getScore("§6Joueurs: §e" + OnJoin.nPlayers + "/" + OnInventoryClick.slots);
		slots.setScore(2);
		Score border = objective.getScore("§2Bordure: §a" + OnInventoryClick.borderSize);
		border.setScore(1);
		
	}
	
	public static void replaceScore(String objective, String score, String newScore) {
		
		Objective obj = scoreboard.getObjective(objective);
		int value = obj.getScore(score).getScore();
		scoreboard.resetScores(score);
		Score nScore = obj.getScore(newScore);
		nScore.setScore(value);
		
	}
	
}
