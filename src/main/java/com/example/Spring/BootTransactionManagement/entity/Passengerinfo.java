package com.example.Spring.BootTransactionManagement.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "passengerinfo")
public class Passengerinfo {
    @Id
    public Long id;
    public String name;
    public String email;
    public String source;
    public String destination;
    @JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    public Date travelDate;
    public String pickupTime;
    public String arrivalTime;
    public Double fare;

}
