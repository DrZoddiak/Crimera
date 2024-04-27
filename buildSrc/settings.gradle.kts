dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libraries.versions.toml"))
        }
        create("toolchain") {
            from(files("../gradle/toolchain.versions.toml"))
        }
    }
}

