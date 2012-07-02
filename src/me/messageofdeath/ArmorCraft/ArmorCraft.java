package me.messageofdeath.ArmorCraft;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class ArmorCraft extends JavaPlugin {
	
	private String lprefix;
	
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
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
	
	public void loadHelmets() {
		// Leather Helmet
		ShapedRecipe leatherhelmet = new ShapedRecipe(new ItemStack(Material.LEATHER, 5));
		leatherhelmet.shape(new String[] {"A"});
		leatherhelmet.setIngredient('A', Material.LEATHER_HELMET);
		addRecipe(leatherhelmet);
				
		// Iron Helmet
		ShapedRecipe ironhelmet = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 5));
		ironhelmet.shape(new String[] {"A"});
		ironhelmet.setIngredient('A', Material.IRON_HELMET);
		addRecipe(ironhelmet);
		
		// Gold Helmet
		ShapedRecipe goldhelmet = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 5));
		goldhelmet.shape(new String[] {"A"});
		goldhelmet.setIngredient('A', Material.GOLD_HELMET);
		addRecipe(goldhelmet);
		
		// Diamond Helmet
		ShapedRecipe diamondhelmet = new ShapedRecipe(new ItemStack(Material.DIAMOND, 5));
		diamondhelmet.shape(new String[] {"A"});
		diamondhelmet.setIngredient('A', Material.DIAMOND_HELMET);
		addRecipe(diamondhelmet);
	}
	
	public void loadChestPlates() {
		// Leather ChestPlate
		ShapedRecipe leatherchest = new ShapedRecipe(new ItemStack(Material.LEATHER, 9));
		leatherchest.shape(new String[] {"A"});
		leatherchest.setIngredient('A', Material.LEATHER_CHESTPLATE);
		addRecipe(leatherchest);
		
		// Iron ChestPlate
		ShapedRecipe ironchest = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 9));
		ironchest.shape(new String[] {"A"});
		ironchest.setIngredient('A', Material.IRON_CHESTPLATE);
		addRecipe(ironchest);
		
		// Gold ChestPlate
		ShapedRecipe goldchest = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 9));
		goldchest.shape(new String[] {"A"});
		goldchest.setIngredient('A', Material.GOLD_CHESTPLATE);
		addRecipe(goldchest);
		
		// Diamond ChestPlate
		ShapedRecipe diamondchest = new ShapedRecipe(new ItemStack(Material.DIAMOND, 9));
		diamondchest.shape(new String[] {"A"});
		diamondchest.setIngredient('A', Material.DIAMOND_CHESTPLATE);
		addRecipe(diamondchest);
	}
	
	public void loadLeggings() {
		// Leather ChestPlate
		ShapedRecipe leatherlegs = new ShapedRecipe(new ItemStack(Material.LEATHER, 7));
		leatherlegs.shape(new String[] {"A"});
		leatherlegs.setIngredient('A', Material.LEATHER_LEGGINGS);
		addRecipe(leatherlegs);
		
		// Iron ChestPlate
		ShapedRecipe ironlegs = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 7));
		ironlegs.shape(new String[] {"A"});
		ironlegs.setIngredient('A', Material.IRON_LEGGINGS);
		addRecipe(ironlegs);
		
		// Gold ChestPlate
		ShapedRecipe goldlegs = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 7));
		goldlegs.shape(new String[] {"A"});
		goldlegs.setIngredient('A', Material.GOLD_LEGGINGS);
		addRecipe(goldlegs);
		
		// Diamond ChestPlate
		ShapedRecipe diamondlegs = new ShapedRecipe(new ItemStack(Material.DIAMOND, 7));
		diamondlegs.shape(new String[] {"A"});
		diamondlegs.setIngredient('A', Material.DIAMOND_LEGGINGS);
		addRecipe(diamondlegs);
	}
	
	public void loadBoots() {
		// Leather ChestPlate
		ShapedRecipe leatherboots = new ShapedRecipe(new ItemStack(Material.LEATHER, 4));
		leatherboots.shape(new String[] {"A"});
		leatherboots.setIngredient('A', Material.LEATHER_BOOTS);
		addRecipe(leatherboots);
				
		// Iron ChestPlate
		ShapedRecipe ironboots = new ShapedRecipe(new ItemStack(Material.IRON_INGOT, 4));
		ironboots.shape(new String[] {"A"});
		ironboots.setIngredient('A', Material.IRON_BOOTS);
		addRecipe(ironboots);
				
		// Gold ChestPlate
		ShapedRecipe goldboots = new ShapedRecipe(new ItemStack(Material.GOLD_INGOT, 4));
		goldboots.shape(new String[] {"A"});
		goldboots.setIngredient('A', Material.GOLD_BOOTS);
		addRecipe(goldboots);
				
		// Diamond ChestPlate
		ShapedRecipe diamondboots = new ShapedRecipe(new ItemStack(Material.DIAMOND, 4));
		diamondboots.shape(new String[] {"A"});
		diamondboots.setIngredient('A', Material.DIAMOND_BOOTS);
		addRecipe(diamondboots);
	}
	
	public void addRecipe(ShapedRecipe recipe) {
		getServer().addRecipe(recipe);
	}
}