plugins {
    id("org.openjfx.javafxplugin") version "0.0.8"
}

java {
    version=JavaVersion.VERSION_14
    modularity.inferModulePath.set(true)
}

javafx {
    version = "14"
    modules("javafx.controls")
}
