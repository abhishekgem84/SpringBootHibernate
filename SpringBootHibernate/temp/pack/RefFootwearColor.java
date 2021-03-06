package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RefFootwearColor generated by hbm2java
 */
@Entity
@Table(name = "ref_footwear_color", schema = "public")
public class RefFootwearColor implements java.io.Serializable {

	private int id;
	private String footwearColor;

	public RefFootwearColor() {
	}

	public RefFootwearColor(int id) {
		this.id = id;
	}

	public RefFootwearColor(int id, String footwearColor) {
		this.id = id;
		this.footwearColor = footwearColor;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "footwear_color", length = 15)
	public String getFootwearColor() {
		return this.footwearColor;
	}

	public void setFootwearColor(String footwearColor) {
		this.footwearColor = footwearColor;
	}

}
