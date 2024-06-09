package com.studies.rabbit_mq.application.dataprovider.users.repository.entity.mappers;

import com.studies.rabbit_mq.application.dataprovider.payments.repository.entity.PaymentEntity;
import com.studies.rabbit_mq.domain.payments.entity.Payments;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-09T02:54:34-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.9.24.jar, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public PaymentEntity toApplication(Payments payment) {
        if ( payment == null ) {
            return null;
        }

        long id = 0L;
        double amount = 0.0d;
        long userId = 0L;
        String description = null;

        id = payment.getId();
        amount = payment.getAmount();
        userId = payment.getUserId();
        description = payment.getDescription();

        PaymentEntity paymentEntity = new PaymentEntity( id, amount, userId, description );

        return paymentEntity;
    }

    @Override
    public Payments toDomain(PaymentEntity payment) {
        if ( payment == null ) {
            return null;
        }

        long id = 0L;
        double amount = 0.0d;
        long userId = 0L;
        String description = null;

        id = payment.getId();
        amount = payment.getAmount();
        userId = payment.getUserId();
        description = payment.getDescription();

        Payments payments = new Payments( id, amount, userId, description );

        return payments;
    }
}
