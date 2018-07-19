package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * RefFrontTeethsTranslation generated by hbm2java
 */
@Entity
@Table(name = "ref_front_teeths_translation", schema = "public")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class RefFrontTeethsTranslation implements java.io.Serializable {

	private int id;
	private RefFrontTeeths refFrontTeeths;
	private RefLanguage refLanguage;
	private String name;

	public RefFrontTeethsTranslation() {
	}

	public RefFrontTeethsTranslation(int id, RefFrontTeeths refFrontTeeths, RefLanguage refLanguage) {
		this.id = id;
		this.refFrontTeeths = refFrontTeeths;
		this.refLanguage = refLanguage;
	}

	public RefFrontTeethsTranslation(int id, RefFrontTeeths refFrontTeeths, RefLanguage refLanguage, String name) {
		this.id = id;
		this.refFrontTeeths = refFrontTeeths;
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
	@JoinColumn(name = "front_teeths_id", nullable = false)
	public RefFrontTeeths getRefFrontTeeths() {
		return this.refFrontTeeths;
	}

	public void setRefFrontTeeths(RefFrontTeeths refFrontTeeths) {
		this.refFrontTeeths = refFrontTeeths;
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