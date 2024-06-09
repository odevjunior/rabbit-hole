package com.studies.rabbit_mq.application.dataprovider.users.repository

import com.studies.rabbit_mq.application.dataprovider.payments.repository.entity.PaymentEntity
import com.studies.rabbit_mq.application.dataprovider.users.repository.entity.UsersEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepository: JpaRepository<UsersEntity, Long>