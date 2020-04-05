package fr.venodez.uhc.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Methods {

	public static ItemStack generateItem(Material material, int number, int metadata, String name) {
		
		ItemStack item = new ItemStack(material, number, (short) metadata);
		ItemMeta itemMeta = item.getItemMeta();
		itemMeta.setDisplayName(name);
		item.setItemMeta(itemMeta);
		return item;
		
	}
	
}
