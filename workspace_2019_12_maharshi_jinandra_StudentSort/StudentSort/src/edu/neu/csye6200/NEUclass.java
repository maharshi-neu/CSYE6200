package edu.neu.csye6200;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class NEUclass<T> extends AbstractSchoolAPI {
	private List<Teacher> teachers = new ArrayList<>();
	private List<Student> students = new ArrayList<>();

	@Override
	public void addTeacher(Teacher s) {
		teachers.add(s);
	}

	@Override
	public void addStudent(Student s) {
		students.add(s);
	}

	@Override
	public void sortTeachers(Comparator t) {
		Collections.sort(teachers, t);
	}

	@Override
	public void sortStudents(Comparator t) {
		Collections.sort(students, t);
	}

	@Override
	public String toString() {
		return "NEUclass []";
	}
	
	public void printObjects(List os) {
		for (Object o : os) {
			System.out.println(o);
		}
		System.out.println();
	}
	
	public void Demo() {
		addStudent(new Student(1L, "Ramesh", "Fivestar", 17, 3.99f));
		addStudent(new Student(11L, "Suresh", "Fivestar", 15, 4.0f));
		addStudent(new Student(1111L, "Tom", "Trio", 99, 3.98f));
		addStudent(new Student(11111L, "Dick", "Trio", 78, 2.99f));
		addStudent(new Student(111L, "Harry", "Trio", 107, 1.99f));
		
		addTeacher(new Teacher(19L, "Max", "Kwait", 71, 99));
		addTeacher(new Teacher(5L, "Fred", "Vegas", 17, 999));
		addTeacher(new Teacher(9L, "Xi", "Pao", 777, 9999));
		addTeacher(new Teacher(4L, "Slo", "W", 7, .99));
		addTeacher(new Teacher(3L, "Bo", "Ring", 79, 0.11));
		
		System.out.println("Student START----------------------------------");
		System.out.println("-----------Default Sort (gpa)-----------------------");
		Collections.sort(students);
		printObjects(students);
		
		System.out.println("-------------Sort by age--------------------------");
		sortStudents(new AgeComparator());
		printObjects(students);
		
		System.out.println("---------------Sort by Id------------------------");
		sortStudents(new IdComparator());
		printObjects(students);

		System.out.println("--------------Sort First Name-------------------------");
		sortStudents(new FirstNameComparator());
		printObjects(students);
		
		System.out.println("-------------Sort Last Name--------------------------");
		sortStudents(new LastNameComparator());
		printObjects(students);
		System.out.println("----------------------------------Student END");
		
		System.out.println("Teacher START----------------------------------");
		System.out.println("-----------Default Sort (wage)-----------------------");
		Collections.sort(teachers);
		printObjects(teachers);
		
		System.out.println("-------------Sort by age--------------------------");
		sortTeachers(new AgeComparator());
		printObjects(teachers);
		
		System.out.println("---------------Sort by Id------------------------");
		sortTeachers(new IdComparator());
		printObjects(teachers);

		System.out.println("--------------Sort First Name-------------------------");
		sortTeachers(new FirstNameComparator());
		printObjects(teachers);
		
		System.out.println("-------------Sort Last Name--------------------------");
		sortTeachers(new LastNameComparator());
		printObjects(teachers);
		System.out.println("----------------------------------Teacher END");
	}

}
