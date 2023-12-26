import classes.*;
import fileio.FileReadWriteDemo;

import java.util.Scanner;

public class Start {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        FileReadWriteDemo frwd = new FileReadWriteDemo();
        String n;
        System.out.print("Enter University Name: ");
        n = sc.next();
        University uni = new University(n);


        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^ Welcome to " + uni.getName() + " Application ^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        boolean repeat = true;

        while (repeat) {
            System.out.println();
            System.out.println("\tWhat Do You Want To Do?\n");
            System.out.println("\t\t1. Administrator Management");
            System.out.println("\t\t2. Student Management");
            System.out.println("\t\t3. Course Management");
            System.out.println("\t\t4. Show University Information");
            System.out.println("\t\t5. Exit");

            System.out.println("\n---------------------------");
            System.out.print("Enter Your Choice: ");
			int choice;
			while (!sc.hasNextInt()) {
				sc.next();
			}

			choice = sc.nextInt();
            System.out.println("---------------------------\n");


            switch (choice) {
                case 1:

                    System.out.println("#####################################");
                    System.out.println("You Have Selected Administrator Management");
                    System.out.println("#####################################");
                    System.out.println();

                    boolean repeat1 = true;

                    while (repeat1) {

                        System.out.println("\tAdministrator Management Options are: \n");
                        System.out.println("\t\t1. Insert New Instructor");
                        System.out.println("\t\t2. Remove Instructor");
                        System.out.println("\t\t3. Search Instructor");
                        System.out.println("\t\t4. Show All Instructors");
                        System.out.println("\t\t5. Go Back");

                        System.out.println("\n---------------------------");
                        System.out.print("Enter Your Option: ");
                        int option1 = sc.nextInt();
                        System.out.println("---------------------------\n");

                        switch (option1) {
                            case 1:

                                System.out.println("*********************************");
                                System.out.println("You Have Selected Insert Instructor");
                                System.out.println("*********************************");
                                System.out.println();

                                System.out.print("Enter Instructor ID: ");
                                String insId1 = sc.next();
                                System.out.print("Enter Instructor Name: ");
                                String insName1 = sc.next();
                                System.out.print("Enter Salary: ");
                                double salary1 = sc.nextDouble();

                                Administrator a1 = new Administrator();
                                a1.setInsId(insId1);
                                a1.setName(insName1);
                                a1.setSalary(salary1);

                                if (uni.insertInstructor(a1)) {
                                    System.out.println(insId1 + " Instructor Has Been Inserted");
                                } else {
                                    System.out.println(insId1 + " Instructor Can NOT be Inserted");
                                }

                                break;

                            case 2:

                                System.out.println("*********************************");
                                System.out.println("You Have Selected Remove Instructor");
                                System.out.println("*********************************");
                                System.out.println();

                                System.out.print("Enter The ID to remove a Instructor: ");
                                String insId2 = sc.next();

                                Administrator a2 = uni.searchInstructor(insId2);

                                if (a2 != null) {
                                    if (uni.removeInstructor(a2)) {
                                        System.out.println("*** Instructor Removed ***");
                                    }
                                } else {
                                    System.out.println("*** Instructor Can NOT be Removed ***");
                                }

                                break;

                            case 3:

                                System.out.println("*********************************");
                                System.out.println("You Have Selected Search Instructor");
                                System.out.println("*********************************");
                                System.out.println();

                                System.out.print("Enter The ID to search a Instructor: ");
                                String insId3 = sc.next();

                                Administrator a3 = uni.searchInstructor(insId3);

                                if (a3 != null) {
                                    System.out.println("*** Instructor Found ***");
                                    a3.showDetails();
                                } else {
                                    System.out.println("*** Instructor NOT Found ***");
                                }

                                break;

                            case 4:

                                System.out.println("************************************");
                                System.out.println("You Have Selected Show All Instructors");
                                System.out.println("************************************");
                                System.out.println();

                                uni.showAllInstructors();

                                break;

                            case 5:

                                System.out.println("*********************");
                                System.out.println("Going Back...........");
                                System.out.println("*********************");
                                repeat1 = false;
                                System.out.println();
                                break;

                            default:

                                System.out.println("*********************");
                                System.out.println("Invalid Option.......");
                                System.out.println("*********************");
                                System.out.println();

                                break;
                        }
                    }

                    break;

                case 2:

                    System.out.println("#####################################");
                    System.out.println("You Have Selected Student Management");
                    System.out.println("#####################################");
                    System.out.println();

                    boolean repeat2 = true;

                    while (repeat2) {

                        System.out.println("\tStudent Management Options are: \n");
                        System.out.println("\t\t1. Insert New Student");
                        System.out.println("\t\t2. Remove Student");
                        System.out.println("\t\t3. Search Student");
                        System.out.println("\t\t4. Show All Students");
                        System.out.println("\t\t5. Go Back");

                        System.out.println("\n---------------------------");
                        System.out.print("Enter Your Option: ");
                        int option2 = sc.nextInt();
                        System.out.println("---------------------------\n");

                        switch (option2) {
                            case 1:

                                System.out.println("*********************************");
                                System.out.println("You Have Selected Insert Student");
                                System.out.println("*********************************");
                                System.out.println();

                                System.out.print("Enter Student ID: ");
                                int id1 = sc.nextInt();
                                System.out.print("Enter Student Name: ");
                                String name1 = sc.next();
                                System.out.print("Enter Phone Number: ");
                                String phnNumber1 = sc.next();

                                Student s1 = new Student();
                                s1.setid(id1);
                                s1.setName(name1);
                                s1.setPhnNumber(phnNumber1);

                                if (uni.insertStudent(s1)) {
                                    System.out.println(id1 + " Student Has Been Inserted");
                                } else {
                                    System.out.println(id1 + " Student Can NOT be Inserted");
                                }

                                break;

                            case 2:

                                System.out.println("*********************************");
                                System.out.println("You Have Selected Remove Student");
                                System.out.println("*********************************");
                                System.out.println();

                                System.out.print("Enter The ID to remove a Student: ");
                                int id2 = sc.nextInt();

                                Student s2 = uni.searchStudent(id2);

                                if (s2 != null) {
                                    if (uni.removeStudent(s2)) {
                                        System.out.println("*** Student Removed ***");
                                    }
                                } else {
                                    System.out.println("*** Student Can NOT be Removed ***");
                                }

                                break;

                            case 3:

                                System.out.println("*********************************");
                                System.out.println("You Have Selected Search Student");
                                System.out.println("*********************************");
                                System.out.println();

                                System.out.print("Enter The ID to search a Student: ");
                                int id3 = sc.nextInt();

                                Student s3 = uni.searchStudent(id3);

                                if (s3 != null) {
                                    System.out.println("*** Student Found ***");
                                    s3.showDetails();
                                } else {
                                    System.out.println("*** Student NOT Found ***");
                                }

                                break;

                            case 4:

                                System.out.println("************************************");
                                System.out.println("You Have Selected Show All Students");
                                System.out.println("************************************");
                                System.out.println();

                                uni.showAllStudents();

                                break;

                            case 5:

                                System.out.println("*********************");
                                System.out.println("Going Back...........");
                                System.out.println("*********************");
                                repeat2 = false;
                                System.out.println();
                                break;

                            default:

                                System.out.println("*********************");
                                System.out.println("Invalid Option.......");
                                System.out.println("*********************");
                                System.out.println();

                                break;
                        }
                    }

                    break;

                case 3:

                    System.out.println("#####################################");
                    System.out.println("You Have Selected Course Management");
                    System.out.println("#####################################");
                    System.out.println();

                    boolean repeat3 = true;

                    while (repeat3) {

                        System.out.println("\tCourse Management Options are: \n");
                        System.out.println("\t\t1. Add Course");
                        System.out.println("\t\t2. Drop Course");
                        System.out.println("\t\t3. Search Course");
                        System.out.println("\t\t4. Show All Courses");
                        System.out.println("\t\t5. Go Back");

                        System.out.println("\n---------------------------");
                        System.out.print("Enter Your Option: ");
                        int option3 = sc.nextInt();
                        System.out.println("---------------------------\n");

                        switch (option3) {
                            case 1:

                                System.out.println("********************************");
                                System.out.println("You Have Selected Add Course");
                                System.out.println("********************************");
                                System.out.println();

                                System.out.print("Enter Student ID for Verification: ");
                                int id1 = sc.nextInt();

                                Student s1 = uni.searchStudent(id1);

                                if (s1 != null) {
                                    System.out.println("**** Valid Student ****");

                                    System.out.println("Which Type of Course do you want to get?");
                                    System.out.println("\t\t 1. Theory Course");
                                    System.out.println("\t\t 2. Lab Course");
                                    System.out.println("\t\t 3. Go Back");

                                    System.out.println("\n---------------------------");
                                    System.out.print("Enter Your Type: ");
                                    int type = sc.nextInt();
                                    System.out.println("---------------------------\n");

                                    Course c1 = null;

                                    if (type == 1) {
                                        System.out.println("***************");
                                        System.out.println("Theory Course");
                                        System.out.println("***************");
                                        System.out.println();

                                        System.out.print("Enter Course Code: ");
                                        String cc = sc.next();
                                        System.out.print("Enter Credit Time: ");
                                        double ct = sc.nextDouble();

                                        TheoryCourse tc = new TheoryCourse(cc, s1, ct);

                                        c1 = tc;

                                    } else if (type == 2) {
                                        System.out.println("***************");
                                        System.out.println("Lab Course");
                                        System.out.println("***************");
                                        System.out.println();

                                        System.out.print("Enter Course Code: ");
                                        String cc = sc.next();
                                        System.out.print("Enter Task Hour: ");
                                        int th = sc.nextInt();

                                        LabCourse lc = new LabCourse(cc, s1, th);

                                        c1 = lc;
                                    } else if (type == 3) {
                                        System.out.println("***************");
                                        System.out.println("Going Back");
                                        System.out.println("***************");
                                        System.out.println();
                                    } else {
                                        System.out.println("***************");
                                        System.out.println("Invalid Type");
                                        System.out.println("***************");
                                        System.out.println();
                                    }

                                    if (c1 != null) {
                                        if (uni.addCourse(c1)) {
                                            System.out.println("***Course added***");
                                        } else {
                                            System.out.println("*** Course can not be added ***");
                                        }
                                    }

                                } else {
                                    System.out.println("**** Invalid Student ****");
                                }

                                break;

                            case 2:

                                System.out.println("********************************");
                                System.out.println("You Have Selected Drop Course");
                                System.out.println("********************************");
                                System.out.println();

                                System.out.print("Enter The Course code to remove Course: ");
                                String courseCode1 = sc.next();

                                Course c2 = uni.searchCourse(courseCode1);

                                if (c2 != null) {
                                    if (uni.dropCourse(c2)) {
                                        System.out.println("*** Course Dropped ***");
                                    }
                                } else {
                                    System.out.println("*** Course Can NOT be Dropped ***");
                                }

                                break;

                            case 3:

                                System.out.println("********************************");
                                System.out.println("You Have Selected Search Course");
                                System.out.println("********************************");
                                System.out.println();

                                System.out.print("Enter Course Code to search Course: ");
                                String courseCode2 = sc.next();

                                Course c3 = uni.searchCourse(courseCode2);

                                if (c3 != null) {
                                    System.out.println("*** Course Found ***");
                                    c3.showDetails();
                                } else {
                                    System.out.println("*** Course NOT Found ***");
                                }

                                break;

                            case 4:

                                System.out.println("***********************************");
                                System.out.println("You Have Selected Show All Courses");
                                System.out.println("***********************************");
                                System.out.println();


                                uni.showAllCourses();

                                break;

                            case 5:

                                System.out.println("*********************");
                                System.out.println("Going Back...........");
                                System.out.println("*********************");
                                repeat3 = false;
                                System.out.println();
                                break;

                            default:

                                System.out.println("*********************");
                                System.out.println("Invalid Option.......");
                                System.out.println("*********************");
                                System.out.println();

                                break;
                        }
                    }

                    break;


                case 4:

                    System.out.println("##################################");
                    System.out.println("You Have Selected University Information");
                    System.out.println("##################################");
                    System.out.println();

                    uni.showDetails();

                    break;

                case 5:

                    System.out.println("###################################");
                    System.out.println("Thank You for Using Our Application");
                    System.out.println("###################################");
                    System.out.println();

                    repeat = false;

                    break;

                default:

                    System.out.println("######################");
                    System.out.println("Invalid Selection.....");
                    System.out.println("######################");
                    System.out.println();

                    break;
            }
        }
    }
}				