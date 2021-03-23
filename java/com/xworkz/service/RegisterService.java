package com.xworkz.service;

import com.xworkz.dto.RegisterDTO;

public interface RegisterService {
	
	boolean validateAndSave(RegisterDTO registerDTO);

}
