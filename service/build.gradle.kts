plugins {
    `java`
    `maven-publish`
    `application`
}

repositories {
    mavenLocal()
}

dependencies {
    implementation("test.circdep:lib:1.0")
    implementation(project(":lib"))
}

application {
    mainClass.set("Main")
}
