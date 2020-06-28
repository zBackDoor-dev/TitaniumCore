package me.darkboy.titaniumcore;

import me.darkboy.titaniumcore.commands.FlyCommand;
import me.darkboy.titaniumcore.commands.MainCommand;
import me.darkboy.titaniumcore.files.Resources;
import me.darkboy.titaniumcore.system.TitaniumPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

@SuppressWarnings("unused")
public final class TitaniumCore extends TitaniumPlugin {

    private static TitaniumCore plugin;

    private static final String prefix = ChatColor.GRAY + "(" + ChatColor.AQUA + "Titanium" + ChatColor.GRAY + ") " + ChatColor.YELLOW;

    @Override
    public void enable() {
        // Instance
        plugin = this;

        // Register plugin classes
        this.register(Resources.class,
                MainCommand.class, FlyCommand.class);
        Bukkit.getConsoleSender().sendMessage(prefix + "The plugin has been enabled!");
    }

    @Override
    public void disable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage(prefix + "The plugin has been disabled!");
    }

    public static String getPrefix() {
        return prefix;
    }

    public static TitaniumCore getPlugin() {
        return plugin;
    }
}
