package com.studies.rabbit_mq

import com.studies.rabbit_mq.application.entrypoint.UserEntrypoint
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class RabbitMqApplication

fun main(args: Array<String>) {
	runApplication<RabbitMqApplication>(*args)
}
