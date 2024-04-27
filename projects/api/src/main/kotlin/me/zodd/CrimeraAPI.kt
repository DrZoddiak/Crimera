package me.zodd

import me.zodd.command.CommandManager
import org.apache.logging.log4j.Logger
import org.spongepowered.configurate.CommentedConfigurationNode
import org.spongepowered.configurate.reference.ConfigurationReference

class CrimeraAPI(private val logger: Logger, private val reference: ConfigurationReference<CommentedConfigurationNode>) {
    val commandManager: CommandManager get() = CommandManager.builder
    val configLoader = CrimeraConfigLoader(logger, reference)

}

