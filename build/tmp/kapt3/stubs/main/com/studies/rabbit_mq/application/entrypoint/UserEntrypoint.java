package com.studies.rabbit_mq.application.entrypoint;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/studies/rabbit_mq/application/entrypoint/UserEntrypoint;", "", "messageBroker", "Lcom/studies/rabbit_mq/application/dataprovider/config/rabbitmq/MessageBroker;", "updateUserAmountUsecase", "Lcom/studies/rabbit_mq/domain/users/usecases/UpdateUserAmountUsecase;", "(Lcom/studies/rabbit_mq/application/dataprovider/config/rabbitmq/MessageBroker;Lcom/studies/rabbit_mq/domain/users/usecases/UpdateUserAmountUsecase;)V", "receive", "", "rabbit-mq"})
public class UserEntrypoint {
    @org.jetbrains.annotations.NotNull()
    private final com.studies.rabbit_mq.application.dataprovider.config.rabbitmq.MessageBroker messageBroker = null;
    @org.jetbrains.annotations.NotNull()
    private final com.studies.rabbit_mq.domain.users.usecases.UpdateUserAmountUsecase updateUserAmountUsecase = null;
    
    public UserEntrypoint(@org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.application.dataprovider.config.rabbitmq.MessageBroker messageBroker, @org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.domain.users.usecases.UpdateUserAmountUsecase updateUserAmountUsecase) {
        super();
    }
    
    @org.springframework.context.annotation.Bean()
    public void receive() {
    }
}