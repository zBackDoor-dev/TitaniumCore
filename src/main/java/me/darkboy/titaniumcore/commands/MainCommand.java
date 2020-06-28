package me.darkboy.titaniumcore.commands;

import me.darkboy.titaniumcore.commands.args.ReloadCommand;
import me.darkboy.titaniumcore.files.yml.Language;
import me.darkboy.titaniumcore.system.register.command.TitaniumCommand;
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

    }
}
