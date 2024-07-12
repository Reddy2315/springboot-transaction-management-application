package com.example.Spring.BootTransactionManagement.dto;

import com.example.Spring.BootTransactionManagement.entity.Passengerinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {
    public String status;
    public double totalFare;
    public String pnrNo;
    public Passengerinfo passengerInfo;
}
