package com.ihniwimdcorp.vrp.domain.wrappers;

import java.util.List;

import com.ihniwimdcorp.vrp.domain.FusionSpell;
import com.ihniwimdcorp.vrp.domain.Game;
import com.ihniwimdcorp.vrp.domain.HeartItem;
import com.ihniwimdcorp.vrp.domain.Persona;
import com.ihniwimdcorp.vrp.domain.Skill;
import com.ihniwimdcorp.vrp.domain.SkillCard;
import com.ihniwimdcorp.vrp.domain.Status;

public class PersonaWrapper {
	
	private Persona persona;
	private Game game;
	private Status status;
	private FusionSpell fusionSpell;
	private HeartItem heartItem;
	private SkillCard skillCard;
	private List<Skill> skills;
	
	public PersonaWrapper() {}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public FusionSpell getFusionSpell() {
		return fusionSpell;
	}

	public void setFusionSpell(FusionSpell fusionSpell) {
		this.fusionSpell = fusionSpell;
	}

	public HeartItem getHeartItem() {
		return heartItem;
	}

	public void setHeartItem(HeartItem heartItem) {
		this.heartItem = heartItem;
	}

	public SkillCard getSkillCard() {
		return skillCard;
	}

	public void setSkillCard(SkillCard skillCard) {
		this.skillCard = skillCard;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
}
