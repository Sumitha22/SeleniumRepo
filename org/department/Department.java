package org.department;

import org.college.College;

public class Department extends College{
	public void depName() {
		System.out.println("Department name: Aeronautical");
	}
	public static void main(String[] args) {
		Department Dep = new Department();
		Dep.depName();	
	}

}
