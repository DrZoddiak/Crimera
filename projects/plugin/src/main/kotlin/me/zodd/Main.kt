package me.zodd

import com.google.inject.Inject
import me.zodd.command.util.register
import net.kyori.adventure.identity.Identity
import net.kyori.adventure.text.Component
import org.apache.logging.log4j.Logger
import org.spongepowered.api.command.Command
import org.spongepowered.api.config.DefaultConfig
import org.spongepowered.api.event.Listener
import org.spongepowered.api.event.lifecycle.RegisterCommandEvent
import org.spongepowered.configurate.CommentedConfigurationNode
import org.spongepowered.configurate.reference.ConfigurationReference
import org.spongepowered.plugin.PluginContainer

class Main @Inject internal constructor(
    private val plugin: PluginContainer,
    private val logger: Logger,
    @DefaultConfig(sharedRoot = false)
    private val config: ConfigurationReference<CommentedConfigurationNode>
) {
    private val api = CrimeraAPI(logger, config)

    private val pluginConfig: PluginConfig = api.configLoader.loadConfig<PluginConfig>()
        ?: PluginConfig()

    private val commands = api.commandManager {
        command("hello") {
            executes {
                cause().sendMessage(Identity.nil(), Component.text("Hello World!"))
                success()
            }
        }
    }

    @Listener
    fun RegisterCommandEvent<Command.Parameterized>.register() {
        register(plugin, commands)
    }

}