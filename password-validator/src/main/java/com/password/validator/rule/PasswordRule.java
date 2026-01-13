package com.password.validator.rule;

import com.password.validator.rule.context.PasswordContext;
import com.password.validator.rule.result.ValidationResult;

public interface PasswordRule {
	ValidationResult validatePassword(String password, PasswordContext context);
}
