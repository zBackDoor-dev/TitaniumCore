package me.darkboy.titaniumcore.utils;

import org.bukkit.ChatColor;

public class Colors {

    public static String translate(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
