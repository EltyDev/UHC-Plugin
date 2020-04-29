package fr.venodez.uhc.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.venodez.uhc.utils.Methods;

public class OnRightClick implements Listener {
	
	private final ItemStack lbGlass = Methods.generateItem(Material.STAINED_GLASS_PANE, 1, 3, null);
	private final ItemStack wGlass = Methods.generateItem(Material.STAINED_GLASS_PANE, 1, 0, null);
	
	
	@EventHandler
	public void onRightClick(PlayerInteractEvent event) {

		Player player = event.getPlayer();
		ItemStack item = event.getItem();
		
		if (item == null) return;
		
		if (item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().getDisplayName().equalsIgnoreCase("§f§l✔  Choix de UHC")) {
			
			Inventory gui = Bukkit.createInventory(null, 27, "§f§l✔  Choix de UHC");
			ItemStack apple = Methods.generateItem(Material.APPLE, 1, 0, "§eUHC");
			ItemStack gApple = Methods.generateItem(Material.GOLDEN_APPLE, 1, 0, "§6UHC Run");
			ItemStack egApple = Methods.generateItem(Material.GOLDEN_APPLE, 1, 1, "§bUHC Host");
			ItemStack redstone = Methods.generateItem(Material.REDSTONE, 1, 0, "§cLoup-Garou UHC");
			gui.setItem(0, lbGlass);
			gui.setItem(1, wGlass);
			gui.setItem(2, lbGlass);
			gui.setItem(3, wGlass);
			gui.setItem(4, lbGlass);
			gui.setItem(5, wGlass);	
			gui.setItem(6, lbGlass);
			gui.setItem(7, wGlass);
			gui.setItem(8, lbGlass);
			gui.setItem(9, wGlass);
			gui.setItem(10, apple);
			gui.setItem(11, wGlass);
			gui.setItem(12, gApple);
			gui.setItem(13, wGlass);
			gui.setItem(14, egApple);
			gui.setItem(15, wGlass);
			gui.setItem(16, redstone);
			gui.setItem(17, wGlass);
			gui.setItem(18, lbGlass);
			gui.setItem(19, wGlass);
			gui.setItem(20, lbGlass);
			gui.setItem(21, wGlass);
			gui.setItem(22, lbGlass);
			gui.setItem(23, wGlass);
			gui.setItem(24, lbGlass);
			gui.setItem(25, wGlass);
			gui.setItem(26, lbGlass);
			player.openInventory(gui);
		
		}
		
		else if (item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().getDisplayName().equalsIgnoreCase("§c§lParamètres")) {
			
			Inventory gui = Bukkit.createInventory(null, 27, "§c§lParamètres");
			ItemStack barrier = Methods.generateItem(Material.BARRIER, 1, 0, "§6Bordure");
			ItemStack banner = Methods.generateItem(Material.BANNER, 1, 15, "§9Teams");
			ItemStack clock = Methods.generateItem(Material.WATCH, 1, 0, "§eTemps");
			ItemStack torch = Methods.generateItem(Material.REDSTONE_TORCH_ON, 1, 0, "§9Slots");
			gui.setItem(0, lbGlass);
			gui.setItem(1, wGlass);
			gui.setItem(2, lbGlass);
			gui.setItem(3, wGlass);
			gui.setItem(4, lbGlass);
			gui.setItem(5, wGlass);
			gui.setItem(6, lbGlass);
			gui.setItem(7, wGlass);
			gui.setItem(8, lbGlass);
			gui.setItem(9, wGlass);
			gui.setItem(10, lbGlass);
			gui.setItem(11, barrier);
			gui.setItem(12, banner);
			gui.setItem(13, wGlass);
			gui.setItem(14, lbGlass);
			gui.setItem(15, clock);
			gui.setItem(16, torch);
			gui.setItem(17, wGlass);
			gui.setItem(18, lbGlass);
			gui.setItem(19, wGlass);
			gui.setItem(20, lbGlass);
			gui.setItem(21, wGlass);
			gui.setItem(22, lbGlass);
			gui.setItem(23, wGlass);
			gui.setItem(24, lbGlass);
			gui.setItem(25, wGlass);
			gui.setItem(26, lbGlass);
			player.openInventory(gui);
		
		}
		
	}

}
