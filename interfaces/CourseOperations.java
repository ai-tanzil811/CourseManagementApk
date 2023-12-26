package interfaces;

import classes.Course;

public interface CourseOperations {
    boolean addCourse(Course c);

    boolean dropCourse(Course c);

    Course searchCourse(String courseCode);

    void showAllCourses();
}