package me.zodd

import org.spongepowered.configurate.objectmapping.ConfigSerializable

@ConfigSerializable
class PluginConfig {
    val debug = false
    val transactionLogging = false
}