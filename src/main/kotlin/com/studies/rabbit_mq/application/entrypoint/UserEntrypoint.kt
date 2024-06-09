package com.studies.rabbit_mq.application.entrypoint

import com.rabbitmq.client.Delivery
import com.studies.rabbit_mq.application.dataprovider.config.rabbitmq.MessageBroker
import com.studies.rabbit_mq.domain.users.usecases.UpdateUserAmountUsecase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service

@Service
class UserEntrypoint(
    @Autowired private val messageBroker: MessageBroker,
    @Autowired private val updateUserAmountUsecase: UpdateUserAmountUsecase
) {
    @Bean
    fun receive() {
        val channel = messageBroker.createChannel(messageBroker.createConnection())
        messageBroker.queueName = "payment"
        messageBroker.listen(
            channel,
            { tag: String?, message: Delivery -> updateUserAmountUsecase.update(tag, message) }
        )
    }

}