package com.temp.pack;
// Generated Jul 19, 2018 11:30:14 AM by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * UserLoginDetails generated by hbm2java
 */
//@Entity
@Table(name = "user_login_details", schema = "public")
public class UserLoginDetails implements java.io.Serializable {

	private int userId;
	private RefUserStatus refUserStatus;
	private RegisteredUser registeredUser;
	private String password;
	private String salt;
	private Set<ProfileModeration> profileModerations = new HashSet<ProfileModeration>(0);

	public UserLoginDetails() {
	}

	public UserLoginDetails(RefUserStatus refUserStatus, RegisteredUser registeredUser, String password, String salt) {
		this.refUserStatus = refUserStatus;
		this.registeredUser = registeredUser;
		this.password = password;
		this.salt = salt;
	}

	public UserLoginDetails(RefUserStatus refUserStatus, RegisteredUser registeredUser, String password, String salt,
			Set<ProfileModeration> profileModerations) {
		this.refUserStatus = refUserStatus;
		this.registeredUser = registeredUser;
		this.password = password;
		this.salt = salt;
		this.profileModerations = profileModerations;
	}

	@GenericGenerator(name = "com.aks.app.model.all.entity.UserLoginDetailsIdGenerator", strategy = "foreign", parameters = @Parameter(name = "property", value = "registeredUser"))
	@Id
	@GeneratedValue(generator = "com.aks.app.model.all.entity.UserLoginDetailsIdGenerator")

	@Column(name = "user_id", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status_id", nullable = false)
	public RefUserStatus getRefUserStatus() {
		return this.refUserStatus;
	}

	public void setRefUserStatus(RefUserStatus refUserStatus) {
		this.refUserStatus = refUserStatus;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public RegisteredUser getRegisteredUser() {
		return this.registeredUser;
	}

	public void setRegisteredUser(RegisteredUser registeredUser) {
		this.registeredUser = registeredUser;
	}

	@Column(name = "password", nullable = false, length = 254)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "salt", nullable = false, length = 254)
	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userLoginDetails")
	public Set<ProfileModeration> getProfileModerations() {
		return this.profileModerations;
	}

	public void setProfileModerations(Set<ProfileModeration> profileModerations) {
		this.profileModerations = profileModerations;
	}

}
