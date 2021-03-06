package com.pdw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdw.entity.Appointment;
import com.pdw.service.UserViewServiceI;

@RestController
@RequestMapping("/User")
@CrossOrigin("http://localhost:4200")
public class ViewAppointmentController {
	
	@Autowired    // service interface object
	UserViewServiceI userAppointmnetS;
	
	 @GetMapping("/FetchAppList") // displaying all values in appointment table
	   public List<Appointment> getCenterList(){
		   List<Appointment> center=userAppointmnetS.AppointmentList();
		   return center; 
	   }

}
