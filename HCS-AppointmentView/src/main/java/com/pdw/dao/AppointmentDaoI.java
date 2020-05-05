package com.pdw.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdw.entity.Appointment;

public interface AppointmentDaoI extends JpaRepository<Appointment,String> {

}
