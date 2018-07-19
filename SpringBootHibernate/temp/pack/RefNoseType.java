package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RefNoseType generated by hbm2java
 */
@Entity
@Table(name = "ref_nose_type", schema = "public")
public class RefNoseType implements java.io.Serializable {

	private int id;
	private String noseType;

	public RefNoseType() {
	}

	public RefNoseType(int id) {
		this.id = id;
	}

	public RefNoseType(int id, String noseType) {
		this.id = id;
		this.noseType = noseType;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nose_type", length = 15)
	public String getNoseType() {
		return this.noseType;
	}

	public void setNoseType(String noseType) {
		this.noseType = noseType;
	}

}