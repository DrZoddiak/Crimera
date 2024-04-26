package com.github.replaceme

import com.google.inject.Inject
import org.apache.logging.log4j.Logger
import org.spongepowered.api.config.DefaultConfig
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.lifecycle.ConstructPluginEvent
import org.spongepowered.configurate.CommentedConfigurationNode
import org.spongepowered.configurate.reference.ConfigurationReference
import org.spongepowered.plugin.PluginContainer

class Main @Inject internal constructor(
    private val plugin: PluginContainer,
    private val logger: Logger,
    @DefaultConfig(sharedRoot = false)
    private val config: ConfigurationReference<CommentedConfigurationNode>
) {

    @Listener
    fun ConstructPluginEvent.onConstruction() {
        loadConfig()
    }

    private fun loadConfig(): PluginConfig {
        logger.info("Loading config...")
        val ref = config.referenceTo(PluginConfig::class.java)
        config.save()
        // If failing to get the config, use the default
        return ref.get() ?: PluginConfig()
    }
}