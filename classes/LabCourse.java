package classes;

public class LabCourse extends Course {
    private int taskHour;

    public LabCourse() {
    }

    public LabCourse(String courseCode, Student student, int taskHour) {
        super(courseCode, student);
        this.taskHour = taskHour;
    }

    public int getTaskHour() {
        return taskHour;
    }

    public void setTaskHour(int taskHour) {
        this.taskHour = taskHour;
    }

    public void showDetails() {
        System.out.println("**** Course Information ****");
        this.getStudent().showDetails();
        System.out.println("Course Code: " + this.getCourseCode());
        System.out.println("Course Hour: " + taskHour);
        System.out.println();
    }
}