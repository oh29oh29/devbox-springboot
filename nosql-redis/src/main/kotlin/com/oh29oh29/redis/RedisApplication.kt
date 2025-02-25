package com.oh29oh29.redis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackages = ["com.oh29oh29.redis"]
)
class RedisApplication

fun main(args: Array<String>) {
    runApplication<RedisApplication>(*args)
}
