package com.ihniwimdcorp.vrp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="SKILL")
public class Skill {

	@Id
	@SequenceGenerator(name = "skill_id", sequenceName = "skill_id")
	@GeneratedValue(generator = "skill_id", strategy = GenerationType.AUTO)
	@Column(name = "CD_SKILL")
	private Long id;
	
	@Column(name = "NM_NAME", nullable = false)
	private String name;

	@Column(name = "NM_COST", nullable = false)
	private String cost;
	
	@Column(name = "NM_ELEMENT", nullable = false)
	private String element;
	
	@Column(name = "NM_LEVEL", nullable = false)
	private String level;
	
	@Column(name = "NM_DESCRIPTION", nullable = false)
	private String description;
	
	@ManyToOne
	@JoinColumn(name="CD_PERSONA", referencedColumnName="CD_PERSONA", nullable=false)
	@Cascade(CascadeType.SAVE_UPDATE)
	private Persona persona;

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

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
}
