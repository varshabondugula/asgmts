package com.WebservicesExample.beans;

import org.springframework.stereotype.Repository;

@Repository
public class Doctors {

	private String name;
	private String specialization;
	private String workplace;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getWorkplace() {
		return workplace;
	}
	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}
}
