package me.darkboy.titaniumcore.commands;

import me.darkboy.titaniumcore.commands.args.ReloadCommand;
import me.darkboy.titaniumcore.files.yml.Language;
import me.darkboy.titaniumcore.system.register.command.TitaniumCommand;
import me.darkboy.titaniumcore.system.util.Players;
import me.darkboy.titaniumcore.utils.Permissions;
import org.bukkit.command.CommandSender;

public class MainCommand extends TitaniumCommand {

    public MainCommand() {
        this.setAliases("titaniumcore", "tc", "titanium");
        this.setPermission(Permissions.ADMIN.getPermission());
        this.setAllowConsole(true);
        this.setPermissionDenyMessage(Language.NO_PERM.getMessage());
        this.setChildren(new ReloadCommand());
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Players.sendMessage(sender, "&7&m--------------------");
        Players.sendMessage(sender, "");
        sendCommandString(sender, "titaniumcore", "Shows this message");
        sendCommandString(sender, "titaniumcore reload", "Reload the plugin");
        sendCommandString(sender, "fly", "Allows you to fly");
        sendCommandString(sender, "heal", "Heal you!");
        sendCommandString(sender, "feed", "Feed you!");
        Players.sendMessage(sender, "");
        Players.sendMessage(sender, "&7&m--------------------");
    }

    private void sendCommandString(CommandSender sender, String command, String description) {
        Players.sendMessage(sender, "&e/" + command + " &7" + "(" + description + ")");
    }
}
