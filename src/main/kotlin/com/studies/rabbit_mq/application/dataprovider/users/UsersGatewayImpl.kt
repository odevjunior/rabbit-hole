package com.studies.rabbit_mq.application.dataprovider.users

import com.studies.rabbit_mq.application.dataprovider.users.repository.UsersRepository
import com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers.PaymentMapper
import com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers.UserMapper
import com.studies.rabbit_mq.domain.payments.entity.Users
import com.studies.rabbit_mq.domain.users.UsersGateway
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsersGatewayImpl(
    @Autowired private val usersRepository: UsersRepository,
    @Autowired private val usersMapper: UserMapper
): UsersGateway {
    override fun create(user: Users) {
        try {
            usersRepository.save(usersMapper.toApplication(user));
        } catch (e: Throwable) {
            print(e.message)
        }
    }

    override fun getUserById(userId: Long): Users? =
        try {
            usersRepository.findById(userId).orElseThrow().let { usersMapper.toDomain(it) };
        } catch (e: Throwable) {
            print(e.message)
            null
        }

    override fun updateAmount(amountPaid: Double, userId: Long): Double? =
        try {
            val user = usersRepository.findById(userId).orElseThrow()
            user.amount -= amountPaid
            usersRepository.save(user)
            user.amount
        } catch (e: Throwable) {
            print(e.message)
            null
        }

}