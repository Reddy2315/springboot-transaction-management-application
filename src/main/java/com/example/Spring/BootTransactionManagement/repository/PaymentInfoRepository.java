package com.example.Spring.BootTransactionManagement.repository;

import com.example.Spring.BootTransactionManagement.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, Integer>{
}
