package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * RefHealthTranslation generated by hbm2java
 */
@Entity
@Table(name = "ref_health_translation", schema = "public")
public class RefHealthTranslation implements java.io.Serializable {

	private int id;
	private RefHealth refHealth;
	private String languageId;
	private String name;

	public RefHealthTranslation() {
	}

	public RefHealthTranslation(int id, RefHealth refHealth, String languageId) {
		this.id = id;
		this.refHealth = refHealth;
		this.languageId = languageId;
	}

	public RefHealthTranslation(int id, RefHealth refHealth, String languageId, String name) {
		this.id = id;
		this.refHealth = refHealth;
		this.languageId = languageId;
		this.name = name;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "health_id", nullable = false)
	public RefHealth getRefHealth() {
		return this.refHealth;
	}

	public void setRefHealth(RefHealth refHealth) {
		this.refHealth = refHealth;
	}

	@Column(name = "language_id", columnDefinition="bpchar(3)", nullable = false, length = 3)
	public String getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	@Column(name = "name", length = 254)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}