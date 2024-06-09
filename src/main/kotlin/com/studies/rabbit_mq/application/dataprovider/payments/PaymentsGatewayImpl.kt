package com.studies.rabbit_mq.application.dataprovider.payments

import com.rabbitmq.client.Channel
import com.studies.rabbit_mq.application.dataprovider.config.rabbitmq.MessageBroker
import com.studies.rabbit_mq.application.dataprovider.payments.repository.PaymentsRepository
import com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers.PaymentMapper
import com.studies.rabbit_mq.domain.payments.PaymentsGateway
import com.studies.rabbit_mq.domain.payments.entity.Payments
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PaymentsGatewayImpl(
    @Autowired private val paymentsRepository: PaymentsRepository,
    @Autowired private val paymentMapper: PaymentMapper,
    @Autowired private val messageBroker: MessageBroker
): PaymentsGateway {
    override fun create(payment: Payments) {
        try {
            messageBroker.queueName = "payment"
            send(paymentsRepository.save(paymentMapper.toApplication(payment)).toString())
        } catch (ex: Throwable) {
            print(ex.message)
        }
    }

    override fun getPaymentById(paymentId: Long): Payments? =
        try {
            paymentsRepository.findById(paymentId).orElseThrow().let { paymentMapper.toDomain(it) }
        } catch (ex: Throwable) {
            print(ex.message)
            null
        }

    private fun send(message: String) {
        val channel: Channel = messageBroker.createChannel(messageBroker.createConnection())
        messageBroker.sendMessage(channel, message)
    }
}