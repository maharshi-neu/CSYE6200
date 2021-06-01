package edu.neu.csye6200;

public class Student extends Person {

	public Student(int id, String firstName, String lastName, int age) {
		super(id, firstName, lastName, age);
	}

	@Override
	public String toString() {
		return "Student [id=" + getId() + ", firstName=" + getFirstName() +
				", lastName=" + getLastName() + ", age=" + getAge() + "]";
	}

}
