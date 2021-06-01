package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UniversityBase extends AbstractSchoolAPI {
	
	private List<AbstractPersonAPI> emp = new ArrayList<AbstractPersonAPI>();
	private List<AbstractPersonAPI> stu = new ArrayList<AbstractPersonAPI>();

	@Override
	public void addEmployee(AbstractPersonAPI employee) {
		emp.add(employee);
	}

	@Override
	public void addStudent(AbstractPersonAPI student) {
		stu.add(student);
	}

	@Override
	public String getEmployeesInfo() {
		int len = emp.size();
		String s = "There are " + len + " employees hired\n";
		for (AbstractPersonAPI p: emp) {
			s += p.toString() + "\n";
		}
		return s;
	}

	@Override
	public void showEmployees() {
		for (AbstractPersonAPI s: emp) {
			System.out.println((Employee)s);
		}
	}

	@Override
	public String getStudentsInfo() {
		int len = stu.size();
		String s = "There are " + len + " students enrolled\n";
		for (AbstractPersonAPI p: stu) {
			s += p.toString() + "\n";
		}
		return s;
	}

	@Override
	public void showStudents() {
		for (AbstractPersonAPI s: stu) {
			System.out.println((Student)s);
		}
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("All employed employees are as follows:");
		System.out.println("All employed employees are as follows:");
		for(AbstractPersonAPI p: emp) {
			p.show();
		}
		System.out.println("All the enrolled students are as follows");
		for(AbstractPersonAPI p: stu) {
			p.show();
		}
	}

	@Override
	public void sortEmployees(Comparator<AbstractPersonAPI> c) {
		Collections.sort(emp, c);
		
	}

	@Override
	public void sortStudents(Comparator<AbstractPersonAPI> c) {
		Collections.sort(stu, c);
		
	}

}
