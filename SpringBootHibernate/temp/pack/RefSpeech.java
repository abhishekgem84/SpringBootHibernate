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
 * RefSpeech generated by hbm2java
 */
@Entity
@Table(name = "ref_speech", schema = "public")
public class RefSpeech implements java.io.Serializable {

	private int id;
	private String speech;
	private Set<RefSpeechTranslation> refSpeechTranslations = new HashSet<RefSpeechTranslation>(0);

	public RefSpeech() {
	}

	public RefSpeech(int id) {
		this.id = id;
	}

	public RefSpeech(int id, String speech, Set<RefSpeechTranslation> refSpeechTranslations) {
		this.id = id;
		this.speech = speech;
		this.refSpeechTranslations = refSpeechTranslations;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "speech", length = 40)
	public String getSpeech() {
		return this.speech;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refSpeech")
	public Set<RefSpeechTranslation> getRefSpeechTranslations() {
		return this.refSpeechTranslations;
	}

	public void setRefSpeechTranslations(Set<RefSpeechTranslation> refSpeechTranslations) {
		this.refSpeechTranslations = refSpeechTranslations;
	}

}
