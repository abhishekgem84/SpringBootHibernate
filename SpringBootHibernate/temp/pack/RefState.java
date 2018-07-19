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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * RefState generated by hbm2java
 */
//@Entity
@Table(name = "ref_state", schema = "public")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "stateId")
public class RefState implements java.io.Serializable {

	private String stateId;
	private String name;
	private Set<Profile> profiles = new HashSet<Profile>(0);
	private Set<RegisteredUser> registeredUsers = new HashSet<RegisteredUser>(0);
	private Set<RefStateTranslation> refStateTranslations = new HashSet<RefStateTranslation>(0);
	private Set<PoliceStationList> policeStationLists = new HashSet<PoliceStationList>(0);

	public RefState() {
	}

	public RefState(String stateId) {
		this.stateId = stateId;
	}

	public RefState(String stateId, String name, Set<Profile> profiles, Set<RegisteredUser> registeredUsers,
			Set<RefStateTranslation> refStateTranslations, Set<PoliceStationList> policeStationLists) {
		this.stateId = stateId;
		this.name = name;
		this.profiles = profiles;
		this.registeredUsers = registeredUsers;
		this.refStateTranslations = refStateTranslations;
		this.policeStationLists = policeStationLists;
	}

	@Id
	@Column(name = "state_id", columnDefinition="bpchar(2)", unique = true, nullable = false, length = 2)
	public String getStateId() {
		return this.stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	@Column(name = "name", length = 254)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refState")
	public Set<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refState")
	public Set<RegisteredUser> getRegisteredUsers() {
		return this.registeredUsers;
	}

	public void setRegisteredUsers(Set<RegisteredUser> registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refState")
	public Set<RefStateTranslation> getRefStateTranslations() {
		return this.refStateTranslations;
	}

	public void setRefStateTranslations(Set<RefStateTranslation> refStateTranslations) {
		this.refStateTranslations = refStateTranslations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "refState")
	public Set<PoliceStationList> getPoliceStationLists() {
		return this.policeStationLists;
	}

	public void setPoliceStationLists(Set<PoliceStationList> policeStationLists) {
		this.policeStationLists = policeStationLists;
	}

}
