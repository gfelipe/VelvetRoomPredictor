package com.ihniwimdcorp.vrp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ITEM")
public class Item {

	@Id
	@SequenceGenerator(name = "item_id", sequenceName = "item_id")
	@GeneratedValue(generator = "item_id", strategy = GenerationType.AUTO)
	@Column(name = "CD_ITEM")
	private Long id;
	
	@Column(name = "NM_NAME", nullable = false)
	private String name;

}
