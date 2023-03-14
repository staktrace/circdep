plugins {
    `java`
    `maven-publish`
}

dependencies {
    implementation(project(":leaf"))
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "test.circdep"
            artifactId = "lib"
            version = "1.0"
            from(components["java"])
        }
    }
}
