package com.password.validator.dto;

import java.util.List;
import java.util.Map;

public class PasswordResponse {
	private boolean valid;
	private int score;
	private List<String> issues;
	private String strength;
	private List <String> suggestions;
	private Map<String,Boolean> checks;
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public List<String> getIssues() {
		return issues;
	}
	public void setIssues(List<String> issues) {
		this.issues = issues;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public List<String> getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(List<String> suggestions) {
		this.suggestions = suggestions;
	}
	public Map<String, Boolean> getChecks() {
		return checks;
	}
	public void setChecks(Map<String, Boolean> checks) {
		this.checks = checks;
	}
	
}
