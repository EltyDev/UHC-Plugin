package fr.venodez.uhc.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.venodez.uhc.utils.Methods;

public class OnInventoryClick implements Listener {
	
	public String gamemode;
	private final ItemStack lbGlass = Methods.generateItem(Material.STAINED_GLASS_PANE, 1, 3, null);
	private final ItemStack wGlass = Methods.generateItem(Material.STAINED_GLASS_PANE, 1, 0, null);
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		
		Inventory inv = event.getInventory();
		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();
		
		if (inv.getName().equalsIgnoreCase("§f§l✔  Choix de UHC")) {
			
			event.setCancelled(true);
			
			if (item.getItemMeta().getDisplayName().equalsIgnoreCase("§eUHC")) {
				
				gamemode = "uhc";
				player.closeInventory();
				
			}
			
			else if (item.getItemMeta().getDisplayName().equalsIgnoreCase("§6UHC Run")) {
				
				gamemode = "uhcrun";
				player.closeInventory();
			
			}
			
			else if (item.getItemMeta().getDisplayName().equalsIgnoreCase("§bUHC Host")) {
				
				gamemode = "uhchost";
				player.closeInventory();
			
			}
			
			else if (item.getItemMeta().getDisplayName().equalsIgnoreCase("§cLoup-Garou UHC")) {
				
				gamemode = "lguhc";
				player.closeInventory();
			
			}
		
		}
		
		else if (inv.getName().equalsIgnoreCase("§c§lParamètres")) {
			
			event.setCancelled(true);
			
			if (item.getItemMeta().getDisplayName().equalsIgnoreCase("§6Bordure")) {
				
				Inventory gui = Bukkit.createInventory(null, 27, "§6§lTaille de la bordure");
				ItemStack door = Methods.generateItem(Material.WOOD_DOOR, 1, 0, "§7Retour");
				ItemStack redDye = Methods.generateItem(Material.INK_SACK, 1, 1, "§c-1000");
				ItemStack redDye1 = Methods.generateItem(Material.INK_SACK, 1, 1, "§c-500");
				ItemStack redDye2 = Methods.generateItem(Material.INK_SACK, 1, 1, "§c-100");
				ItemStack limeDye = Methods.generateItem(Material.INK_SACK, 1, 10, "§a+100");
				ItemStack limeDye1 = Methods.generateItem(Material.INK_SACK, 1, 10, "§a+500");
				ItemStack limeDye2 = Methods.generateItem(Material.INK_SACK, 1, 10, "§a+1000");
				gui.setItem(0, door);
				gui.setItem(1, lbGlass);
				gui.setItem(2, wGlass);
				gui.setItem(3, lbGlass);
				gui.setItem(4, wGlass);
				gui.setItem(5, lbGlass);
				gui.setItem(6, wGlass);
				gui.setItem(7, lbGlass);
				gui.setItem(8, wGlass);
				gui.setItem(9, lbGlass);
				gui.setItem(10, redDye);
				gui.setItem(11, redDye1);
				gui.setItem(12, redDye2);
				gui.setItem(13, wGlass);
				gui.setItem(14, limeDye);
				gui.setItem(15, limeDye1);
				gui.setItem(16, limeDye2);
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
		
		else if (inv.getName().equalsIgnoreCase("§6§lTaille de la bordure")) {
			
			event.setCancelled(true);
			
			if (item.getItemMeta().getDisplayName().equalsIgnoreCase("§7Retour")) {
				
				Inventory gui = Bukkit.createInventory(null, 27, "§c§lParamètres");
				ItemStack barrier = Methods.generateItem(Material.BARRIER, 1, 0, "§6Bordure");
				ItemStack banner = Methods.generateItem(Material.BANNER, 1, 15, "§9Teams");
				ItemStack clock = Methods.generateItem(Material.WATCH, 1, 0, "§eTemps");
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
				gui.setItem(11, wGlass);
				gui.setItem(12, barrier);
				gui.setItem(13, banner);
				gui.setItem(14, clock);
				gui.setItem(15, wGlass);
				gui.setItem(16, lbGlass);
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

}