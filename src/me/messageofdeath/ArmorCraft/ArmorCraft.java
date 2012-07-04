package me.messageofdeath.ArmorCraft;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ArmorCraft extends JavaPlugin implements Listener {
	
	private String lprefix;
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this, this);
		lprefix = "[" + pdfFile.getName() + "] v" + pdfFile.getVersion() + ": ";
		log("is now enabling...");
		log("loading recipes...");
		loadHelmets();
		loadChestPlates();
		loadLeggings();
		loadBoots();
		log("loaded recipes!");
		log("is now enabled!");
	}
	
	@Override
	public void onDisable() {
		log("is now disabled!");
	}
	
	public void log(String log) {
		Bukkit.getLogger().info(lprefix + log);
	}
	
	public ArrayList<Material> materials = new ArrayList<Material>();
	
	public void loadHelmets() {
		// Leather Helmet
		ShapedRecipe leatherhelmet = new ShapedRecipe(new ItemStack(Material.LEATHER, 3));
		leatherhelmet.shape(new String[] {"A"});
		leatherhelmet.setIngredient('A', Material.LEATHER_HELMET);
		addRecipe(leatherhelmet);
		materials.add(Material.LEATHER_HELMET);
				
		// Iron Helmet
		ShapedRecipe ironhelmet = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 3));
		ironhelmet.shape(new String[] {"A"});
		ironhelmet.setIngredient('A', Material.IRON_HELMET);
		addRecipe(ironhelmet);
		materials.add(Material.IRON_HELMET);
		
		// Gold Helmet
		ShapedRecipe goldhelmet = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 3));
		goldhelmet.shape(new String[] {"A"});
		goldhelmet.setIngredient('A', Material.GOLD_HELMET);
		addRecipe(goldhelmet);
		materials.add(Material.GOLD_HELMET);
		
		// Diamond Helmet
		ShapedRecipe diamondhelmet = new ShapedRecipe(new ItemStack(Material.DIAMOND, 3));
		diamondhelmet.shape(new String[] {"A"});
		diamondhelmet.setIngredient('A', Material.DIAMOND_HELMET);
		addRecipe(diamondhelmet);
		materials.add(Material.DIAMOND_HELMET);
	}
	
	public void loadChestPlates() {
		// Leather ChestPlate
		ShapedRecipe leatherchest = new ShapedRecipe(new ItemStack(Material.LEATHER, 4));
		leatherchest.shape(new String[] {"A"});
		leatherchest.setIngredient('A', Material.LEATHER_CHESTPLATE);
		addRecipe(leatherchest);
		materials.add(Material.LEATHER_CHESTPLATE);
		
		// Iron ChestPlate
		ShapedRecipe ironchest = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 4));
		ironchest.shape(new String[] {"A"});
		ironchest.setIngredient('A', Material.IRON_CHESTPLATE);
		addRecipe(ironchest);
		materials.add(Material.IRON_CHESTPLATE);
		
		// Gold ChestPlate
		ShapedRecipe goldchest = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 4));
		goldchest.shape(new String[] {"A"});
		goldchest.setIngredient('A', Material.GOLD_CHESTPLATE);
		addRecipe(goldchest);
		materials.add(Material.GOLD_CHESTPLATE);
		
		// Diamond ChestPlate
		ShapedRecipe diamondchest = new ShapedRecipe(new ItemStack(Material.DIAMOND, 4));
		diamondchest.shape(new String[] {"A"});
		diamondchest.setIngredient('A', Material.DIAMOND_CHESTPLATE);
		addRecipe(diamondchest);
		materials.add(Material.DIAMOND_CHESTPLATE);
	}
	
	public void loadLeggings() {
		// Leather Leggings
		ShapedRecipe leatherlegs = new ShapedRecipe(new ItemStack(Material.LEATHER, 5));
		leatherlegs.shape(new String[] {"A"});
		leatherlegs.setIngredient('A', Material.LEATHER_LEGGINGS);
		addRecipe(leatherlegs);
		materials.add(Material.LEATHER_LEGGINGS);
		
		// Iron Leggings
		ShapedRecipe ironlegs = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 5));
		ironlegs.shape(new String[] {"A"});
		ironlegs.setIngredient('A', Material.IRON_LEGGINGS);
		addRecipe(ironlegs);
		materials.add(Material.IRON_LEGGINGS);
		
		// Gold Leggings
		ShapedRecipe goldlegs = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 5));
		goldlegs.shape(new String[] {"A"});
		goldlegs.setIngredient('A', Material.GOLD_LEGGINGS);
		addRecipe(goldlegs);
		materials.add(Material.GOLD_LEGGINGS);
		
		// Diamond Leggings
		ShapedRecipe diamondlegs = new ShapedRecipe(new ItemStack(Material.DIAMOND, 5));
		diamondlegs.shape(new String[] {"A"});
		diamondlegs.setIngredient('A', Material.DIAMOND_LEGGINGS);
		addRecipe(diamondlegs);
		materials.add(Material.DIAMOND_LEGGINGS);
	}
	
	public void loadBoots() {
		// Leather Boots
		ShapedRecipe leatherboots = new ShapedRecipe(new ItemStack(Material.LEATHER, 2));
		leatherboots.shape(new String[] {"A"});
		leatherboots.setIngredient('A', Material.LEATHER_BOOTS);
		addRecipe(leatherboots);
		materials.add(Material.LEATHER_BOOTS);
				
		// Iron Boots
		ShapedRecipe ironboots = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 2));
		ironboots.shape(new String[] {"A"});
		ironboots.setIngredient('A', Material.IRON_BOOTS);
		addRecipe(ironboots);
		materials.add(Material.IRON_BOOTS);
				
		// Gold Boots
		ShapedRecipe goldboots = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 2));
		goldboots.shape(new String[] {"A"});
		goldboots.setIngredient('A', Material.GOLD_BOOTS);
		addRecipe(goldboots);
		materials.add(Material.GOLD_BOOTS);
				
		// Diamond Boots
		ShapedRecipe diamondboots = new ShapedRecipe(new ItemStack(Material.DIAMOND, 2));
		diamondboots.shape(new String[] {"A"});
		diamondboots.setIngredient('A', Material.DIAMOND_BOOTS);
		addRecipe(diamondboots);
		materials.add(Material.DIAMOND_BOOTS);
	}
	
	public void addRecipe(ShapedRecipe recipe) {
		getServer().addRecipe(recipe);
	}
	
	@EventHandler
	public void onCraftItem(CraftItemEvent event) {
		Player player = (Player)event.getWhoClicked();
		int i = event.getInventory().getSize() - 1;
		short dura = 0;
		Material mat = null;
		while(i != -1) {
			if(materials.contains(event.getInventory().getItem(i).getType())) {
				dura = event.getInventory().getItem(i).getDurability();
				mat = event.getInventory().getItem(i).getType();
				i = -1;
				if(dura != mat.getMaxDurability()) {
					player.sendMessage("You cant use a damaged " + mat.name().replace("_", "") + "!");
				}
			}i--;
		}
	}
}