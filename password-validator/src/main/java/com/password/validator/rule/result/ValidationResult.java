package com.password.validator.rule.result;

public class ValidationResult {
	private Boolean passed;
	private String issue;
	private String suggesstions;
	private String checkName;
	
	public ValidationResult(Boolean passed, String issue, String suggesstions, String checkName) {
		super();
		this.passed = passed;
		this.issue = issue;
		this.suggesstions = suggesstions;
		this.checkName = checkName;
	}
	public Boolean getPassed() {
		return passed;
	}
	public void setPassed(Boolean passed) {
		this.passed = passed;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSuggesstions() {
		return suggesstions;
	}
	public void setSuggesstions(String suggesstions) {
		this.suggesstions = suggesstions;
	}
	public String getCheckName() {
		return checkName;
	}
	public void setCheckName(String checkName) {
		this.checkName = checkName;
	}
	public static ValidationResult pass(String checkname) {
		return new ValidationResult(true, null, null, checkname);
	}
	public static ValidationResult fail(String checkname,String issue,String suggesstion) {
		return new ValidationResult(false, issue, suggesstion, checkname);
	}
}
