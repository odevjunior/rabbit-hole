package com.studies.rabbit_mq.application.dataprovider.payments;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/studies/rabbit_mq/application/dataprovider/payments/PaymentsGatewayImpl;", "Lcom/studies/rabbit_mq/domain/payments/PaymentsGateway;", "paymentsRepository", "Lcom/studies/rabbit_mq/application/dataprovider/payments/repository/PaymentsRepository;", "paymentMapper", "Lcom/studies/rabbit_mq/application/dataprovider/users/repository/entity/mappers/PaymentMapper;", "messageBroker", "Lcom/studies/rabbit_mq/application/dataprovider/config/rabbitmq/MessageBroker;", "(Lcom/studies/rabbit_mq/application/dataprovider/payments/repository/PaymentsRepository;Lcom/studies/rabbit_mq/application/dataprovider/users/repository/entity/mappers/PaymentMapper;Lcom/studies/rabbit_mq/application/dataprovider/config/rabbitmq/MessageBroker;)V", "create", "", "payment", "Lcom/studies/rabbit_mq/domain/payments/entity/Payments;", "getPaymentById", "paymentId", "", "send", "message", "", "rabbit-mq"})
public class PaymentsGatewayImpl implements com.studies.rabbit_mq.domain.payments.PaymentsGateway {
    @org.jetbrains.annotations.NotNull()
    private final com.studies.rabbit_mq.application.dataprovider.payments.repository.PaymentsRepository paymentsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers.PaymentMapper paymentMapper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.studies.rabbit_mq.application.dataprovider.config.rabbitmq.MessageBroker messageBroker = null;
    
    public PaymentsGatewayImpl(@org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.application.dataprovider.payments.repository.PaymentsRepository paymentsRepository, @org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers.PaymentMapper paymentMapper, @org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.application.dataprovider.config.rabbitmq.MessageBroker messageBroker) {
        super();
    }
    
    @java.lang.Override()
    public void create(@org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.domain.payments.entity.Payments payment) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.studies.rabbit_mq.domain.payments.entity.Payments getPaymentById(long paymentId) {
        return null;
    }
    
    private void send(java.lang.String message) {
    }
}