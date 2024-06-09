package com.studies.rabbit_mq.domain.payments.entity


data class Payments (
    val id: Long,
    val amount: Double,
    val userId: Long,
    val description: String
)