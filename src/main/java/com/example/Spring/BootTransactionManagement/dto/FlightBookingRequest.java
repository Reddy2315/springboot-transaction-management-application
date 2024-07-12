package com.example.Spring.BootTransactionManagement.dto;

import com.example.Spring.BootTransactionManagement.entity.Passengerinfo;
import com.example.Spring.BootTransactionManagement.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    public Passengerinfo passengerInfo;
    public PaymentInfo paymentInfo;
}
