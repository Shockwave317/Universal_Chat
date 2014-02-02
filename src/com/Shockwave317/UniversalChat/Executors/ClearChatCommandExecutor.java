package com.Shockwave317.UniversalChat.Executors;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.Shockwave317.UniversalChat.Main;

public class ClearChatCommandExecutor implements CommandExecutor {
	private Main plugin;

	public ClearChatCommandExecutor(Main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		// TODO Auto-generated method stub
		return false;
	}



}
