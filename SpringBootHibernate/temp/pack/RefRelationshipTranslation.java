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
 * RefRelationshipTranslation generated by hbm2java
 */
@Entity
@Table(name = "ref_relationship_translation", schema = "public")
public class RefRelationshipTranslation implements java.io.Serializable {

	private int id;
	private RefLanguage refLanguage;
	private RefRelationship refRelationship;
	private String name;

	public RefRelationshipTranslation() {
	}

	public RefRelationshipTranslation(int id, RefLanguage refLanguage, RefRelationship refRelationship) {
		this.id = id;
		this.refLanguage = refLanguage;
		this.refRelationship = refRelationship;
	}

	public RefRelationshipTranslation(int id, RefLanguage refLanguage, RefRelationship refRelationship, String name) {
		this.id = id;
		this.refLanguage = refLanguage;
		this.refRelationship = refRelationship;
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
	@JoinColumn(name = "relationship_id", nullable = false)
	public RefRelationship getRefRelationship() {
		return this.refRelationship;
	}

	public void setRefRelationship(RefRelationship refRelationship) {
		this.refRelationship = refRelationship;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}