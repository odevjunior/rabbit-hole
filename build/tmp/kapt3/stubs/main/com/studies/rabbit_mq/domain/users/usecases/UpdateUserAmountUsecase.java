package com.studies.rabbit_mq.domain.users.usecases;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/studies/rabbit_mq/domain/users/usecases/UpdateUserAmountUsecase;", "", "usersGateway", "Lcom/studies/rabbit_mq/domain/users/UsersGateway;", "(Lcom/studies/rabbit_mq/domain/users/UsersGateway;)V", "update", "", "tag", "", "message", "Lcom/rabbitmq/client/Delivery;", "rabbit-mq"})
public class UpdateUserAmountUsecase {
    @org.jetbrains.annotations.NotNull()
    private final com.studies.rabbit_mq.domain.users.UsersGateway usersGateway = null;
    
    public UpdateUserAmountUsecase(@org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.domain.users.UsersGateway usersGateway) {
        super();
    }
    
    public void update(@org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    com.rabbitmq.client.Delivery message) {
    }
}