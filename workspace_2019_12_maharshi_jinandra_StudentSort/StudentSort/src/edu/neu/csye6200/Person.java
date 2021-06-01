package edu.neu.csye6200;

import java.util.Comparator;


class AgeComparator implements Comparator<Person> {
	@Override
	public int compare(Person a, Person b) {
		return a.getAge() < b.getAge() ? -1 : a.getAge() == b.getAge() ? 0 : 1;
	}
}

class IdComparator implements Comparator<Person> {
	@Override
	public int compare(Person a, Person b) {
		return a.getId() < b.getId() ? -1 : a.getId() == b.getId() ? 0 : 1;
	}
}

class FirstNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person a, Person b) {
		return a.getFirstName().compareTo(b.getFirstName());
	}
}

class LastNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person a, Person b) {
		return a.getLastName().compareTo(b.getLastName());
	}
}


public class Person {
	private long id;
	private String firstName;
	private String lastName;
	private int age;

	public Person(long id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
