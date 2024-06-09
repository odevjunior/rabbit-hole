plugins {
	id("org.springframework.boot") version "3.3.0"
	id("io.spring.dependency-management") version "1.1.5"
	kotlin("plugin.jpa") version "1.9.24"
	kotlin("jvm") version "1.9.24"
	kotlin("plugin.spring") version "1.9.24"
	id("org.jetbrains.kotlin.kapt") version "1.9.23"
}

group = "com.studies"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("com.rabbitmq:amqp-client:5.21.0")
	implementation("org.mapstruct:mapstruct:1.5.5.Final")
	implementation("com.google.code.gson:gson:2.10.1")

	implementation("com.h2database:h2:2.1.210")
	runtimeOnly("com.mysql:mysql-connector-j")

	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	testImplementation("io.mockk:mockk:1.13.11")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")

	annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")

	kapt("org.mapstruct:mapstruct-processor:1.5.5.Final")
}



kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
