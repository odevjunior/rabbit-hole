package com.studies.rabbit_mq.application.dataprovider.payments.repository

import com.studies.rabbit_mq.application.dataprovider.payments.repository.entity.PaymentEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PaymentsRepository: JpaRepository<PaymentEntity, Long>