package me.darkboy.titaniumcore.utils;

public enum Permissions {

    ADMIN("titaniumcore.admin"),
    HEAL_PERM("titaniumcore.heal"),
    FEED_PERM("titaniumcore.feed"),
    SETHOME_PERM("titaniumcore.sethome"),
    HOME_PERM("titaniumcore.home"),
    FLY_PERM("titaniumcore.fly");

    private final String permission;

    Permissions(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
