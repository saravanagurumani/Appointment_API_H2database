package com.springbtH2.SpringbtH2demo.Service;

import com.springbtH2.SpringbtH2demo.Model.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {

     List<Appointment> getAllAppointment();
     Optional<Appointment> getAppointById(Long appID);
     Appointment addAppointment(Appointment appointment);
     Appointment  updateAppointment(Appointment appointment);
     void deleteAppointmentById(Long id);
}
