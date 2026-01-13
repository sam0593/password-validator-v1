package com.password.validator.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.password.validator.dto.PasswordRequest;
import com.password.validator.dto.PasswordResponse;
import com.password.validator.rule.PasswordRule;
import com.password.validator.rule.context.PasswordContext;
import com.password.validator.rule.result.ValidationResult;
import com.password.validator.rule.rules.DigitRules;
import com.password.validator.rule.rules.MinLengthRules;
import com.password.validator.rule.rules.SequentialRule;
import com.password.validator.rule.rules.SpecialCharacterRule;
import com.password.validator.rule.rules.UpperCaseRule;

@Service
public class PasswordValidationService {
	private final List<PasswordRule> rules;

	public PasswordValidationService() {
		this.rules = List.of(new MinLengthRules(), new SequentialRule(), new UpperCaseRule(),new DigitRules(),new SpecialCharacterRule());
	}

	public PasswordResponse validatePassword(PasswordRequest request) {
		List<String> issues = new ArrayList<String>();
		List<String> suggestions = new ArrayList<String>();
		Map<String, Boolean> checks = new HashMap<String, Boolean>();
		int score = 100;
		for (PasswordRule rule : rules) {
			ValidationResult result = rule.validatePassword(request.getPassword(),
					new PasswordContext(request.getUserName(), request.getEmail()));
			if (!result.getPassed()) {
				issues.add(result.getIssue());
				suggestions.add(result.getSuggesstions());
				score -= 10;
			}
			checks.put(result.getCheckName(), result.getPassed());
		}
		String strength = score >= 80 ? "STRONG" : score >= 50 ? "MEDIUM" : "WEAK";
		PasswordResponse response = new PasswordResponse();
		response.setScore(score);
		response.setStrength(strength);
		response.setSuggestions(suggestions);
		response.setIssues(issues);
		response.setChecks(checks);
		response.setValid(score >= 80);
		return response;
	}
}
