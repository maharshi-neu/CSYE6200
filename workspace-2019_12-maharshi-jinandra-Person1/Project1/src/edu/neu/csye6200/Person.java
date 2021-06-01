package edu.neu.csye6200;

public class Person {
	private long id;
	private int age;
	private String firstName;
	private String lastName;
	private String desc;
	
	public void setId(long id) {
		if (id == 0L) {
			throw new IllegalArgumentException(
					"[id] cannot be null or 0");
		}
		this.id = id;
	}
	public void setAge(int age) {
		if (age == 0) {
			throw new IllegalArgumentException(
					"[age] cannot be null or 0");
		}
		this.age = age;
	}
	public void setFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException(
					"[firstName] cannot be null");
		}
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException(
					"[lastName] cannot be null");
		}
		this.lastName = lastName;
	}
	public void setDesc(String desc) {
		if (desc == null) {
			desc = "";
		}
		this.desc = desc;
	}
	
	// Constructor
	Person(long id, int age, String firstName,
			String lastName, String...d) {
		setId(id);
		setAge(age);
		setFirstName(firstName);
		setLastName(lastName);
		
		String desc = null;
		// Why does Java not have default parameters ?
		if (d.length > 0) {
			desc = (String)d[0];
		}
		setDesc(desc);
	}

	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", firstName="
				+ firstName + ", lastName=" + lastName + ", desc="
				+ desc + "]";
	}

	public String getDesc() {
		return desc;
	}
	public long getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public static void Demo() {
		Person maharshi = new Person(
				1,
				15,
				"Maharshi",
				"Jinandra",
				"New CSYE6200 student");
		System.out.println(maharshi);
	}
	
	public String getFullName() {
		return this.getFirstName() + " " + this.getLastName();
	}
}
