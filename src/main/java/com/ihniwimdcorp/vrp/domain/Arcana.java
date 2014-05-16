package com.ihniwimdcorp.vrp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ARCANA")
public class Arcana {

	@Id
	@SequenceGenerator(name = "arcana_id", sequenceName = "arcana_id")
	@GeneratedValue(generator = "arcana_id", strategy = GenerationType.AUTO)
	@Column(name = "CD_ARCANA")
	private Long id;
	
	@Column(name = "NM_NAME", nullable = false)
	private String name;

	@Column(name = "NM_VALUE", nullable = false)
	private String value;

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
