package com.example.Spring.BootTransactionManagement.repository;

import com.example.Spring.BootTransactionManagement.entity.Passengerinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<Passengerinfo,Long> {
}
