package com.aks.app.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "registered_user")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class RegisteredUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition="bpchar(3)", precision = 10)
	@NotNull
	private int id;

	@Size(min = 5, max = 99, message = "Please enter name")
	@NotNull
	@Column(name = "name", precision = 99)
	private String name;

	// @Size(min = 10, max = 10, message = "Please enter mobile number")
	@NotNull
	@Column(name = "mobile_number", precision = 10, columnDefinition = "bpchar(10)")
	private String mobileNumber;
	@Size(max = 15)
	@Column(name = "phone_number", precision = 15)
	private String phoneNumber;
	@Size(max = 254)
	@Column(name = "email", precision = 254)
	private String email;
	@Size(max = 255)
	@Column(name = "address", precision = 255)
	private String address;
	//@Column(name = "district_id", columnDefinition="bpchar(3)", precision = 3)
	//private String districtId;
//	@Column(name = "state_id", columnDefinition="bpchar(2)", precision = 2)
//	private String stateId;
	
	// @Size(min = 6, max = 6, message = "Please enter valide pin code")
	@Column(name = "pin_code", precision = 6)
	private String pinCode;
	@Column(name = "aadhaar_number", precision = 12)
	private String aadhaarNumber;
	@NotNull
	@Column(name = "request_contact_permission", precision = 1)
	private boolean requestContactPermission = false;
	// @NotNull
	@Column(name = "entry_date", precision = 29)
	private LocalDateTime entryDate = LocalDateTime.now();
	@Column(name = "photo_id_card", precision = 10)
	private int photoIdCard;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id", columnDefinition="bpchar(2)")
	private RefState refState;
	
	public RefState getRefState() {
		return this.refState;
	}

	public void setRefState(RefState refState) {
		this.refState = refState;
	}
	
	//@OneToOne(cascade = CascadeType.ALL)
	@OneToOne(/*mappedBy="registeredUser",*/cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn(name="user_id", referencedColumnName="user_id")
	//@JsonBackReference
	//@JoinColumn(name="user_id",referencedColumnName="user_id")
	//@PrimaryKeyJoinColumn(name="user_id")
//	@JoinTable(name = "user_role",joinColumns = @JoinColumn(name="user_id"),
//			inverseJoinColumns = @JoinColumn(name="role_id"))
	private UserRole userRole ;
	
	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	
	@OneToOne(/*mappedBy="registeredUser",*/cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn(name="user_id", referencedColumnName="user_id")
	//@JsonBackReference
	private UserLoginDetails userLoginDetails;
	

	public UserLoginDetails getUserLoginDetails() {
		return userLoginDetails;
	}

	public void setUserLoginDetails(UserLoginDetails userLoginDetails) {
		this.userLoginDetails = userLoginDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public String getDistrictId() {
//		return districtId;
//	}
//
//	public void setDistrictId(String districtId) {
//		this.districtId = districtId;
//	}

//	public String getStateId() {
//		return stateId;
//	}
//
//	public void setStateId(String stateId) {
//		this.stateId = stateId;
//	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public boolean isRequestContactPermission() {
		return requestContactPermission;
	}

	public void setRequestContactPermission(boolean requestContactPermission) {
		this.requestContactPermission = requestContactPermission;
	}

	public LocalDateTime getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(LocalDateTime entryDate) {
		this.entryDate = entryDate;
	}

	public int getPhotoIdCard() {
		return photoIdCard;
	}

	public void setPhotoIdCard(int photoIdCard) {
		this.photoIdCard = photoIdCard;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
