package com.pdw.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tests")
public class Tests implements Serializable {
	@Id 
	@Column(length=20)
	private String test_Id;
	@Column(length=20)
	private String test_Name;
	
	public Tests() {
		}

	public String getTest_Id() {
		return test_Id;
	}

	public void setTest_Id(String test_Id) {
		this.test_Id = test_Id;
	}

	public String getTest_Name() {
		return test_Name;
	}

	public void setTest_Name(String test_Name) {
		this.test_Name = test_Name;
	}

	@Override
	public String toString() {
		return "Tests [test_Id=" + test_Id + ", test_Name=" + test_Name + "]";
	}



}
