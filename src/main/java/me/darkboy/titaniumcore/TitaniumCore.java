package me.darkboy.titaniumcore;

import me.darkboy.titaniumcore.commands.FeedCommand;
import me.darkboy.titaniumcore.commands.FlyCommand;
import me.darkboy.titaniumcore.commands.HealCommand;
import me.darkboy.titaniumcore.commands.MainCommand;
import me.darkboy.titaniumcore.commands.homes.HomeCommand;
import me.darkboy.titaniumcore.commands.homes.SetHomeCommand;
import me.darkboy.titaniumcore.files.Resources;
import me.darkboy.titaniumcore.system.TitaniumPlugin;
import me.darkboy.titaniumcore.system.resource.TitaniumConfig;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

@SuppressWarnings("unused")
public final class TitaniumCore extends TitaniumPlugin {

    private static TitaniumCore plugin;

    // Homes Data
    private static TitaniumConfig homes;

    @Override
    public void enable() {
        // Instance
        plugin = this;

        // Load data configs
        homes = new TitaniumConfig("plugins/TitaniumCore", "Data/Homes.yml");
        homes.saveConfig();

        // Register plugin classes
        this.register(Resources.class,
                MainCommand.class, FlyCommand.class, HealCommand.class, FeedCommand.class,
                SetHomeCommand.class, HomeCommand.class);
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "(" + ChatColor.DARK_AQUA + "Titanium" + ChatColor.AQUA + "Core" + ChatColor.GRAY + ")" + ChatColor.YELLOW + " The plugin has been enabled!");
    }

    @Override
    public void disable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.GRAY + "(" + ChatColor.DARK_AQUA + "Titanium" + ChatColor.AQUA + "Core" + ChatColor.GRAY + ")" + ChatColor.YELLOW + " The plugin has been disabled!");
    }

    public static TitaniumConfig getHomes() {
        return homes;
    }

    public static TitaniumCore getPlugin() {
        return plugin;
    }
}
