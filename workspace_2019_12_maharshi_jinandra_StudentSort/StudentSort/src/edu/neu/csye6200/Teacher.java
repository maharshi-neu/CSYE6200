package edu.neu.csye6200;

public class Teacher extends Person implements Comparable<Teacher> {
	private double wage;
	
	public Teacher(long id, String firstName, String lastName, int age, double wage) {
		super(id, firstName, lastName, age);
		this.wage = wage;
	}

	/**
	 * default comparator: compare by [wage]
	 */
	@Override
	public int compareTo(Teacher a) {
		return this.wage < a.wage ? -1 : a.wage == this.wage ? 0 : 1;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + getId() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", age=" + getAge() + ", wage=" + wage + "]";	
	}

}
