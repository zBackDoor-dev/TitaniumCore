/*
    Created by Untitlxd_
    Project: TitaniumCore
    Date: 28/06/2020
*/

package me.darkboy.titaniumcore.commands.homes;

import me.darkboy.titaniumcore.TitaniumCore;
import me.darkboy.titaniumcore.files.yml.Language;
import me.darkboy.titaniumcore.system.register.command.TitaniumCommand;
import me.darkboy.titaniumcore.system.util.Players;
import me.darkboy.titaniumcore.utils.Permissions;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HomeCommand extends TitaniumCommand {

    public HomeCommand() {
        this.setAliases("home");
        this.setDescription("Teleport to your home");
        this.setUsage("/home");
        this.setPermission(Permissions.HOME_PERM.getPermission());
        this.setPermissionDenyMessage(Language.NO_PERM.getMessage());
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player player = (Player) sender;
        if (args.length == 0) {
            if (TitaniumCore.getHomes().isHomeNull(player)) {
                Players.sendMessage(player, Language.HOME_NOT_FOUND.getMessage());
            } else {
                player.teleport(TitaniumCore.getHomes().getHome(player));
                Players.sendMessage(player, Language.HOME.getMessage());
            }
        } else {
            Players.sendMessage(player, Language.USAGE.getMessage("{usage}", this.getUsage(), "{args}", ""));
        }
    }
}
