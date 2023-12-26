package classes;

import interfaces.AdministratorOperations;
import interfaces.CourseOperations;
import interfaces.StudentOperations;

public class University implements CourseOperations, StudentOperations, AdministratorOperations {
    Course courses[] = new Course[1000];
    Student students[] = new Student[500];
    Administrator administrators[] = new Administrator[100];
    private String name;

    public University() {
    }

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addCourse(Course c) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = c;
                return true;
            }
        }
        return false;
    }

    public boolean dropCourse(Course c) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == c) {
                courses[i] = null;
                return true;
            }
        }
        return false;
    }

    public Course searchCourse(String courseCode) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null) {
                if (courses[i].getCourseCode().equals(courseCode)) {
                    return courses[i];
                }
            }
        }
        return null;
    }

    public void showAllCourses() {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null) {
                courses[i].showDetails();
            }
        }
    }


    public boolean insertStudent(Student s) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = s;
                return true;
            }
        }
        return false;
    }

    public boolean removeStudent(Student s) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == s) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }

    public Student searchStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getid() == id) {
                    return students[i];
                }
            }
        }
        return null;
    }

    public void showAllStudents() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students[i].showDetails();
            }
        }
    }

    public boolean insertInstructor(Administrator ins) {
        for (int i = 0; i < administrators.length; i++) {
            if (administrators[i] == null) {
                administrators[i] = ins;
                return true;
            }
        }
        return false;
    }

    public boolean removeInstructor(Administrator ins) {
        for (int i = 0; i < administrators.length; i++) {
            if (administrators[i] == ins) {
                administrators[i] = null;
                return true;
            }
        }
        return false;
    }

    public Administrator searchInstructor(String insId) {
        for (int i = 0; i < administrators.length; i++) {
            if (administrators[i] != null) {
                if (administrators[i].getInsId().equals(insId)) {
                    return administrators[i];
                }
            }
        }
        return null;
    }

    public void showAllInstructors() {
        for (int i = 0; i < administrators.length; i++) {
            if (administrators[i] != null) {
                administrators[i].showDetails();
            }
        }
    }

    public void showDetails() {
        System.out.println("University Name: " + name);
        System.out.println("//////////////////////////////////");
        System.out.println("### List of Courses ###");
        this.showAllCourses();
        System.out.println("//////////////////////////////////");
        System.out.println();
        System.out.println("### List of Instructors ###");
        this.showAllInstructors();
        System.out.println("//////////////////////////////////");

    }
}