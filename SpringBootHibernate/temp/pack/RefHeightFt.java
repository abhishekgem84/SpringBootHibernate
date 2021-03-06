package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RefHeightFt generated by hbm2java
 */
@Entity
@Table(name = "ref_height_ft", schema = "public")
public class RefHeightFt implements java.io.Serializable {

	private int id;
	private Integer feet;

	public RefHeightFt() {
	}

	public RefHeightFt(int id) {
		this.id = id;
	}

	public RefHeightFt(int id, Integer feet) {
		this.id = id;
		this.feet = feet;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "feet")
	public Integer getFeet() {
		return this.feet;
	}

	public void setFeet(Integer feet) {
		this.feet = feet;
	}

}
