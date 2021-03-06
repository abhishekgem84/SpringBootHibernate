package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProfileIvrs generated by hbm2java
 */
@Entity
@Table(name = "profile_ivrs", schema = "public")
public class ProfileIvrs implements java.io.Serializable {

	private int id;
	private byte[] name;
	private Integer age;
	private Character genderId;
	private byte[] fatherName;
	private String fatherNumber;
	private byte[] motherName;
	private String stateId;
	private String districtId;
	private byte[] homeAddress;
	private byte[] dressDetails;
	private Integer complexionId;
	private Integer eyeColorId;
	private Integer studiesId;
	private Integer buildId;
	private Boolean physicalDisability;
	private Boolean mentalDisability;
	private Integer primaryLanguageId;
	private char missingOrSighting;
	private Date entryDate;
	private Date expiryDate;
	private String height;
	private byte[] location;

	public ProfileIvrs() {
	}

	public ProfileIvrs(int id, char missingOrSighting, Date entryDate) {
		this.id = id;
		this.missingOrSighting = missingOrSighting;
		this.entryDate = entryDate;
	}

	public ProfileIvrs(int id, byte[] name, Integer age, Character genderId, byte[] fatherName, String fatherNumber,
			byte[] motherName, String stateId, String districtId, byte[] homeAddress, byte[] dressDetails,
			Integer complexionId, Integer eyeColorId, Integer studiesId, Integer buildId, Boolean physicalDisability,
			Boolean mentalDisability, Integer primaryLanguageId, char missingOrSighting, Date entryDate,
			Date expiryDate, String height, byte[] location) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.genderId = genderId;
		this.fatherName = fatherName;
		this.fatherNumber = fatherNumber;
		this.motherName = motherName;
		this.stateId = stateId;
		this.districtId = districtId;
		this.homeAddress = homeAddress;
		this.dressDetails = dressDetails;
		this.complexionId = complexionId;
		this.eyeColorId = eyeColorId;
		this.studiesId = studiesId;
		this.buildId = buildId;
		this.physicalDisability = physicalDisability;
		this.mentalDisability = mentalDisability;
		this.primaryLanguageId = primaryLanguageId;
		this.missingOrSighting = missingOrSighting;
		this.entryDate = entryDate;
		this.expiryDate = expiryDate;
		this.height = height;
		this.location = location;
	}

	@Id

	@Column(name = "id", columnDefinition="bpchar(3)", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name")
	public byte[] getName() {
		return this.name;
	}

	public void setName(byte[] name) {
		this.name = name;
	}

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "gender_id", length = 1)
	public Character getGenderId() {
		return this.genderId;
	}

	public void setGenderId(Character genderId) {
		this.genderId = genderId;
	}

	@Column(name = "father_name")
	public byte[] getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(byte[] fatherName) {
		this.fatherName = fatherName;
	}

	@Column(name = "father_number", columnDefinition="bpchar(10)", length = 10)
	public String getFatherNumber() {
		return this.fatherNumber;
	}

	public void setFatherNumber(String fatherNumber) {
		this.fatherNumber = fatherNumber;
	}

	@Column(name = "mother_name")
	public byte[] getMotherName() {
		return this.motherName;
	}

	public void setMotherName(byte[] motherName) {
		this.motherName = motherName;
	}

	@Column(name = "state_id", columnDefinition="bpchar(2)", length = 2)
	public String getStateId() {
		return this.stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	@Column(name = "district_id", columnDefinition="bpchar(3)", length = 3)
	public String getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	@Column(name = "home_address")
	public byte[] getHomeAddress() {
		return this.homeAddress;
	}

	public void setHomeAddress(byte[] homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Column(name = "dress_details")
	public byte[] getDressDetails() {
		return this.dressDetails;
	}

	public void setDressDetails(byte[] dressDetails) {
		this.dressDetails = dressDetails;
	}

	@Column(name = "complexion_id")
	public Integer getComplexionId() {
		return this.complexionId;
	}

	public void setComplexionId(Integer complexionId) {
		this.complexionId = complexionId;
	}

	@Column(name = "eye_color_id")
	public Integer getEyeColorId() {
		return this.eyeColorId;
	}

	public void setEyeColorId(Integer eyeColorId) {
		this.eyeColorId = eyeColorId;
	}

	@Column(name = "studies_id")
	public Integer getStudiesId() {
		return this.studiesId;
	}

	public void setStudiesId(Integer studiesId) {
		this.studiesId = studiesId;
	}

	@Column(name = "build_id")
	public Integer getBuildId() {
		return this.buildId;
	}

	public void setBuildId(Integer buildId) {
		this.buildId = buildId;
	}

	@Column(name = "physical_disability")
	public Boolean getPhysicalDisability() {
		return this.physicalDisability;
	}

	public void setPhysicalDisability(Boolean physicalDisability) {
		this.physicalDisability = physicalDisability;
	}

	@Column(name = "mental_disability")
	public Boolean getMentalDisability() {
		return this.mentalDisability;
	}

	public void setMentalDisability(Boolean mentalDisability) {
		this.mentalDisability = mentalDisability;
	}

	@Column(name = "primary_language_id")
	public Integer getPrimaryLanguageId() {
		return this.primaryLanguageId;
	}

	public void setPrimaryLanguageId(Integer primaryLanguageId) {
		this.primaryLanguageId = primaryLanguageId;
	}

	@Column(name = "missing_or_sighting", nullable = false, length = 1)
	public char getMissingOrSighting() {
		return this.missingOrSighting;
	}

	public void setMissingOrSighting(char missingOrSighting) {
		this.missingOrSighting = missingOrSighting;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "entry_date", nullable = false, length = 29)
	public Date getEntryDate() {
		return this.entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expiry_date", length = 29)
	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Column(name = "height", length = 4)
	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Column(name = "location")
	public byte[] getLocation() {
		return this.location;
	}

	public void setLocation(byte[] location) {
		this.location = location;
	}

}
