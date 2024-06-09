package com.studies.rabbit_mq.application.dataprovider.users.repository.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class UsersEntity (
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long,
    val name: String,
    val email: String,
    var amount: Double
)