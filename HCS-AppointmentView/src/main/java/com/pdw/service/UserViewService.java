package com.pdw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdw.dao.AppointmentDaoI;
import com.pdw.dao.CenterDaoI;
import com.pdw.dao.TestDaoI;
import com.pdw.entity.Appointment;
import com.pdw.entity.DiagnosticCenter;

@Service
public class UserViewService implements UserViewServiceI {
	
	@Autowired
	AppointmentDaoI appointmentDao;
	
	@Override
	public List<Appointment> AppointmentList() {
		List<Appointment> appList=appointmentDao.findAll();
		return appList;
	}


}
