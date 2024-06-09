package com.studies.rabbit_mq.domain.payments

import com.studies.rabbit_mq.domain.payments.entity.Payments

interface PaymentsGateway {
    fun create(payment: Payments)
    fun getPaymentById(paymentId: Long): Payments?
}