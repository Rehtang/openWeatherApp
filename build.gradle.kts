import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

group = "ru.rehtang"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.springframework.boot:spring-boot-starter-web:2.7.3")
    implementation("org.springframework.cloud:spring-cloud-starter-openfeign:3.1.3")
    implementation("org.springdoc:springdoc-openapi-ui:1.6.10")
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor ("org.projectlombok:lombok:1.18.24")
    testImplementation("org.springframework.boot:spring-boot-starter-test:2.7.3")

}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}