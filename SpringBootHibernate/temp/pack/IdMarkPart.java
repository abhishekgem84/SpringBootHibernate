package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * IdMarkPart generated by hbm2java
 */
@Entity
@Table(name = "id_mark_part", schema = "public")
public class IdMarkPart implements java.io.Serializable {

	private int id;
	private String idPart;

	public IdMarkPart() {
	}

	public IdMarkPart(int id) {
		this.id = id;
	}

	public IdMarkPart(int id, String idPart) {
		this.id = id;
		this.idPart = idPart;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "id_part", length = 30)
	public String getIdPart() {
		return this.idPart;
	}

	public void setIdPart(String idPart) {
		this.idPart = idPart;
	}

}