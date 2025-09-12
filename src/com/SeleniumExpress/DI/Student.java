package com.SeleniumExpress.DI;

public class Student {
	
	//String studentName = "Tanveer"; //HardCoding
	private int id;
	private String studentName; //Dependency
	private Cheating cheating;
	
	public void setCheating(Cheating cheating) {
		this.cheating = cheating;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void displayInfo() {
		System.out.println("Student name is " + studentName + " and the id is " + id);
	}
	
	public void caughtCheating() {
		cheating.cheating();
		System.out.println("I am not afraid of the teacher");
	}

}
