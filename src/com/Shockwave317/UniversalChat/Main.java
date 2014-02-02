package com.Shockwave317.UniversalChat;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.Shockwave317.UniversalChat.Executors.*;

public class Main extends JavaPlugin implements Listener {

	public static Main plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version: " + pdfFile.getVersion() + " Has Been Enabled!");
	    getCommand("uc").setExecutor(this);
	    getCommand("basic").setExecutor(new ClearChatCommandExecutor(this));
	    PluginManager pm = this.getServer().getPluginManager();
	    pm.registerEvents(this, this); 
	}
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;
		PluginDescriptionFile pdfFile = this.getDescription();
		
		if (args.length == 0) {

			 player.sendMessage(ChatColor.WHITE + "[" + ChatColor.RED + pdfFile.getName() + ChatColor.WHITE + "] [" + ChatColor.BLUE + pdfFile.getVersion() + ChatColor.WHITE + "]");

		}
    	
    	return false;
    }
}
