package com.example.Spring.BootTransactionManagement.controller;

import com.example.Spring.BootTransactionManagement.dto.FlightBookingAcknowledgement;
import com.example.Spring.BootTransactionManagement.dto.FlightBookingRequest;
import com.example.Spring.BootTransactionManagement.exception.InsufficientAmountException;
import com.example.Spring.BootTransactionManagement.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SharathAir")
public class FlightBookingController {
    @Autowired
    private FlightBookingService service;
    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) throws InsufficientAmountException {

        return service.bookFlightTicket(request);
    }
}
