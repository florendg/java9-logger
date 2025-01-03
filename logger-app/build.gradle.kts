plugins {
    application
    id("org.openjfx.javafxplugin") version "0.0.13"
}

java {
    version=JavaVersion.VERSION_23
    modularity.inferModulePath.set(true)
}

dependencies {
    runtimeOnly(project(":logger-impl"))
}

application {
    mainModule.set("dev.weirdduke.logger.app")
    mainClass.set("dev.weirdduke.logger.app.Main")
}

javafx {
    version = "23"
    modules("javafx.controls")
}
