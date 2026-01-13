package com.password.validator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.password.validator.dto.PasswordRequest;
import com.password.validator.dto.PasswordResponse;
import com.password.validator.service.PasswordValidationService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/password")
public class PasswordValidationController {
	private final PasswordValidationService passwordValidationService;
	 
	public PasswordValidationController(PasswordValidationService passwordValidationService) {
		this.passwordValidationService = passwordValidationService;
	}
	@PostMapping("/validate")
	public PasswordResponse validatePassword(@Valid @RequestBody PasswordRequest passwordRequest){
		return passwordValidationService.validatePassword(passwordRequest);
	}
	
}
