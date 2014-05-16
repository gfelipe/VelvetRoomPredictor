package com.ihniwimdcorp.vrp.domain.wrappers;

import com.ihniwimdcorp.vrp.domain.Skill;
import com.ihniwimdcorp.vrp.domain.SkillCard;

public class SkillCardWrapper {

	private SkillCard skillCard;
	private Skill skill;
	
	public SkillCardWrapper(SkillCard skillCard, Skill skill) {
		this.skillCard = skillCard;
		this.skill = skill;
	}

	public SkillCardWrapper() {	}
	
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	public Skill getSkill() {
		return skill;
	}
	
	public void setSkillCard(SkillCard skillCard) {
		this.skillCard = skillCard;
	}
	
	public SkillCard getSkillCard() {
		return skillCard;
	}
	
}
