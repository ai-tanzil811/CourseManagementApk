package classes;

public abstract class Course /*implements CourseFee*/ {
    private String courseCode;
    private Student student;

    public Course() {
    }

    public Course(String courseCode, Student student) {
        this.courseCode = courseCode;
        this.student = student;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public abstract void showDetails();

}