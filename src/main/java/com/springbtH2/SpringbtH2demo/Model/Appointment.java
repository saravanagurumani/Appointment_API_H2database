package com.springbtH2.SpringbtH2demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.util.Date;


@Entity
public class Appointment {

    @Id
    private Long id;
    private String customerName;
    private String serviceType;
    private Date appointmentDate;

    public Appointment() {
    }

    public Appointment(Long id, String customerName, String serviceType, Date appointmentDate) {
        this.id = id;
        this.customerName = customerName;
        this.serviceType = serviceType;
        this.appointmentDate = appointmentDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}
