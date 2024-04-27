
plugins {
    id("common")
    id("org.spongepowered.gradle.plugin")
}

sponge {
    apiVersion("8.2.0")
    license("ALL RIGHTS RESERVED")
    loader {
        name("java_plain")
        version("1.0")
    }
}