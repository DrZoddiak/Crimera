package me.zodd

import org.apache.logging.log4j.Logger
import org.spongepowered.configurate.CommentedConfigurationNode
import org.spongepowered.configurate.reference.ConfigurationReference

class CrimeraConfigLoader(
    val logger: Logger,
    val reference: ConfigurationReference<CommentedConfigurationNode>
) {
    /**
     * <T> is the Config to attempt to load from
     * Returns null if deserialization fails
     */
    inline fun <reified T> loadConfig(): T? {
        val ref = reference.referenceTo(T::class.java)
        reference.save()
        return ref.get().let {
            if (it == null) {
                logger.info("Config failed to deserialize!")
            }
            it
        }
    }
}