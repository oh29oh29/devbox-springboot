package com.oh29oh29.jpa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackages = ["com.oh29oh29.jpa"]
)
class JpaApplication

fun main(args: Array<String>) {
    runApplication<JpaApplication>(*args)
}
