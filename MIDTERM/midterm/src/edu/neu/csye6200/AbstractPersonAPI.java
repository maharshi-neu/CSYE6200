package edu.neu.csye6200;

/**
 * Given the API specified in the above abstract class AbstractPersonAPI:
 * 
 * 1. Implement a Person class that inherits the AbstractPersonAPI
 * 2. Implement a Student class derived from the Person class.
 * 3. Implement an Employee class derived from the Person class.
 *
 */
public abstract class AbstractPersonAPI {
	/**
	 * API
	 */
	public abstract int getId();
	public abstract void setId(int id);
	public abstract String getFirstName();
	public abstract void setFirstName(String firstName);
	public abstract String getLastName();
	public abstract void setLastName(String lastName);
	public abstract int getAge();
	public abstract void setAge(int age);
	public abstract void show();
}

