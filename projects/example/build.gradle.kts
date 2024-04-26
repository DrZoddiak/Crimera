import org.spongepowered.plugin.metadata.model.PluginDependency

plugins {
    // Provides SpongeGradle and Kotlin
    // Common is provided already with SpongePlugin
    // id("common")
    id("spongeplugin")
}

// Your plugins version!
version = "1.0-SNAPSHOT"

sponge {
    // todo: Replace me!
    plugin("replaceme") {
        version(project.version.toString())
        // todo: Replace me!
        displayName("Replace Me")
        // todo: Replace me!
        entrypoint("com.github.replaceme.Main")
        description("Will eventually do something!")
        // Provides Kotlin 1.9.21
        // Must be available on the server
        // MCKotlin on Ore!
        dependency("mckotlin-sponge") {
            version("1.4.0-k1.9.21")
            loadOrder(PluginDependency.LoadOrder.AFTER)
            optional(false)
        }
    }
}

