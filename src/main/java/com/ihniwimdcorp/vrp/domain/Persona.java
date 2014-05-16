package com.ihniwimdcorp.vrp.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "PERSONA")
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "persona_id", sequenceName = "persona_id")
	@GeneratedValue(generator = "persona_id", strategy = GenerationType.AUTO)
	@Column(name = "CD_PERSONA")
	private Long id;
	
	@Column(name = "NM_NOME", nullable = false)
	private String name;

	@Column(name = "NR_LEVEL", nullable = false)
	private String level;
	
	@Column(name = "NM_INHERIT", nullable = false)
	private String inherit;

	@Column(name = "NM_HISTORY")
	private String history;

	@Column(name = "NM_DESCRIPTION")
	private String desciption;
	
	@OneToOne
	@JoinColumn(name = "CD_GAME", referencedColumnName = "CD_GAME", nullable = false)
	@Cascade(CascadeType.ALL)
	private Game game;

	@OneToOne
	@JoinColumn(name = "CD_STATUS", referencedColumnName = "CD_STATUS", nullable = false)
	@Cascade(CascadeType.ALL)
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "CD_FUSION_SPELL", referencedColumnName = "CD_FUSION_SPELL")
	@Cascade(CascadeType.ALL)
	private FusionSpell fusionSpell;
	
	@OneToOne
	@JoinColumn(name = "CD_SKILL_CARD", referencedColumnName = "CD_SKILL_CARD")
	@Cascade(CascadeType.ALL)
	private SkillCard skillCard;
	
	@OneToOne
	@JoinColumn(name = "CD_HEART_ITEM", referencedColumnName = "CD_HEART_ITEM")
	@Cascade(CascadeType.ALL)
	private HeartItem heartItem;
	
	@OneToMany(mappedBy="persona")
	@Cascade({CascadeType.DELETE, CascadeType.SAVE_UPDATE})
	private List<Skill> skills;

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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getInherit() {
		return inherit;
	}

	public void setInherit(String inherit) {
		this.inherit = inherit;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
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

	public SkillCard getSkillCard() {
		return skillCard;
	}

	public void setSkillCard(SkillCard skillCard) {
		this.skillCard = skillCard;
	}

	public HeartItem getHeartItem() {
		return heartItem;
	}

	public void setHeartItem(HeartItem heartItem) {
		this.heartItem = heartItem;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	
}
