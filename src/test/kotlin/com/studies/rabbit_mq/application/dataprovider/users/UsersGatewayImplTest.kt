package com.studies.rabbit_mq.application.dataprovider.users

import com.studies.rabbit_mq.application.dataprovider.users.repository.UsersRepository
import com.studies.rabbit_mq.application.dataprovider.users.repository.entity.UsersEntity
import com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers.PaymentMapper
import com.studies.rabbit_mq.domain.payments.entity.Users
import io.mockk.*
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.stereotype.Service
import java.util.*

@Service
class UsersGatewayImplTest {

    @MockK
    private lateinit var usersRepository: UsersRepository

    @MockK
    private lateinit var userMapper: PaymentMapper

    @InjectMockKs
    private lateinit var target: UsersGatewayImpl

    private lateinit var sampleUser: Users;
    private lateinit var sampleEntityUser: UsersEntity;

    @BeforeEach
    fun setup() {
        sampleUser = Users(1L, "sample", "sample@gmail.com", 100.00);
        sampleEntityUser = UsersEntity(1L, "sample", "sample@gmail.com", 100.00);
        MockKAnnotations.init(this);
    }

    @Test
    fun `given an user then create it`() {
        every { usersRepository.save(any()) } returns sampleEntityUser
        every { userMapper.toApplication(eq(sampleUser)) } returns sampleEntityUser

        target.create(sampleUser)

        verify { usersRepository.save(any()) }
    }

    @Test
    fun `given an user_id then bring it`() {
        every { usersRepository.findById(any()) } returns Optional.of(sampleEntityUser)
        every { userMapper.toDomain(eq(sampleEntityUser)) } returns sampleUser

        val actual = target.getUserById(sampleUser.id)

        verify { usersRepository.findById(any()) }
        assertEquals(sampleUser, actual)
    }
}