plugins {
    `java`
    `maven-publish`
    `application`
}

dependencies {
    implementation(project(":lib"))
}

application {
    mainClass.set("Main")
}
