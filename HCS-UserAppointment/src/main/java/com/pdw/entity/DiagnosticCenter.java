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
@Table(name = "diagnostic_center")
public class DiagnosticCenter {
	@Id
	@Column(length=20)
	private String center_Id;
	private String center_Name;
	@OneToMany
	@JoinColumn(name ="tests_center")
	private List<Tests> list_Of_Tests = new ArrayList<Tests>();
	
	//private List<Appointment> appointmentList = new ArrayList<Appointment>();

	
public DiagnosticCenter () {
	
}

public String getCenter_Id() {
	return center_Id;
}

public void setCenter_Id(String center_Id) {
	this.center_Id = center_Id;
}

public String getCenter_Name() {
	return center_Name;
}

public void setCenter_Name(String center_Name) {
	this.center_Name = center_Name;
}

public List<Tests> getList_Of_Tests() {
	return list_Of_Tests;
}

public void setList_Of_Tests(List<Tests> list_Of_Tests) {
	this.list_Of_Tests = list_Of_Tests;
}

@Override
public String toString() {
	return "DiagnosticCenter [center_Id=" + center_Id + ", center_Name=" + center_Name + ", list_Of_Tests="
			+ list_Of_Tests + "]";
}
	

	
}

