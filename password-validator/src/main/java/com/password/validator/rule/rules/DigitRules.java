package com.password.validator.rule.rules;

import com.password.validator.rule.PasswordRule;
import com.password.validator.rule.context.PasswordContext;
import com.password.validator.rule.result.ValidationResult;

public class DigitRules implements PasswordRule{

	@Override
	public ValidationResult validatePassword(String password, PasswordContext context) {
		if(!password.matches(".*\\d.*")) {
			return new ValidationResult(false, "Missing Digit", "Add Atleast one number to the password", "digit");
		}
		return new ValidationResult(true, null, null, "digit");
	}

}
