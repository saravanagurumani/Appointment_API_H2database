package com.springbtH2.SpringbtH2demo.Service;

import com.springbtH2.SpringbtH2demo.Model.Appointment;
import com.springbtH2.SpringbtH2demo.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService{

   @Autowired
   AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }

    @Override
    public Optional<Appointment> getAppointById(Long appID) {
        return appointmentRepository.findById(appID);
    }

    @Override
    public Appointment addAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public void deleteAppointmentById(Long id) {
        appointmentRepository.deleteById(id);
    }
}
