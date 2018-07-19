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
 * RefEyesType generated by hbm2java
 */
@Entity
@Table(name = "ref_eyes_type", schema = "public")
public class RefEyesType implements java.io.Serializable {

	private int id;
	private String eyesType;
	private Set<RefEyesTypeTranslation> refEyesTypeTranslations = new HashSet<RefEyesTypeTranslation>(0);

	public RefEyesType() {
	}

	public RefEyesType(int id) {
		this.id = id;
	}

	public RefEyesType(int id, String eyesType, Set<RefEyesTypeTranslation> refEyesTypeTranslations) {
		this.id = id;
		this.eyesType = eyesType;
		this.refEyesTypeTranslations = refEyesTypeTranslations;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "eyes_type", length = 20)
	public String getEyesType() {
		return this.eyesType;
	}

	public void setEyesType(String eyesType) {
		this.eyesType = eyesType;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refEyesType")
	public Set<RefEyesTypeTranslation> getRefEyesTypeTranslations() {
		return this.refEyesTypeTranslations;
	}

	public void setRefEyesTypeTranslations(Set<RefEyesTypeTranslation> refEyesTypeTranslations) {
		this.refEyesTypeTranslations = refEyesTypeTranslations;
	}

}