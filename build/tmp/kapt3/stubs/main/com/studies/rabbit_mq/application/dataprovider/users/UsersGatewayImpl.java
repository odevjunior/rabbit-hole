package com.studies.rabbit_mq.application.dataprovider.users;

@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/studies/rabbit_mq/application/dataprovider/users/UsersGatewayImpl;", "Lcom/studies/rabbit_mq/domain/users/UsersGateway;", "usersRepository", "Lcom/studies/rabbit_mq/application/dataprovider/users/repository/UsersRepository;", "usersMapper", "Lcom/studies/rabbit_mq/application/dataprovider/users/repository/entity/mappers/UserMapper;", "(Lcom/studies/rabbit_mq/application/dataprovider/users/repository/UsersRepository;Lcom/studies/rabbit_mq/application/dataprovider/users/repository/entity/mappers/UserMapper;)V", "create", "", "user", "Lcom/studies/rabbit_mq/domain/payments/entity/Users;", "getUserById", "userId", "", "updateAmount", "", "amountPaid", "(DJ)Ljava/lang/Double;", "rabbit-mq"})
public class UsersGatewayImpl implements com.studies.rabbit_mq.domain.users.UsersGateway {
    @org.jetbrains.annotations.NotNull()
    private final com.studies.rabbit_mq.application.dataprovider.users.repository.UsersRepository usersRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers.UserMapper usersMapper = null;
    
    public UsersGatewayImpl(@org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.application.dataprovider.users.repository.UsersRepository usersRepository, @org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers.UserMapper usersMapper) {
        super();
    }
    
    @java.lang.Override()
    public void create(@org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.domain.payments.entity.Users user) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.studies.rabbit_mq.domain.payments.entity.Users getUserById(long userId) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Double updateAmount(double amountPaid, long userId) {
        return null;
    }
}