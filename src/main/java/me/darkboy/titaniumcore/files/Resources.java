package me.darkboy.titaniumcore.files;

import me.darkboy.titaniumcore.system.TitaniumPlugin;
import me.darkboy.titaniumcore.system.register.Registrable;
import me.darkboy.titaniumcore.system.resource.Resource;
import me.darkboy.titaniumcore.system.resource.ResourceReference;

import java.util.stream.Stream;

public class Resources implements Registrable {

    private static final Resources instance = new Resources();

    public static Resources get() {
        return instance;
    }

    @Override
    public void register() {
        Stream.of(ResourceType.values()).forEach(type -> TitaniumPlugin.getResourceProvider().loadResource(type.getReference()));
    }

    private Resource getResource(ResourceReference reference) {
        return TitaniumPlugin.getResourceProvider().getResource(reference);
    }

    public Resource getResource(ResourceType type) {
        return getResource(type.getReference());
    }
}