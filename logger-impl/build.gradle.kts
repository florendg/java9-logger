plugins {
    `java-library`
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-api:2.24.3")
    runtimeOnly("org.apache.logging.log4j:log4j-core:2.24.3:")
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
    testImplementation("org.mockito:mockito-core:5.15.2")
}

java {
    version = JavaVersion.VERSION_23
    modularity.inferModulePath.set(true)
}

tasks {
    test {
        useJUnitPlatform()
    }
}

