plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    maven("https://repo.spongepowered.org/repository/maven-public/")
}

dependencies {
    implementation(toolchain.kotlin)
    implementation(toolchain.spongegradle)
    implementation(toolchain.shadow)
}
