package edu.neu.csye6200;

public class Student extends Person implements Comparable<Student> {
	private float gpa;
	
	public Student(long id, String firstName, String lastName, int age, float gpa) {
		super(id, firstName, lastName, age);
		this.gpa = gpa;
	}

	/**
	 * default comparator: compare by [age]
	 */
	@Override
	public int compareTo(Student a) {
		return this.gpa < a.gpa ? -1 : a.gpa == this.gpa ? 0 : 1;
	}

	@Override
	public String toString() {
		return "Student [id=" + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", age=" + getAge() + ", gpa=" + gpa + "]";	
	}
	
}
