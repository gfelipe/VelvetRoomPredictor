package com.ihniwimdcorp.vrp.dao;

import java.util.List;

import org.hibernate.criterion.Order;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ihniwimdcorp.vrp.domain.Arcana;

public class ArcanaDao extends AbstractDao<Arcana>{
	
	@Transactional(propagation=Propagation.REQUIRED)
	public Arcana save(Arcana arcana) {
		return super.save(arcana);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(Arcana arcana) {
		super.delete(arcana);
	}
	
	@Transactional(readOnly=true) 
	public Arcana findById(Long id) {
		return super.findById(Arcana.class, id);
	}
	
	@Transactional(readOnly=true)
	public List<Arcana> findAll() {
		return super.findAll(Arcana.class, Order.asc("id"));
	}

}
