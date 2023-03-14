plugins {
    `java`
    `maven-publish`
    `application`
}

repositories {
    mavenLocal()
}

dependencies {
    implementation("test.circdep:leaf:1.0")
    implementation(project(":lib"))
}

application {
    mainClass.set("Main")
}
