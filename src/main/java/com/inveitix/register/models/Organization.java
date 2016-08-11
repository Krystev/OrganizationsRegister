package com.inveitix.register.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "organizations")
public class Organization {
	@NotNull
	private String organizationName;
	@NotNull
	private String registerNumber;
	@NotNull
	private String registrationDate;
	@NotNull
	private String ownerName;
	@NotNull
	private String organizationAddress;
	@NotNull
	private String organizationPostCode;
	@NotNull
	private String organizationOccupation;
	@NotNull
	private String occupationDescription;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public Organization() {
	}

	public Organization(String organizationName, String registerNumber, String registrationDate, String ownerName,
			String organizationAddress, String organizationPostCode, String organizationOccupation,
			String occupationDescription) {
		
		this.organizationName = organizationName;
		this.registerNumber = registerNumber;
		this.registrationDate = registrationDate;
		this.ownerName = ownerName;
		this.organizationAddress = organizationAddress;
		this.organizationPostCode = organizationPostCode;
		this.organizationOccupation = organizationOccupation;
		this.occupationDescription = occupationDescription;
	}

	public Organization(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organisationName) {
		this.organizationName = organisationName;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOrganizationAddress() {
		return organizationAddress;
	}

	public void setOrganizationAddress(String organizationAddress) {
		this.organizationAddress = organizationAddress;
	}

	public String getOrganizationPostCode() {
		return organizationPostCode;
	}

	public void setOrganizationPostCode(String organizationPostCode) {
		this.organizationPostCode = organizationPostCode;
	}

	public String getOrganizationOccupation() {
		return organizationOccupation;
	}

	public void setOrganizationOccupation(String organizationOccupation) {
		this.organizationOccupation = organizationOccupation;
	}

	public String getOccupationDescription() {
		return occupationDescription;
	}

	public void setOccupationDescription(String occupationDescription) {
		this.occupationDescription = occupationDescription;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

}
