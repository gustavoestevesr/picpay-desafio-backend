package br.com.picpay.picpay_desafio_backend.wallet;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.math.BigDecimal;

@Table("transactions")
public record Transaction(
        @Id Long id,
        EnumPaymentStatus paymentStatus,
        EnumPaymentStatus paymentType,
        Long payer,
        Long payee,
        BigDecimal value,
        @CreatedDate LocalDateTime createdAt) {
    public Transaction {
        value = value.setScale(2);
    }
}
