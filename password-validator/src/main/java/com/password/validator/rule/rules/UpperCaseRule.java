package com.password.validator.rule.rules;

import org.springframework.stereotype.Component;

import com.password.validator.rule.PasswordRule;
import com.password.validator.rule.context.PasswordContext;
import com.password.validator.rule.result.ValidationResult;

@Component
public class UpperCaseRule implements PasswordRule {
	@Override
	public ValidationResult validatePassword(String password, PasswordContext context) {
		return password.chars().anyMatch(Character::isUpperCase) ? ValidationResult.pass("uppercase")
				: ValidationResult.fail("uppercase", "Missing UpperCase", "Add atleast one upper case letter");
	}
}
