package com.xworkz.service;

import com.xworkz.dao.RegisterDAO;
import com.xworkz.dto.RegisterDTO;

public class RegisterServiceImpl implements RegisterService {

	private RegisterDAO dao;

	public RegisterServiceImpl(RegisterDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(RegisterDTO registerDTO) {
		boolean validData = false;
		if (registerDTO != null) {
			System.out.println("dto is not null, can validate");
			
				String firstName = registerDTO.getFirstName();
				if (firstName != null && !firstName.isEmpty() && !firstName.contentEquals(" ")) {
					System.out.println("firstName is valid");
					validData = true;
				} else {
					System.out.println("firstName is not valid");
					validData = false;
				}
			

			if (validData) {
				String lastName = registerDTO.getLastName();
				if (lastName != null && !lastName.isEmpty() && !lastName.contentEquals(" ")) {
					System.out.println("lastName is valid");
					validData = true;
				} else {
					System.out.println("lastName is not valid");
					validData = false;
				}
			}
			 
			if (validData) {
				String emailId = registerDTO.getEmail();
				if (emailId != null && !emailId.isEmpty() && !emailId.contentEquals(" ")) {
					System.out.println("emailId is valid");
					validData = true;
				} else {
					System.out.println("emailId is not valid");
					validData = false;
				}
			}

			if (validData) {
				String address = registerDTO.getAddress();
				if (address != null && !address.isEmpty() && !address.contentEquals(" ")) {
					System.out.println("address is valid");
					validData = true;
				} else {
					System.out.println("address is not valid");
					validData = false;
				}
			}

			if (validData) {
				String UserName = registerDTO.getUserName();
				if (UserName != null && !UserName.isEmpty() && !UserName.contentEquals(" ")) {
					System.out.println("UserName is valid");
					validData = true;
				} else {
					System.out.println("UserName is not valid");
					validData = false;
				}
			}

			if (validData) {
				String createPassword = registerDTO.getCreatePassword();
				if (createPassword != null && !createPassword.isEmpty() && !createPassword.contentEquals(" ")) {
					System.out.println("createPassword is valid");
					validData = true;
				} else {
					System.out.println("createPassword is not valid");
					validData = false;
				}
			}

			if (validData) {
				String confirmPassword = registerDTO.getConfirmPassword();
				if (confirmPassword != null && !confirmPassword.isEmpty() && !confirmPassword.contentEquals(" ")) {
					System.out.println("confirmPassword is valid");
					validData = true;
				} else {
					System.out.println("confirmPassword is not valid");
					validData = false;
				}

			}
			if (validData) {
				System.out.println("Invoke save method, data is valid");
				dao.saveRegister(registerDTO);
			}
		} else {
			System.out.println("dto is null, invalid data");
		}
		return false;
	}

}
