plugins {
    kotlin("jvm")
}

group = "me.zodd"

repositories {
    mavenCentral()
}

val javaTarget = 8 // Sponge targets a minimum of Java 8
java {
    sourceCompatibility = JavaVersion.toVersion(javaTarget)
    targetCompatibility = JavaVersion.toVersion(javaTarget)
    if (JavaVersion.current() < JavaVersion.toVersion(javaTarget)) {
        toolchain.languageVersion.set(JavaLanguageVersion.of(javaTarget))
    }
}

kotlin {
    jvmToolchain(javaTarget)
}

tasks {
    compileJava.configure {
        options.apply {
            encoding = "utf-8" // Consistent source file encoding
            if (JavaVersion.current().isJava10Compatible) {
                release.set(javaTarget)
            }
        }
    }

    // Make sure all tasks which produce archives (jar, sources jar, javadoc jar, etc) produce more consistent output
    withType(AbstractArchiveTask::class).configureEach {
        isReproducibleFileOrder = true
        isPreserveFileTimestamps = false
    }
}

