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

public class SetHomeCommand extends TitaniumCommand {

    public SetHomeCommand() {
        this.setAliases("sethome");
        this.setPermission(Permissions.SETHOME_PERM.getPermission());
        this.setDescription("Set your home");
        this.setUsage("/sethome");
        this.setPermissionDenyMessage(Language.NO_PERM.getMessage());
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player player = (Player) sender;
        TitaniumCore.getHomes().setHome(player);
        Players.sendMessage(player, Language.SETHOME.getMessage());
    }
}
