package com.springbtH2.SpringbtH2demo.Controller;

import com.springbtH2.SpringbtH2demo.Model.Appointment;
import com.springbtH2.SpringbtH2demo.Service.AppointmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @Autowired
    AppointmentServiceImpl appointmentService;

    @GetMapping()
    public List<Appointment> getallappointment(){
        return appointmentService.getAllAppointment();
    }

    @GetMapping("/{appid}")
    public Optional<Appointment> getappointmentbyid(@PathVariable Long appid){
        return appointmentService.getAppointById(appid);
    }

    @PostMapping("/add")
    public Appointment addappointment(@RequestBody Appointment appointment){
        return appointmentService.addAppointment(appointment);
    }

    @PutMapping("/update")
    public Appointment updateappointment(@RequestBody Appointment appointment){
        return appointmentService.updateAppointment(appointment);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteappointment(@PathVariable Long id){
        appointmentService.deleteAppointmentById(id);
        return "Deleted successfully...";
    }
}
