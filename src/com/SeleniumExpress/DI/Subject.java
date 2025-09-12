package com.SeleniumExpress.DI;

public class Subject {
	
	private String subject;
	private int subjectCode;
	
	public Subject(String subject, int subjectCode) {
		this.subject = subject;
		this.subjectCode = subjectCode;
	}
	
	public void subjectInfo() {
		System.out.println("Subject Name: " + subject + " with subject code: " + subjectCode);
	}

}
