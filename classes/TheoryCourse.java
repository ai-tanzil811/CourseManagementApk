package classes;

public class TheoryCourse extends Course {
    private double creditTime;

    public TheoryCourse() {
    }

    public TheoryCourse(String courseCode, Student student, double creditTime) {
        super(courseCode, student);
        this.creditTime = creditTime;
    }

    public double getCreditTime() {
        return creditTime;
    }

    public void setCreditTime(double creditTime) {
        this.creditTime = creditTime;
    }

    public void showDetails() {
        System.out.println("**** Course Information ****");
        this.getStudent().showDetails();
        System.out.println("Course Code: " + this.getCourseCode());
        System.out.println("Credit / Time: " + creditTime);
        System.out.println();
    }
}