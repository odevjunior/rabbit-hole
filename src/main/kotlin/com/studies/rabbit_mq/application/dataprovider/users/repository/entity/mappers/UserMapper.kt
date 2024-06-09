package com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers

import com.studies.rabbit_mq.application.dataprovider.users.repository.entity.UsersEntity
import com.studies.rabbit_mq.domain.payments.entity.Users
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface UserMapper {
    fun toApplication(user: Users): UsersEntity

    fun toDomain(user: UsersEntity): Users
}