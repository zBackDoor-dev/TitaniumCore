package me.darkboy.titaniumcore.utils;

public enum Permissions {

    ADMIN("titaniumcore.admin"),
    FLY_PERM("titaniumcore.fly");

    private final String permission;

    Permissions(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
