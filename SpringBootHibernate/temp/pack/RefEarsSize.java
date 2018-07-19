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
 * RefEarsSize generated by hbm2java
 */
@Entity
@Table(name = "ref_ears_size", schema = "public")
public class RefEarsSize implements java.io.Serializable {

	private int id;
	private String earsSize;
	private Set<RefEarsSizeTranslation> refEarsSizeTranslations = new HashSet<RefEarsSizeTranslation>(0);

	public RefEarsSize() {
	}

	public RefEarsSize(int id) {
		this.id = id;
	}

	public RefEarsSize(int id, String earsSize, Set<RefEarsSizeTranslation> refEarsSizeTranslations) {
		this.id = id;
		this.earsSize = earsSize;
		this.refEarsSizeTranslations = refEarsSizeTranslations;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "ears_size", length = 15)
	public String getEarsSize() {
		return this.earsSize;
	}

	public void setEarsSize(String earsSize) {
		this.earsSize = earsSize;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refEarsSize")
	public Set<RefEarsSizeTranslation> getRefEarsSizeTranslations() {
		return this.refEarsSizeTranslations;
	}

	public void setRefEarsSizeTranslations(Set<RefEarsSizeTranslation> refEarsSizeTranslations) {
		this.refEarsSizeTranslations = refEarsSizeTranslations;
	}

}