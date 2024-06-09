package com.studies.rabbit_mq.domain.payments.usecases;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/studies/rabbit_mq/domain/payments/usecases/PayUsecase;", "", "paymentsGateway", "Lcom/studies/rabbit_mq/domain/payments/PaymentsGateway;", "(Lcom/studies/rabbit_mq/domain/payments/PaymentsGateway;)V", "pay", "", "payment", "Lcom/studies/rabbit_mq/domain/payments/entity/Payments;", "rabbit-mq"})
public class PayUsecase {
    @org.jetbrains.annotations.NotNull()
    private final com.studies.rabbit_mq.domain.payments.PaymentsGateway paymentsGateway = null;
    
    public PayUsecase(@org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.domain.payments.PaymentsGateway paymentsGateway) {
        super();
    }
    
    public void pay(@org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.domain.payments.entity.Payments payment) {
    }
}