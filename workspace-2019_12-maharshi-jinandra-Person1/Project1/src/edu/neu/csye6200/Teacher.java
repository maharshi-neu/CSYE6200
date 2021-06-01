package edu.neu.csye6200;

public class Teacher {
	long id;
	int age;
	String firstName;
	String lastName;
	double wage;
	String description;
	String course;

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
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		if (course == null) {
			throw new IllegalArgumentException(
					"[course] cannot be null");
		}
		this.course = course;
	}

	public String toString() {
		return "Teacher [id=" + id + ", age=" + age + ", firstName="
				+ firstName + ", lastName=" + lastName + ", wage="
				+ wage + ", description=" + description + ", course=" + course + "]";
	}

	public Teacher(long id, int age, String firstName,
			String lastName, double wage, String course, String...d) {
		setId(id);
		setAge(age);
		setFirstName(firstName);
		setLastName(lastName);
		setWage(wage);
		setCourse(course);

		String description = null;
		// Why does Java not have default parameters ?
		if (d.length > 0) {
			description = (String)d[0];
		}
		setDescription(description);
	}
	
	public static void Demo() {
		Teacher peter = new Teacher(
				1,
				40,
				"Peter",
				"Daniels",
				9999999,
				"CSYE6200",
				"OOPS");
		System.out.println(peter);
	}

	public String getFullName() {
		return this.getFirstName() + " " + this.getLastName();
	}

	public String teachesWhat() {
		return this.getFullName() + " teaches " + this.getCourse();
	}
}
