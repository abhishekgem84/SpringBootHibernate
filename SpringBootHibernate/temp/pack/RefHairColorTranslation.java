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
 * RefHairColorTranslation generated by hbm2java
 */
@Entity
@Table(name = "ref_hair_color_translation", schema = "public")
public class RefHairColorTranslation implements java.io.Serializable {

	private int id;
	private RefHairColor refHairColor;
	private RefLanguage refLanguage;
	private String name;

	public RefHairColorTranslation() {
	}

	public RefHairColorTranslation(int id, RefHairColor refHairColor, RefLanguage refLanguage) {
		this.id = id;
		this.refHairColor = refHairColor;
		this.refLanguage = refLanguage;
	}

	public RefHairColorTranslation(int id, RefHairColor refHairColor, RefLanguage refLanguage, String name) {
		this.id = id;
		this.refHairColor = refHairColor;
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
	@JoinColumn(name = "hair_color_id", nullable = false)
	public RefHairColor getRefHairColor() {
		return this.refHairColor;
	}

	public void setRefHairColor(RefHairColor refHairColor) {
		this.refHairColor = refHairColor;
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