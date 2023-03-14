plugins {
    `java`
    `maven-publish`
    `application`
}

repositories {
    mavenLocal()
}

dependencies {
    implementation(project(":lib"))
}

application {
    mainClass.set("Main")
}
