package com.studies.rabbit_mq.domain.users.usecases

import com.google.gson.Gson
import com.rabbitmq.client.Delivery
import com.studies.rabbit_mq.application.dataprovider.payments.repository.entity.PaymentEntity
import com.studies.rabbit_mq.domain.payments.entity.Payments
import com.studies.rabbit_mq.domain.users.UsersGateway
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UpdateUserAmountUsecase(
    @Autowired private val usersGateway: UsersGateway
) {

    fun update(tag: String?, message: Delivery) {
        print(tag)
        val messagestr = String(message.getBody(), charset("UTF-8"))
        print(messagestr)
        val (id, amount, userId, description) = Regex("""PaymentEntity\(id=(\d+), amount=([\d.]+), userId=(\d+), description=(.*)\)""").find(messagestr)!!.destructured
        val payment = PaymentEntity(id.toLong(), amount.toDouble(), userId.toLong(), description)
        print(payment)
        usersGateway.updateAmount(payment.amount, payment.userId)
    }
}