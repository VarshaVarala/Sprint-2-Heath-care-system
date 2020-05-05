package com.pdw.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Appointments")
public class Appointment {
	@Id
	@GeneratedValue
	@Column(length=10)
	private Integer appointmentId;
	@Column(length=20)
	private LocalDateTime dateTimeSlot;
	@Column(length=10)
	private boolean approved;
	@Column(length=10)
	private String userId;
	@OneToMany
	@JoinColumn(name = "t_Id")
	private List<Tests> test=new ArrayList<Tests>();
	
	@ManyToOne
	@JoinColumn(name = "d_Id")
	private DiagnosticCenter center;

	

	
	public Integer getAppointmentId() {
		return appointmentId;
	}




	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}




	public LocalDateTime getDateTimeSlot() {
		return dateTimeSlot;
	}




	public void setDateTimeSlot(LocalDateTime dateTimeSlot) {
		this.dateTimeSlot = dateTimeSlot;
	}




	public boolean isApproved() {
		return approved;
	}




	public void setApproved(boolean approved) {
		this.approved = approved;
	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	public List<Tests> getTest() {
		return test;
	}




	public void setTest(List<Tests> test) {
		this.test = test;
	}




	public DiagnosticCenter getCenter() {
		return center;
	}




	public void setCenter(DiagnosticCenter center) {
		this.center = center;
	}




	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", dateTimeSlot=" + dateTimeSlot + ", approved="
				+ approved + ", userId=" + userId + ", test=" + test + ", center=" + center + "]";
	}




	public Appointment() {

}
}