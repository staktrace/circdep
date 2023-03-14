plugins {
    `java`
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "test.circdep"
            artifactId = "leaf"
            version = "1.0"
            from(components["java"])
        }
    }
}
