package com.ihniwimdcorp.vrp.dao;

import java.util.List;

import org.hibernate.criterion.Order;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ihniwimdcorp.vrp.domain.Persona;

public class PersonaDao extends AbstractDao<Persona>{
	
	@Transactional(propagation=Propagation.REQUIRED)
	public Persona save(Persona persona) {
		return super.save(persona);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(Persona persona) {
		super.delete(persona);
	}
	
	@Transactional(readOnly=true) 
	public Persona findById(Long id) {
		return super.findById(Persona.class, id);
	}
	
	@Transactional(readOnly=true)
	public List<Persona> findAll() {
		return super.findAll(Persona.class, Order.asc("id"));
	}

}
