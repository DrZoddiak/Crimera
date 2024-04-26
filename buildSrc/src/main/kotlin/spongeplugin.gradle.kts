
plugins {
    id("common")
    id("org.spongepowered.gradle.plugin")
}

// These are common settings that are overridable
sponge {
    // Sponge API version to target
    apiVersion("8.2.0")
    // todo: Change me?
    license("ALL RIGHTS RESERVED")
    loader {
        name("java_plain")
        version("1.0")
    }
}