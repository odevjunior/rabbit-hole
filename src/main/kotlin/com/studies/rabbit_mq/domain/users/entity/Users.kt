package com.studies.rabbit_mq.domain.payments.entity


data class Users (
    val id: Long,
    val name: String,
    val email: String,
    val amount: Double
)