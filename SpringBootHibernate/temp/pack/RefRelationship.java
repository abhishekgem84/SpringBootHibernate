package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * RefRelationship generated by hbm2java
 */
@Entity
@Table(name = "ref_relationship", schema = "public")
public class RefRelationship implements java.io.Serializable {

	private char id;
	private String name;
	private Set<RefRelationshipTranslation> refRelationshipTranslations = new HashSet<RefRelationshipTranslation>(0);

	public RefRelationship() {
	}

	public RefRelationship(char id) {
		this.id = id;
	}

	public RefRelationship(char id, String name, Set<RefRelationshipTranslation> refRelationshipTranslations) {
		this.id = id;
		this.name = name;
		this.refRelationshipTranslations = refRelationshipTranslations;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false, length = 1)
	public char getId() {
		return this.id;
	}

	public void setId(char id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refRelationship")
	public Set<RefRelationshipTranslation> getRefRelationshipTranslations() {
		return this.refRelationshipTranslations;
	}

	public void setRefRelationshipTranslations(Set<RefRelationshipTranslation> refRelationshipTranslations) {
		this.refRelationshipTranslations = refRelationshipTranslations;
	}

}