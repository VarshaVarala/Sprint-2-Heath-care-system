package com.pdw.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "diagnostic_centre")
public class DiagnosticCenter {
	@Id
	@Column(length=20)
	private String centreId;
	private String centreName;
	@OneToMany
	@JoinColumn(name ="tests_center")
	private List<Tests> listOfTests = new ArrayList<Tests>();
	@OneToMany
	@JoinColumn(name ="appointment_center")
	private List<Appointment> appointmentList = new ArrayList<Appointment>();

	public String getCentreId() {
		return centreId;
	}

	public void setCentreId(String centreId) {
		this.centreId = centreId;
	}

	public String getCentreName() {
		return centreName;
	}

	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

	public List<Tests> getListOfTests() {
		return listOfTests;
	}

	public void setListOfTests(List<Tests> listOfTests) {
		this.listOfTests = listOfTests;
	}

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}
public DiagnosticCenter () {
	
}
	@Override
	public String toString() {
		return "DiagnosticCenter [centreId=" + centreId + ", centreName=" + centreName + ", listOfTests=" + listOfTests
				+ ", appointmentList=" + appointmentList + "]";
	}


	
}

