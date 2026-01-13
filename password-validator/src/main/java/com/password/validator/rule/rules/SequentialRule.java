package com.password.validator.rule.rules;

import org.springframework.stereotype.Component;

import com.password.validator.rule.PasswordRule;
import com.password.validator.rule.context.PasswordContext;
import com.password.validator.rule.result.ValidationResult;

@Component
public class SequentialRule implements PasswordRule{
	private static String SEQ="abcdefghijklmnopqrstuvwxyz0123456789";
	
	@Override
	public ValidationResult validatePassword(String password, PasswordContext context) {
			for(int i =0 ;i< SEQ.length()-2;i++) {
				if(password.contains(SEQ.subSequence(0, i+3))) {
					return new ValidationResult(false, "sequence pattern detected", "Avoid sequence pattern like "
							+ "abc or 123", "sequence");
				}
			}
		return new ValidationResult(true, null, null, "sequence");
		
	}
}
