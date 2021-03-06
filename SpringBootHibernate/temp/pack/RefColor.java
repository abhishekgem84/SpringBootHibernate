package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RefColor generated by hbm2java
 */
@Entity
@Table(name = "ref_color", schema = "public")
public class RefColor implements java.io.Serializable {

	private int id;
	private String color;

	public RefColor() {
	}

	public RefColor(int id) {
		this.id = id;
	}

	public RefColor(int id, String color) {
		this.id = id;
		this.color = color;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "color", length = 15)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
