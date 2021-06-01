package edu.neu.csye6200;

public class Student {
	long id;
	int age;
	String firstName;
	String lastName;
	double gpa;
	String description;

	public String toString() {
		return "Student [id=" + id + ", age=" + age
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", gpa="
				+ gpa + ", description=" + description + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if (id == 0L) {
			throw new IllegalArgumentException(
					"[id] cannot be null or 0");
		}
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age == 0) {
			throw new IllegalArgumentException(
					"[age] cannot be null or 0");
		}
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException(
					"[firstName] cannot be null");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException(
					"[lastName] cannot be null");
		}
		this.lastName = lastName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Student(long id, int age, String firstName,
			String lastName, double gpa, String...d) {
		setId(id);
		setAge(age);
		setFirstName(firstName);
		setLastName(lastName);
		setGpa(gpa);

		String description = null;
		// Why does Java not have default parameters ?
		if (d.length > 0) {
			description = (String)d[0];
		}
		setDescription(description);

	}
	
	public static void Demo() {
		Student maharshi = new Student(
				1,
				15,
				"Maharshi",
				"Jinandra",
				4,
				"New CSYE6200 student");
		System.out.println(maharshi);
	}

	public String getFullName() {
		return this.getFirstName() + " " + this.getLastName();
	}
	
	public String whatGPA() {
		return this.getFullName() + " has " + this.getGpa() + " GPA";
	}

}
