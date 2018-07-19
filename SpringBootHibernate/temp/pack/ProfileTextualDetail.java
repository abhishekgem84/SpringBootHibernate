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
 * ProfileTextualDetail generated by hbm2java
 */
@Entity
@Table(name = "profile_textual_detail", schema = "public")
public class ProfileTextualDetail implements java.io.Serializable {

	private int id;
	private Profile profile;
	private RefLanguage refLanguage;
	private String name;
	private String description;
	private String address;
	private String fatherName;
	private String motherName;
	private String reason;
	private String identificationMarks;
	private String disabilityDetails;
	private String dataflag;

	public ProfileTextualDetail() {
	}

	public ProfileTextualDetail(int id) {
		this.id = id;
	}

	public ProfileTextualDetail(int id, Profile profile, RefLanguage refLanguage, String name, String description,
			String address, String fatherName, String motherName, String reason, String identificationMarks,
			String disabilityDetails, String dataflag) {
		this.id = id;
		this.profile = profile;
		this.refLanguage = refLanguage;
		this.name = name;
		this.description = description;
		this.address = address;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.reason = reason;
		this.identificationMarks = identificationMarks;
		this.disabilityDetails = disabilityDetails;
		this.dataflag = dataflag;
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
	@JoinColumn(name = "profile_id")
	public Profile getProfile() {
		return this.profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "language_id", columnDefinition="bpchar(3)")
	public RefLanguage getRefLanguage() {
		return this.refLanguage;
	}

	public void setRefLanguage(RefLanguage refLanguage) {
		this.refLanguage = refLanguage;
	}

	@Column(name = "name", length = 99)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 1000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "address", length = 150)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "father_name", length = 50)
	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Column(name = "mother_name", length = 50)
	public String getMotherName() {
		return this.motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	@Column(name = "reason", length = 1000)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column(name = "identification_marks", length = 100)
	public String getIdentificationMarks() {
		return this.identificationMarks;
	}

	public void setIdentificationMarks(String identificationMarks) {
		this.identificationMarks = identificationMarks;
	}

	@Column(name = "disability_details", length = 250)
	public String getDisabilityDetails() {
		return this.disabilityDetails;
	}

	public void setDisabilityDetails(String disabilityDetails) {
		this.disabilityDetails = disabilityDetails;
	}

	@Column(name = "dataflag", length = 5)
	public String getDataflag() {
		return this.dataflag;
	}

	public void setDataflag(String dataflag) {
		this.dataflag = dataflag;
	}

}
