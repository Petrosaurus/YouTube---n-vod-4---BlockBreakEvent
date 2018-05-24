package me.Petrosaurus.BlockBreak;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	
	public void onEnable(){
		
		getServer().getPluginManager().registerEvents(this, this);
		
	}
	
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e){
		
		if (e.getBlock().getType() ==  Material.DIAMOND_ORE){
			
			Bukkit.broadcastMessage(ChatColor.GREEN + "Hrac " + ChatColor.RED + e.getPlayer().getName() + ChatColor.GREEN + " vykopal diamanty");
			
			
			//ChatColor
		}
		
			
			
	}
	

}
