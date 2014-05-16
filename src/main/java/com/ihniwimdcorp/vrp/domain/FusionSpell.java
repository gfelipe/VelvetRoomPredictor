package com.ihniwimdcorp.vrp.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="FUSION_SPELL")
public class FusionSpell {

	@Id
	@SequenceGenerator(name = "fusion_spell_id", sequenceName = "fusion_spell_id")
	@GeneratedValue(generator = "fusion_spell_id", strategy = GenerationType.AUTO)
	@Column(name = "CD_FUSION_SPELL")
	private Long id;
	
	@Column(name = "NM_NAME", nullable = false)
	private String name;
	
	@Column(name = "NM_DESCRIPTION", nullable = false)
	private String description;
	
	@OneToMany(mappedBy="fusionSpell")
	@Cascade({CascadeType.DELETE, CascadeType.SAVE_UPDATE})
	private List<Persona> persona;

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

	public List<Persona> getPersona() {
		return persona;
	}

	public void setPersona(List<Persona> persona) {
		this.persona = persona;
	}
	
}
