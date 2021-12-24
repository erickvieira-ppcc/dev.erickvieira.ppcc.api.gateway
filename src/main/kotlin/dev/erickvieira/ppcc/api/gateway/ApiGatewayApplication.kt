package dev.erickvieira.ppcc.api.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
open class ApiGatewayApplication {}

fun main(args: Array<String>) {
    SpringApplication.run(ApiGatewayApplication::class.java, *args)
}