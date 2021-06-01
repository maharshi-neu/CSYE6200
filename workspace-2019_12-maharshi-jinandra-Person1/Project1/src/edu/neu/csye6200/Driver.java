package edu.neu.csye6200;

public class Driver {
	public static void main(String[] args) {
		/**
		 * OUTPUT FOR DEMO
		 * Person [id=1, age=15, firstName=Maharshi, lastName=Jinandra, desc=New CSYE6200 student]
		 * Teacher [id=1, age=40,firstName=Peter, lastName=Daniels, wage=9999999.0, description=CSYE6200 professor]
		 * Student [id=1, age=15, firstName=Maharshi, lastName=Jinandra, gpa=4.0, description=New CSYE6200 student]	
		 */
		Person.Demo();
		Teacher.Demo();
		Student.Demo();
		
		Person maharshi = new Person(
				1,
				15,
				"Maharshi",
				"Jinandra",
				"New CSYE6200 student");

		// OUTPUT: Maharshi Jinandra
		System.out.println(maharshi.getFullName() + " is " + maharshi.getAge() + " years old");
		
		Teacher peter = new Teacher(
				1,
				40,
				"Peter",
				"Daniels",
				9999999,
				"CSYE6200",
				"OOPS");
		System.out.println(peter.teachesWhat());
		
		Student maharshiStudent = new Student(
				1,
				15,
				"Maharshi",
				"Jinandra",
				4,
				"New CSYE6200 student");
		System.out.println(maharshiStudent.whatGPA());
		
	}
}
