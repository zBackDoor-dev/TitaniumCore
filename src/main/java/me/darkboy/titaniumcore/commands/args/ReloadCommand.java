package me.darkboy.titaniumcore.commands.args;

import me.darkboy.titaniumcore.files.Resources;
import me.darkboy.titaniumcore.files.yml.Language;
import me.darkboy.titaniumcore.system.register.command.TitaniumCommand;
import me.darkboy.titaniumcore.system.util.Players;
import me.darkboy.titaniumcore.utils.Permissions;
import org.bukkit.command.CommandSender;

public class ReloadCommand extends TitaniumCommand {

    public ReloadCommand() {
        this.setAliases("reload", "rl");
        this.setPermission(Permissions.ADMIN.getPermission());
        this.setAllowConsole(true);
        this.setPermissionDenyMessage(Language.NO_PERM.getMessage());
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        Resources.get().register();
        Players.sendMessage(sender, Language.RELOAD.getMessage());
    }
}
