package com.studies.rabbit_mq.application.dataprovider.config.rabbitmq

import com.rabbitmq.client.*
import org.springframework.stereotype.Service

@Service
class MessageBroker {

    var queueName: String = "test"

    fun createConnection(): Connection = ConnectionFactory()
        .let {
            it.host = "localhost"
            it.newConnection()
        }

    fun createChannel(connection: Connection): Channel = connection.createChannel()

    fun sendMessage(channel: Channel, message: String) {
        channel.queueDeclare(queueName, false, false, false, null)
        channel.basicPublish("", queueName, null, message.toByteArray())
    }

    fun listen(channel: Channel, callback: (consumerTag: String?, delivery: Delivery) -> (Any)) {
        channel.queueDeclare(queueName, false, false, false, null)
        val deliverCallback = DeliverCallback { consumerTag: String?, delivery: Delivery -> callback(consumerTag, delivery)}
        channel.basicConsume(queueName, true, deliverCallback) { consumerTag -> print(consumerTag) }
    }
}