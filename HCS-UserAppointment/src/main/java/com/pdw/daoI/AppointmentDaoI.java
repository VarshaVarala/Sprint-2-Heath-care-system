package com.pdw.daoI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdw.entity.Appointment;
import com.pdw.entity.DiagnosticCenter;

@Repository
public interface AppointmentDaoI extends JpaRepository<Appointment,String>{

}