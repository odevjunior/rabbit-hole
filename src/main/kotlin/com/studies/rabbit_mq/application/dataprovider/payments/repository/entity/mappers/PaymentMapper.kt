package com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers

import com.studies.rabbit_mq.application.dataprovider.payments.repository.entity.PaymentEntity
import com.studies.rabbit_mq.domain.payments.entity.Payments
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface PaymentMapper {
    fun toApplication(payment: Payments): PaymentEntity

    fun toDomain(payment: PaymentEntity): Payments
}