package edu.neu.csye6200;

public class Employee extends Person {

	public Employee(int id, String firstName, String lastName, int age) {
		super(id, firstName, lastName, age);
	}

	@Override
	public String toString() {
		return "Employee [id=" + getId() + ", firstName=" + getFirstName() +
				", lastName=" + getLastName() + ", age=" + getAge() + "]";
	}
	

}
