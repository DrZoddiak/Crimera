import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import gradle.kotlin.dsl.accessors._285dcef16d8875fee0ec91e18e07daf9.jar

plugins {
    id("com.github.johnrengelman.shadow")
}

tasks {
    tasks.withType(ShadowJar::class) {
        archiveClassifier.set("")
        configurations = listOf(project.configurations.findByName("shadow"))
    }
    jar {
        enabled = false
        finalizedBy("shadowJar")
    }
}