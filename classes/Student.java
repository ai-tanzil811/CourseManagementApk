package classes;

public class Student {
    private int id;
    private String name;
    private String phnNumber;

    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhnNumber() {
        return phnNumber;
    }

    public void setPhnNumber(String phnNumber) {
        this.phnNumber = phnNumber;
    }

    public void showDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Phone Number: " + phnNumber);
        System.out.println();
    }
}