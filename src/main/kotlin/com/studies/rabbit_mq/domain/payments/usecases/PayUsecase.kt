package com.studies.rabbit_mq.domain.payments.usecases

import com.studies.rabbit_mq.domain.payments.PaymentsGateway
import com.studies.rabbit_mq.domain.payments.entity.Payments
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PayUsecase(
    @Autowired private val paymentsGateway: PaymentsGateway
) {
    fun pay(payment: Payments) {
        paymentsGateway.create(payment)
    }

}