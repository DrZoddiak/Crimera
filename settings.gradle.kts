// todo: Change me! I am the root name of this project!
rootProject.name = "SpongeKotlinExamplePlugin"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

listOf("projects")
    .forEach { dir ->
        file(dir).listFiles()?.filter { it.isDirectory }?.map { file ->
            includeProject(file.name, dir)
        }
    }

fun includeProject(name: String, folder: String? = null) {
    include(name) {
        this.name = "${rootProject.name}-$name"
        if (folder != null) {
            projectDir = file("$folder/$name")
        }
    }
}

fun include(name: String, block: ProjectDescriptor.() -> Unit) {
    include(name)
    project(":$name").apply(block)
}
