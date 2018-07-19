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
 * RefGender generated by hbm2java
 */
@Entity
@Table(name = "ref_gender", schema = "public")
public class RefGender implements java.io.Serializable {

	private char id;
	private String name;
	private Set<RefGenderTranslation> refGenderTranslations = new HashSet<RefGenderTranslation>(0);
	private Set<Profile> profiles = new HashSet<Profile>(0);

	public RefGender() {
	}

	public RefGender(char id, String name) {
		this.id = id;
		this.name = name;
	}

	public RefGender(char id, String name, Set<RefGenderTranslation> refGenderTranslations, Set<Profile> profiles) {
		this.id = id;
		this.name = name;
		this.refGenderTranslations = refGenderTranslations;
		this.profiles = profiles;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false, length = 1)
	public char getId() {
		return this.id;
	}

	public void setId(char id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 254)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refGender")
	public Set<RefGenderTranslation> getRefGenderTranslations() {
		return this.refGenderTranslations;
	}

	public void setRefGenderTranslations(Set<RefGenderTranslation> refGenderTranslations) {
		this.refGenderTranslations = refGenderTranslations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refGender")
	public Set<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
	}

}