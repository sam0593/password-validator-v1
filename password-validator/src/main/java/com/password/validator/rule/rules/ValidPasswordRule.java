package com.password.validator.rule.rules;

import com.password.validator.rule.PasswordRule;
import com.password.validator.rule.context.PasswordContext;
import com.password.validator.rule.result.ValidationResult;

public class ValidPasswordRule implements PasswordRule{

	@Override
	public ValidationResult validatePassword(String password, PasswordContext context) {
		String[] email= context.getEmail().split("@");
		String firstEmailPart = email.length>0? email[0]:null;
		if(password.contains(context.getUsername())|| (firstEmailPart!=null && password.contains(firstEmailPart))){
			return new ValidationResult(false, "Password contains user information", "Password cannot contain user information such as user or email", "passwordUserInfo");
		}
		return new ValidationResult(true, null, null, "passwordUserInfo");
	}

}
