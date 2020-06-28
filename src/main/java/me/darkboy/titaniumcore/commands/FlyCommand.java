package me.darkboy.titaniumcore.commands;

import me.darkboy.titaniumcore.files.yml.Language;
import me.darkboy.titaniumcore.system.register.command.TitaniumCommand;
import me.darkboy.titaniumcore.system.util.Players;
import me.darkboy.titaniumcore.utils.Permissions;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand extends TitaniumCommand {

    public FlyCommand() {
        this.setAliases("fly", "flight");
        this.setPermission(Permissions.FLY_PERM.getPermission());
        this.setPermissionDenyMessage(Language.NO_PERM.getMessage());
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player player = (Player) sender;
        if (args.length == 0) {
            if (player.getAllowFlight()) {
                player.setAllowFlight(false);
                Players.sendMessage(player, Language.FLY_DISABLED.getMessage());
            } else {
                player.setAllowFlight(true);
                Players.sendMessage(player, Language.FLY_ENABLED.getMessage());
            }
        } else if (args.length == 1) {
            Player target = Bukkit.getPlayer(args[0]);
            if (target != null) {
                if (target.getAllowFlight()) {
                    Players.sendMessage(player, Language.FLY_DISABLED_OTHER.getMessage("{player}", target.getName()));
                    Players.sendMessage(target, Language.FLY_DISABLED_OTHER2.getMessage());
                    target.setAllowFlight(false);
                } else {
                    Players.sendMessage(player, Language.FLY_ENABLED_OTHER.getMessage("{player}", target.getName()));
                    Players.sendMessage(target, Language.FLY_ENABLED_OTHER2.getMessage());
                    target.setAllowFlight(true);
                }
            } else {
                Players.sendMessage(player, Language.NOT_FOUND.getMessage("{player}", args[0]));
            }
        }
    }
}
