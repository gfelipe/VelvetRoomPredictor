package com.ihniwimdcorp.vrp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="SKILL_CARD")
public class SkillCard {

	@Id
	@SequenceGenerator(name = "skill_card_id", sequenceName = "skill_card_id")
	@GeneratedValue(generator = "skill_card_id", strategy = GenerationType.AUTO)
	@Column(name = "CD_SKILL_CARD")
	private Long id;
	
	@Column(name = "NM_NAME", nullable = false)
	private String name;

	@Column(name = "NM_DESCRIPTION", nullable = false)
	private String description;
	
	@OneToOne
	@JoinColumn(name = "CD_SKILL", referencedColumnName = "CD_SKILL", nullable = false)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Skill skill;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
}
