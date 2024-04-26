import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import gradle.kotlin.dsl.accessors._e56432c3c791e352ac4516bd91b79cf3.jar

plugins {
    id("com.github.johnrengelman.shadow")
}

tasks {
    tasks.withType(ShadowJar::class) {
        archiveClassifier.set("")
        configurations = listOf(project.configurations.findByName("shadow"))
        archiveBaseName.set("${project.name}-${project.version}")
    }
    jar {
        enabled = false
        finalizedBy("shadowJar")
    }
}