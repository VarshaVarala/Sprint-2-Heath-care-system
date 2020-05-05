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
@Table(name = "Appointment_table")
public class Appointment {
	@Id
	@GeneratedValue
	@Column(length=10)
	private Integer appointment_Id;
	@Column(length=20)
	private LocalDateTime date_Time_Slot;
	@Column(length=10)
	private boolean approved;
	@Column(length=10)
	private String user_Id;
	@OneToMany
	@JoinColumn(name = "t_Id")
	private List<Tests> test=new ArrayList<Tests>();
	@ManyToOne
	@JoinColumn(name = "d_Id")
	private DiagnosticCenter center;

	

	public Integer getAppointment_Id() {
		return appointment_Id;
	}



	public void setAppointment_Id(Integer appointment_Id) {
		this.appointment_Id = appointment_Id;
	}



	public LocalDateTime getDate_Time_Slot() {
		return date_Time_Slot;
	}



	public void setDate_Time_Slot(LocalDateTime date_Time_Slot) {
		this.date_Time_Slot = date_Time_Slot;
	}



	public boolean isApproved() {
		return approved;
	}



	public void setApproved(boolean approved) {
		this.approved = approved;
	}



	public String getUser_Id() {
		return user_Id;
	}



	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
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
		return "Appointment [appointment_Id=" + appointment_Id + ", date_Time_Slot=" + date_Time_Slot + ", approved="
				+ approved + ", user_Id=" + user_Id + ", test=" + test + ", center=" + center + "]";
	}



	public Appointment() {

}
}