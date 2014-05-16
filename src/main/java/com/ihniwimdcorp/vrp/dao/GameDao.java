package com.ihniwimdcorp.vrp.dao;

import java.util.List;

import org.hibernate.criterion.Order;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ihniwimdcorp.vrp.domain.Game;

public class GameDao extends AbstractDao<Game>{
	
	@Transactional(propagation=Propagation.REQUIRED)
	public Game save(Game game) {
		return super.save(game);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(Game game) {
		super.delete(game);
	}
	
	@Transactional(readOnly=true) 
	public Game findById(Long id) {
		return super.findById(Game.class, id);
	}
	
	@Transactional(readOnly=true)
	public List<Game> findAll() {
		return super.findAll(Game.class, Order.asc("name"));
	}

}
