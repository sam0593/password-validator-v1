package com.password.validator.rule.rules;

import org.springframework.stereotype.Component;

import com.password.validator.rule.PasswordRule;
import com.password.validator.rule.context.PasswordContext;
import com.password.validator.rule.result.ValidationResult;

@Component
public class MinLengthRules implements PasswordRule {

	@Override
	public ValidationResult validatePassword(String password, PasswordContext context) {
		if(password.length()<8) {
			return new ValidationResult(false,"Password Too Short","Use Atleast 8 characters","MIN_LENGTH");
		}
		 return new ValidationResult(true,null,null,"MIN_LENGTH");
	}
	

}
