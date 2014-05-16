package com.ihniwimdcorp.vrp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STATUS")
public class Status {
	
	@Id
	@SequenceGenerator(name = "status_id", sequenceName = "status_id")
	@GeneratedValue(generator = "status_id", strategy = GenerationType.AUTO)
	@Column(name = "CD_STATUS")
	private Long id;
	
	@Column(name = "NR_STRENGTH", nullable = false)
	private Integer strength;

	@Column(name = "NR_MAGIC", nullable = false)
	private Integer magic;
	
	@Column(name = "NR_ENDURANCE", nullable = false)
	private Integer endurance;
	
	@Column(name = "NR_AGILITY", nullable = false)
	private Integer agility;
	
	@Column(name = "NR_LUCK", nullable = false)
	private Integer luck;
	
	@Column(name = "NM_SLASH", nullable = false)
	private String slash;
	
	@Column(name = "NM_STRIKE", nullable = false)
	private String strike;
	
	@Column(name = "NM_PIERCE", nullable = false)
	private String pierce;
	
	@Column(name = "NM_FIRE", nullable = false)
	private String fire;
	
	@Column(name = "NM_ICE", nullable = false)
	private String ice;
	
	@Column(name = "NM_ELECTRICTY", nullable = false)
	private String electricty;
	
	@Column(name = "NM_WIND", nullable = false)
	private String wind;
	
	@Column(name = "NM_LIGHT", nullable = false)
	private String light;
	
	@Column(name = "NM_DARK", nullable = false)
	private String dark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getMagic() {
		return magic;
	}

	public void setMagic(Integer magic) {
		this.magic = magic;
	}

	public Integer getEndurance() {
		return endurance;
	}

	public void setEndurance(Integer endurance) {
		this.endurance = endurance;
	}

	public Integer getAgility() {
		return agility;
	}

	public void setAgility(Integer agility) {
		this.agility = agility;
	}

	public Integer getLuck() {
		return luck;
	}

	public void setLuck(Integer luck) {
		this.luck = luck;
	}

	public String getSlash() {
		return slash;
	}

	public void setSlash(String slash) {
		this.slash = slash;
	}

	public String getStrike() {
		return strike;
	}

	public void setStrike(String strike) {
		this.strike = strike;
	}

	public String getPierce() {
		return pierce;
	}

	public void setPierce(String pierce) {
		this.pierce = pierce;
	}

	public String getFire() {
		return fire;
	}

	public void setFire(String fire) {
		this.fire = fire;
	}

	public String getIce() {
		return ice;
	}

	public void setIce(String ice) {
		this.ice = ice;
	}

	public String getElectricty() {
		return electricty;
	}

	public void setElectricty(String electricty) {
		this.electricty = electricty;
	}

	public String getWind() {
		return wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}

	public String getLight() {
		return light;
	}

	public void setLight(String light) {
		this.light = light;
	}

	public String getDark() {
		return dark;
	}

	public void setDark(String dark) {
		this.dark = dark;
	}

}
