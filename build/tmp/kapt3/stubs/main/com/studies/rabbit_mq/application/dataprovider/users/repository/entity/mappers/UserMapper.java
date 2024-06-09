package com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/studies/rabbit_mq/application/dataprovider/users/repository/entity/mappers/UserMapper;", "", "toApplication", "Lcom/studies/rabbit_mq/application/dataprovider/users/repository/entity/UsersEntity;", "user", "Lcom/studies/rabbit_mq/domain/payments/entity/Users;", "toDomain", "rabbit-mq"})
@org.mapstruct.Mapper(componentModel = "spring", injectionStrategy = org.mapstruct.InjectionStrategy.CONSTRUCTOR)
public abstract interface UserMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.studies.rabbit_mq.application.dataprovider.users.repository.entity.UsersEntity toApplication(@org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.domain.payments.entity.Users user);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.studies.rabbit_mq.domain.payments.entity.Users toDomain(@org.jetbrains.annotations.NotNull()
    com.studies.rabbit_mq.application.dataprovider.users.repository.entity.UsersEntity user);
}