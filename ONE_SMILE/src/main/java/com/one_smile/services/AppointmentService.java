package com.one_smile.services;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.one_smile.entity.Appointments;
import com.one_smile.repositiry.AppointmentRepository;

@Repository
public class AppointmentService {
	
	@Autowired
	private AppointmentRepository appservice;
	
	public Collection<Appointments> getallappointments(){
		
		Collection<Appointments> allpp= appservice.findAll();
		
		return allpp;	
	}
	
	public Appointments addappointmnets(Appointments app ) {
		
		return appservice.save(app);
	}
	
	public Appointments getOneAppointments(Integer id) {
		Appointments foundAppointments = null;
		Optional<Appointments> getOneAppointments = appservice.findById(id);
		if (!getOneAppointments.isEmpty())
			foundAppointments = getOneAppointments.get();
		return foundAppointments;
	}
	
	public Appointments updateAppointments(Appointments oldapp, Appointments newapp) {
		oldapp.setDate(newapp.getDate());
		oldapp.setTime(newapp.getTime());
		appservice.save(oldapp);
		return oldapp;
	}
	
	public void savestatus(Appointments newap) {
		appservice.save(newap);
		
	}

}
