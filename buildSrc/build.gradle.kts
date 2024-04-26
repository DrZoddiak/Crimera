plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

// This should match with what is provided on the server
val kotlinVersion = "1.9.21"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    implementation("org.spongepowered:spongegradle-plugin-development:2.2.0")
    implementation("com.github.johnrengelman:shadow:8.1.1")
}
