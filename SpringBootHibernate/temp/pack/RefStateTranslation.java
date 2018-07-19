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
 * RefStateTranslation generated by hbm2java
 */
//@Entity
@Table(name = "ref_state_translation", schema = "public")
public class RefStateTranslation implements java.io.Serializable {

	private int id;
	private RefLanguage refLanguage;
	private RefState refState;
	private String name;

	public RefStateTranslation() {
	}

	public RefStateTranslation(int id, RefLanguage refLanguage, RefState refState) {
		this.id = id;
		this.refLanguage = refLanguage;
		this.refState = refState;
	}

	public RefStateTranslation(int id, RefLanguage refLanguage, RefState refState, String name) {
		this.id = id;
		this.refLanguage = refLanguage;
		this.refState = refState;
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
	@JoinColumn(name = "language_id", columnDefinition="bpchar(3)", nullable = false)
	public RefLanguage getRefLanguage() {
		return this.refLanguage;
	}

	public void setRefLanguage(RefLanguage refLanguage) {
		this.refLanguage = refLanguage;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id", columnDefinition="bpchar(2)", nullable = false)
	public RefState getRefState() {
		return this.refState;
	}

	public void setRefState(RefState refState) {
		this.refState = refState;
	}

	@Column(name = "name", length = 254)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}