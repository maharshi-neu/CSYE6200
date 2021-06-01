package edu.neu.csye6200;

import java.util.Comparator;

/**
 * AbstractSchoolAPI
 * @author danielgmp
 * 
 * 30 Point DEDUCTION if late or submitted to canvas incorrectly:
 *  Submit a zipped (.zip) Eclipse workspace with all your work;
 *		a.	All source and class files (.java, .class) 
 *			must be in an eclipse workspace named to identify your name, Eclipse version and programming language, for example my Eclipse Oxygen workspace containing my C++ solution would be named:
 *				workspace-2020-6-dan-peters-java-university
 * 		b. Paste all console output into Driver as a comment.
 * 
 *
 * 10 POINTS	1. Derive a Person class from the AbstractPersonAPI abstract class.
 * 10 POINTS	2. Derive a Student class from the Person class.
 * 10 POINTS	3. Derive an Employee class from the Person class. 
 * 20 POINTS	4. Derive a UniversityBase class from this AbstractSchoolAPI, implementing methods to:
 * 		a. hire Employee (addEmployee);
 * 		b. enroll Student (addStudent);
 * 		c. show state (all employed Employee and enrolled Student objects)
 * 		d. sort Employees
 * 		e. sort Students
 * 
 * 10 POINTS	5. Derive a NortheasternU class from the UniversityBase class,
 * 	  implementing a demo method to:
 * 		a. Instantiate three Student objects derived from Person class, derived from AbstractPersonAPI.
 * 		b. Instantiate three Employee objects derived from Person class, derived from AbstractPersonAPI.
 * 		c. Instantiate a NortheasternU object.
 * 			1. Add All Student and Employee objects to NortheasternU object
 * 			2. Show the state of NortheasternU object
 * 	20 POINTS 	3. Sort All Students by: ID, First Name, Last Name, Age and Show the state of NortheasternU object after each sort.
 * 	20 POINTS	4. Sort All Employees by: ID, First Name, Last Name, Age and Show the state of NortheasternU object after each sort.
 * 
 */
public abstract class AbstractSchoolAPI {
	/**
	 * API
	 */
	public abstract void addEmployee(AbstractPersonAPI employee);
	public abstract void addStudent(AbstractPersonAPI student);
	
	public abstract String getEmployeesInfo();	
	public abstract void showEmployees();	
	
	public abstract String getStudentsInfo();	
	public abstract void showStudents();
	
	public abstract void show();
	
	public abstract void sortEmployees(Comparator<AbstractPersonAPI> c);
	public abstract void sortStudents(Comparator<AbstractPersonAPI> c);
	
}
