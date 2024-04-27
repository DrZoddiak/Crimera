import org.spongepowered.plugin.metadata.model.PluginDependency

version = "1.0-SNAPSHOT"

plugins {
    spongeplugin
    shadow
}

sponge {
    plugin("sendaroo") {
        version(project.version.toString())
        displayName("Sendaroo")
        entrypoint("me.zodd.Main")
        description("Will eventually do something!")
        dependency("mckotlin-sponge") {
            version("1.4.0-k1.9.21")
            loadOrder(PluginDependency.LoadOrder.AFTER)
            optional(false)
        }
    }
}

dependencies {
    shadow(project(":Crimera-api", "shadow"))
}
