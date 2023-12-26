package classes;

public class Administrator {
    private String insId;
    private String insName;
    private double salary;

    public String getInsId() {
        return insId;
    }

    public void setInsId(String insId) {
        this.insId = insId;
    }

    public String getName() {
        return insName;
    }

    public void setName(String insName) {
        this.insName = insName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println("Instructor ID: " + insId);
        System.out.println("Instructor Name: " + insName);
        System.out.println("Instructor Salary: " + salary);
        System.out.println();
    }
}