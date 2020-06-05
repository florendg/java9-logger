plugins {
    `java-library`
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-api:2.13.3")
    runtimeOnly("org.apache.logging.log4j:log4j-core:2.13.3:")
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    testImplementation("org.mockito:mockito-core:3.3.3")
}

java {
    version = JavaVersion.VERSION_14
    modularity.inferModulePath.set(true)
}

tasks {
    test {
        useJUnitPlatform()
    }
}

