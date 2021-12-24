rootProject.name = "api-gateway"

pluginManagement {
    val dependencyManagementVersion: String by settings
    val springBootVersion: String by settings
    plugins {
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version dependencyManagementVersion
    }
}
