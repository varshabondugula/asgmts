package com.WebservicesExample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WebservicesExample.beans.Doctors;

@RestController
public class DoctorsResource {

	@Autowired
	Doctors doctor1;
	@Autowired
	Doctors doctor2;
	@RequestMapping("retriveDoctorList")
	public List<Doctors> getDoctorNames(){
		
		List<Doctors> list=new ArrayList<>();
		
		doctor1.setName("varsha");
		doctor1.setSpecialization("children specialist");
		doctor1.setWorkplace("norman health center");
		
		doctor2.setName("naveen");
		doctor2.setSpecialization("heart specialist");
		doctor2.setWorkplace("frisco health center");
		
		list.add(doctor1);
		list.add(doctor2);
		
		return list;
	}
}
