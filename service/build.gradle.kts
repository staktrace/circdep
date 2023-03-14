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
    implementation("test.circdep:lib:1.0")
}

application {
    mainClass.set("Main")
}
