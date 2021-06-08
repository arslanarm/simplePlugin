plugins {
    kotlin("jvm") version "1.4.32"
    id("org.jetbrains.intellij") version "1.0"
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(kotlin("stdlib"))
}

sourceSets["main"].java.srcDirs("src/main/gen")

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2021.1")
}

tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes.set("""Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa""")
}
tasks {
    compileKotlin {
        sourceCompatibility = "1.8"
        kotlinOptions.jvmTarget = "1.8"
    }
    compileJava {
        sourceCompatibility = "1.8"
        this.targetCompatibility = "1.8"

    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}