/*
    Created by Untitlxd_
    Project: TitaniumCore
    Date: 28/06/2020
*/

package me.darkboy.titaniumcore.commands;

import me.darkboy.titaniumcore.files.yml.Language;
import me.darkboy.titaniumcore.system.register.command.TitaniumCommand;
import me.darkboy.titaniumcore.system.util.Players;
import me.darkboy.titaniumcore.utils.Permissions;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand extends TitaniumCommand {

    public FeedCommand() {
        this.setAliases("feed");
        this.setDescription("Feed you!");
        this.setUsage("/feed");
        this.setPermission(Permissions.FEED_PERM.getPermission());
        this.setPermissionDenyMessage(Language.NO_PERM.getMessage());
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Player player = (Player) sender;
        if (args.length > 1) {
            Players.sendMessage(player, Language.USAGE.getMessage("{usage}", this.getUsage(), "{args}", "&3Player &bName"));
        } else if (args.length == 0) {
            if (player.getFoodLevel() == 20) {
                Players.sendMessage(player, Language.FEED_ALREADY.getMessage());
            } else {
                player.setFoodLevel(20);
                player.setSaturation(10);
                player.setExhaustion(0F);
                Players.sendMessage(player, Language.FEED_MSG.getMessage());
            }
        } else {
            Player target = Bukkit.getPlayerExact(args[0]);
            if (target == null) {
                Players.sendMessage(player, Language.NOT_FOUND.getMessage("{player}", args[0]));
            } else if (target.getFoodLevel() == 20) {
                Players.sendMessage(player, Language.FEED_ALREADY_OTHER.getMessage("{player}", target.getName()));
            } else {
                target.setFoodLevel(20);
                target.setSaturation(10);
                target.setExhaustion(0F);
                Players.sendMessage(player, Language.FEED_OTHER.getMessage("{player}", target.getName()));
                Players.sendMessage(target, Language.FEED_MSG.getMessage());
            }
        }
    }
}
