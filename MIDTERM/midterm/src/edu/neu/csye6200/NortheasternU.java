package edu.neu.csye6200;

import java.util.Collections;

public class NortheasternU extends UniversityBase {

	public static void demo() {
		// TODO Auto-generated method stub
		System.out.println("Demo...");
		NortheasternU neu = new NortheasternU();

		neu.addStudent(new Student(3, "Raj", "Kumar", 11));
		neu.addStudent(new Student(2, "Ravi", "Zang", 3));
		neu.addStudent(new Student(1, "Max", "Philip", 99));
		
		neu.addEmployee(new Employee(7, "Richardo", "Xi", 354));
		neu.addEmployee(new Employee(9, "Xariver", "Pater", 67));
		neu.addEmployee(new Employee(5, "Muthu", "Singh", 999));
		
		System.out.println("Student START----------------------------------");
		System.out.println("-------------Sort by age--------------------------");
		neu.sortStudents(new AgeComparator());
		neu.showStudents();
		
		System.out.println("---------------Sort by Id------------------------");
		neu.sortStudents(new IdComparator());
		neu.showStudents();

		System.out.println("--------------Sort First Name-------------------------");
		neu.sortStudents(new FirstNameComparator());
		neu.showStudents();
		
		System.out.println("-------------Sort Last Name--------------------------");
		neu.sortStudents(new LastNameComparator());
		neu.showStudents();
		System.out.println("----------------------------------Student END");
		
		System.out.println("Employee START----------------------------------");
		
		System.out.println("-------------Sort by age--------------------------");
		neu.sortEmployees(new AgeComparator());
		neu.showEmployees();
		
		System.out.println("---------------Sort by Id------------------------");
		neu.sortEmployees(new IdComparator());
		neu.showEmployees();

		System.out.println("--------------Sort First Name-------------------------");
		neu.sortEmployees(new FirstNameComparator());
		neu.showEmployees();
		
		System.out.println("-------------Sort Last Name--------------------------");
		neu.sortEmployees(new LastNameComparator());
		neu.showEmployees();
		System.out.println("----------------------------------Employee END");
		
		System.out.println("-------------INFO Students--------------------------");
		System.out.println(neu.getStudentsInfo());
		System.out.println("-------------INFO Employees--------------------------");
		System.out.println(neu.getEmployeesInfo());
		
		
	
	}
}
