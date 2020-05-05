package com.pdw.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pdw.entity.Appointments;
import com.pdw.service.UserViewServiceI;

@RestController
@RequestMapping("/User")
@CrossOrigin("http://localhost:4200")
public class ViewAppointmentController {
	
	UserViewServiceI userAppointmnetS;
	
	 @GetMapping("/FetchAppList")
	   public List<Appointments> getCenterList(){
		   List<Appointments> center=userAppointmnetS.AppointmentList();
		   return center; 
	   }

}
