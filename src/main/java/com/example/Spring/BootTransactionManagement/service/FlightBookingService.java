package com.example.Spring.BootTransactionManagement.service;

import com.example.Spring.BootTransactionManagement.dto.FlightBookingAcknowledgement;
import com.example.Spring.BootTransactionManagement.dto.FlightBookingRequest;
import com.example.Spring.BootTransactionManagement.entity.Passengerinfo;
import com.example.Spring.BootTransactionManagement.entity.PaymentInfo;
import com.example.Spring.BootTransactionManagement.exception.InsufficientAmountException;
import com.example.Spring.BootTransactionManagement.repository.PassengerInfoRepository;
import com.example.Spring.BootTransactionManagement.repository.PaymentInfoRepository;
import com.example.Spring.BootTransactionManagement.utils.PaymentUtils;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;
    @Transactional
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) throws InsufficientAmountException {
        Passengerinfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentinfo=request.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentinfo.getAccountNo(), passengerInfo.getFare());
        paymentinfo.setPassengerId(passengerInfo.getId());
        paymentinfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentinfo);
        return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);


    }
        ;
    }

