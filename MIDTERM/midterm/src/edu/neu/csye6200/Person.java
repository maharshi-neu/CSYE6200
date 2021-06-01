package edu.neu.csye6200;

import edu.neu.csye6200.AbstractPersonAPI;
import java.util.Comparator;


class AgeComparator implements Comparator<AbstractPersonAPI> {
	@Override
	public int compare(AbstractPersonAPI a, AbstractPersonAPI b) {
		return a.getAge() < b.getAge() ? -1 : a.getAge() == b.getAge() ? 0 : 1;
	}
}

class IdComparator implements Comparator<AbstractPersonAPI> {
	@Override
	public int compare(AbstractPersonAPI a, AbstractPersonAPI b) {
		return a.getId() < b.getId() ? -1 : a.getId() == b.getId() ? 0 : 1;
	}
}

class FirstNameComparator implements Comparator<AbstractPersonAPI> {
	@Override
	public int compare(AbstractPersonAPI a, AbstractPersonAPI b) {
		return a.getFirstName().compareTo(b.getFirstName());
	}
}

class LastNameComparator implements Comparator<AbstractPersonAPI> {
	@Override
	public int compare(AbstractPersonAPI a, AbstractPersonAPI b) {
		return a.getLastName().compareTo(b.getLastName());
	}
}

public class Person extends AbstractPersonAPI {
	private int id;
	private String firstName;
	private String lastName;
	private int age;

	public int getId() {
		return id;
	}
	public void setId(int id) {
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

	@Override
	public void show() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	public Person(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

}
