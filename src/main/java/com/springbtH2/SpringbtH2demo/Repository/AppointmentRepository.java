package com.springbtH2.SpringbtH2demo.Repository;

import com.springbtH2.SpringbtH2demo.Model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
