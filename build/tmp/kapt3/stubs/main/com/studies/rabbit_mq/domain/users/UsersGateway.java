package com.studies.rabbit_mq.domain.users;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u001f\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/studies/rabbit_mq/domain/users/UsersGateway;", "", "create", "", "user", "Lcom/studies/rabbit_mq/domain/payments/entity/Users;", "getUserById", "userId", "", "updateAmount", "", "amountPaid", "(DJ)Ljava/lang/Double;", "rabbit-mq"})
public abstract interface UsersGateway {
    
    public abstract void create(@org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.domain.payments.entity.Users user);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.studies.rabbit_mq.domain.payments.entity.Users getUserById(long userId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Double updateAmount(double amountPaid, long userId);
}