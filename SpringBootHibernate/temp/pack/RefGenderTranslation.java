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
 * RefGenderTranslation generated by hbm2java
 */
@Entity
@Table(name = "ref_gender_translation", schema = "public")
public class RefGenderTranslation implements java.io.Serializable {

	private int id;
	private RefGender refGender;
	private RefLanguage refLanguage;
	private String name;

	public RefGenderTranslation() {
	}

	public RefGenderTranslation(int id, RefLanguage refLanguage) {
		this.id = id;
		this.refLanguage = refLanguage;
	}

	public RefGenderTranslation(int id, RefGender refGender, RefLanguage refLanguage, String name) {
		this.id = id;
		this.refGender = refGender;
		this.refLanguage = refLanguage;
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
	@JoinColumn(name = "gender_id")
	public RefGender getRefGender() {
		return this.refGender;
	}

	public void setRefGender(RefGender refGender) {
		this.refGender = refGender;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "language_id", columnDefinition="bpchar(3)", nullable = false)
	public RefLanguage getRefLanguage() {
		return this.refLanguage;
	}

	public void setRefLanguage(RefLanguage refLanguage) {
		this.refLanguage = refLanguage;
	}

	@Column(name = "name", length = 254)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
