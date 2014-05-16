package com.ihniwimdcorp.vrp.dao;

import java.util.List;

import org.hibernate.criterion.Order;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ihniwimdcorp.vrp.domain.SkillCard;

public class SkillCardDao extends AbstractDao<SkillCard>{
	
	@Transactional(propagation=Propagation.REQUIRED)
	public SkillCard save(SkillCard skillCard) {
		return super.save(skillCard);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void delete(SkillCard skillCard) {
		super.delete(skillCard);
	}
	
	@Transactional(readOnly=true) 
	public SkillCard findById(Long id) {
		return super.findById(SkillCard.class, id);
	}
	
	@Transactional(readOnly=true)
	public List<SkillCard> findAll() {
		return super.findAll(SkillCard.class, Order.asc("name"));
	}

}
