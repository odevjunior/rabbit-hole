package com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers;

import com.studies.rabbit_mq.application.dataprovider.users.repository.entity.UsersEntity;
import com.studies.rabbit_mq.domain.payments.entity.Users;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-09T02:54:34-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.9.24.jar, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UsersEntity toApplication(Users user) {
        if ( user == null ) {
            return null;
        }

        double amount = 0.0d;
        long id = 0L;
        String name = null;
        String email = null;

        amount = user.getAmount();
        id = user.getId();
        name = user.getName();
        email = user.getEmail();

        UsersEntity usersEntity = new UsersEntity( id, name, email, amount );

        return usersEntity;
    }

    @Override
    public Users toDomain(UsersEntity user) {
        if ( user == null ) {
            return null;
        }

        long id = 0L;
        String name = null;
        String email = null;
        double amount = 0.0d;

        id = user.getId();
        name = user.getName();
        email = user.getEmail();
        amount = user.getAmount();

        Users users = new Users( id, name, email, amount );

        return users;
    }
}
