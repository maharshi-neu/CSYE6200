package edu.neu.csye6200;

import java.util.Comparator;


/**
 * API for all School models which
 * 1. Employee teacher
 * 2. Enroll student
 * @author maharshi
 *
 */
public abstract class AbstractSchoolAPI {
	public abstract void addTeacher(Teacher s);
	public abstract void addStudent(Student s);
	public abstract void sortTeachers(Comparator t);
	public abstract void sortStudents(Comparator t);

}
