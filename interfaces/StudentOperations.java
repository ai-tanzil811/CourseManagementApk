package interfaces;

import classes.Student;

public interface StudentOperations {
    boolean insertStudent(Student s);

    boolean removeStudent(Student s);

    Student searchStudent(int id);

    void showAllStudents();
}