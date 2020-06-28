/*
    Project: TitaniumCore
    @author Untitlxd_
    @since 10/05/2020 - 23:46
*/

package me.darkboy.titaniumcore.utils;

import me.darkboy.titaniumcore.TitaniumCore;

public class PluginData {

    public static String pluginName = "TitaniumCore";
    public static String author = "Untitlxd_";
    public static double version = Double.parseDouble(TitaniumCore.getPlugin().getDescription().getVersion().replace("-DEV", "").replace("-REL", ""));
    public static String pluginDescription = TitaniumCore.getPlugin().getDescription().getDescription();

}
