package com.studies.rabbit_mq.application.dataprovider.payments.repository.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class PaymentEntity (
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long,
    val amount: Double,
    val userId: Long,
    val description: String
)