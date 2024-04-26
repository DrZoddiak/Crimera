import org.spongepowered.plugin.metadata.model.PluginDependency

plugins {
    id("spongeplugin")
    // Provides the shadow plugin with some pre-configuration
    id("shadow")
}

// Your plugins version!
version = "1.0-SNAPSHOT"

dependencies {
    // Let's say you wanted to use Caffeine
    // If it were provided on the server you could do something like this
    // implementation("com.github.ben-manes.caffeine:caffeine:2.9.3")
    //
    // However if you wanted to shade it you would need to do this instead
    // This also required the shadow plugin!
    shadow("com.github.ben-manes.caffeine:caffeine:2.9.3")
}

sponge {
    // todo: Replace me!
    plugin("shadeexample") {
        version(project.version.toString())
        // todo: Replace me!
        displayName("Shade Example")
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

