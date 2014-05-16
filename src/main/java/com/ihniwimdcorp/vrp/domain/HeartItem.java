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
@Table(name="HEART_ITEM")
public class HeartItem {
	
	@Id
	@SequenceGenerator(name = "heart_item_id", sequenceName = "heart_item_id")
	@GeneratedValue(generator = "heart_item_id", strategy = GenerationType.AUTO)
	@Column(name = "CD_HEART_ITEM")
	private Long id;
	
	@Column(name = "NM_NAME", nullable = false)
	private String name;

	@Column(name = "NM_DESCRIPTION", nullable = false)
	private String description;
	
	@OneToOne
	@JoinColumn(name = "CD_ITEM", referencedColumnName = "CD_ITEM", nullable = false)
	@Cascade(CascadeType.ALL)
	private Item item;

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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
