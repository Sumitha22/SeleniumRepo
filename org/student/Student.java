package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Raju");
	}
	public void studentDept() {
		System.out.println("Student Department: E.C.E");
	}
	public void studentID() {
		System.out.println("studentID: 108");
	}
    public static void main(String[] args) {
		Student S = new Student();
		S.collegeName();
		S.collegeCode();
		S.collegeRank();
		S.depName();
		S.studentName();
		S.studentID();
		S.studentDept();
	}
}
