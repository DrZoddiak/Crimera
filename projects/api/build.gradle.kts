plugins {
    common
    shadow
}

version = "1.0-SNAPSHOT"

dependencies {
    compileOnly(libs.sponge8)
    compileOnly(libs.kyori)
    shadow(libs.commanddsl) {
        isTransitive = false
    }
}

