package com.studies.rabbit_mq.application.entrypoint;

@org.springframework.web.bind.annotation.RestController(value = "/payments")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/studies/rabbit_mq/application/entrypoint/PaymentRestEntrypoint;", "", "payUseCase", "Lcom/studies/rabbit_mq/domain/payments/usecases/PayUsecase;", "(Lcom/studies/rabbit_mq/domain/payments/usecases/PayUsecase;)V", "pay", "Lorg/springframework/http/ResponseEntity;", "", "payments", "Lcom/studies/rabbit_mq/domain/payments/entity/Payments;", "rabbit-mq"})
public class PaymentRestEntrypoint {
    @org.jetbrains.annotations.NotNull()
    private final com.studies.rabbit_mq.domain.payments.usecases.PayUsecase payUseCase = null;
    
    public PaymentRestEntrypoint(@org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.domain.payments.usecases.PayUsecase payUseCase) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/pay"})
    @org.jetbrains.annotations.NotNull()
    public org.springframework.http.ResponseEntity<kotlin.Unit> pay(@org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.domain.payments.entity.Payments payments) {
        return null;
    }
}