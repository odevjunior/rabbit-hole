package com.studies.rabbit_mq.application.entrypoint

import com.studies.rabbit_mq.domain.payments.entity.Payments
import com.studies.rabbit_mq.domain.payments.usecases.PayUsecase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController("/payments")
class PaymentRestEntrypoint(
    @Autowired private val payUseCase: PayUsecase
) {

    @PostMapping("/pay")
    fun pay(@RequestBody payments: Payments): ResponseEntity<Unit> = ResponseEntity.ok(payUseCase.pay(payments))

}