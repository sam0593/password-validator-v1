package com.password.validator.rule.rules;

import com.password.validator.rule.PasswordRule;
import com.password.validator.rule.context.PasswordContext;
import com.password.validator.rule.result.ValidationResult;

public class SpecialCharacterRule implements PasswordRule{

	@Override
	public ValidationResult validatePassword(String password, PasswordContext context) {
		 	if(password.matches("[^a-zA-Z0-9]")) {
		 		return new ValidationResult(true, "special character missing", "Password should contain special character", "Special Character");
		 	}
		return new ValidationResult(false, null, null, "Special Character");
	}

}
