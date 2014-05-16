package com.ihniwimdcorp.vrp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="GAME")
public class Game {

	@Id
	@SequenceGenerator(name = "game_id", sequenceName = "game_id")
	@GeneratedValue(generator = "game_id", strategy = GenerationType.AUTO)
	@Column(name = "CD_GAME")
	private Long id;
	
	@Column(name = "NM_NAME", nullable = false)
	private String name;

	@Column(name = "NM_PLATFORM", nullable = false)
	private String platform;

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

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}
