package com.password.validator.rule.rules;

import com.password.validator.rule.PasswordRule;
import com.password.validator.rule.context.PasswordContext;
import com.password.validator.rule.result.ValidationResult;

public class EntropyRules  implements PasswordRule{

	@Override
	public ValidationResult validatePassword(String password, PasswordContext context) {
		int charset = 0;
			if(password.matches(".*[a-z].*")) {
				charset+=26;
			}
			if(password.matches(".*[A-Z].*")) {
				charset+=26;
			}
			if(password.matches(".*\\d.*")) {
				charset+=10;
			}
			if(password.matches(".*[a-zA-Z0-9].*")) {
				charset+=32;
			}
		return null;
	}
	

}
