package com.example.Spring.BootTransactionManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "paymentinfo")
public class PaymentInfo {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy = "org.hibernate.id.UUIDGenerator")
    public String paymentId;
    public String accountNo;
    public double amount;
    public String cardType;
    public Long passengerId;
}
