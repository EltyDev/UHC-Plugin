package fr.venodez.uhc.handlers;

import org.bukkit.Bukkit;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class ScoreboardHandler {
	
	static ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
	static Scoreboard scoreboard = scoreboardManager.getMainScoreboard();
	static Objective objective;
	
	public static void createScoreboard() {
		
		if (scoreboard.getObjective("UHC") == null) {
		
			Objective objective = scoreboard.registerNewObjective("UHC", "dummy");
			objective.setDisplaySlot(DisplaySlot.SIDEBAR);
			objective.setDisplayName("§e§lUHC");
			Score empty = objective.getScore("§7");
			empty.setScore(5);
			Score border = objective.getScore("§aBordure: 2000");
			border.setScore(1);
		
		}
		
		else {
			
			Objective objective = scoreboard.getObjective("UHC");
			objective.setDisplaySlot(DisplaySlot.SIDEBAR);
			objective.setDisplayName("§e§lUHC");
			scoreboard.resetScores("");
			Score empty = objective.getScore("§7");
			empty.setScore(5);
			Score border = objective.getScore("§aBordure: 2000");
			border.setScore(1);
			
		}
		
	}
	
}
