package com.studies.rabbit_mq.domain.users

import com.studies.rabbit_mq.domain.payments.entity.Users

interface UsersGateway {
    fun create(user: Users)
    fun getUserById(userId: Long): Users?
    fun updateAmount(amountPaid: Double, userId: Long): Double?
}