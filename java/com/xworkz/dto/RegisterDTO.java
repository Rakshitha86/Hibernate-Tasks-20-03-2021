package com.xworkz.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class RegisterDTO implements Serializable {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "registration_id")
	@Id
	private int registerId;
	@Column(name = "registration_firstname")
	private String firstName;
	@Column(name = "registration_lastname")
	private String lastName;
	@Column(name = "registration_email")
	private String email;
	@Column(name = "registration_address")
	private String address;
	@Column(name = "registration_username")
	private String userName;
	@Column(name = "registration_password")
	private String createPassword;
	@Column(name = "registration_confirmpassword")
	private String confirmPassword;

	public RegisterDTO() {
		System.out.println("Invoked default constructor");
	}

	public RegisterDTO(String firstName, String lastName, String email, String address, String userName,
			String createPassword, String confirmPassword) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.userName = userName;
		this.createPassword = createPassword;
		this.confirmPassword = confirmPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCreatePassword() {
		return createPassword;
	}

	public void setCreatePassword(String createPassword) {
		this.createPassword = createPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "RegisterDTO [firstName=" + firstName + ", lastName=" + lastName + ",  email=" + email + ", address="
				+ address + ", userName=" + userName + ", createPassword=" + createPassword + ", confirmPassword="
				+ confirmPassword + "]";
	}

}
