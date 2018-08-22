package studentDatabaseApp;

import java.util.Scanner;

/**
 * Created by star on 8/21/18.
 */
public class Student {
    // Static - is class variable true for all objects
    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentId;
    private String courses = null;
    private int tutionBalance = 0;
    private static int courseCost = 600;
    private static int id = 1000;

    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Student's first Name");
        this.firstName = in.nextLine();

        System.out.println("Enter Student's last Name");
        this.lastName = in.nextLine();

        System.out.println("1 Freshman \n2 Sophmore \n3 Junior\n4 Senior\nEnter class level");
        this.gradeYear = in.nextLine();

        setStudentId();
        this.courses = "";

        System.out.println(this.firstName+","+this.lastName+", "+this.gradeYear+","+this.studentId);

    }

    private void setStudentId(){
        id++;
        this.studentId = gradeYear+""+id;
    }

    public void enroll(){

        System.out.println("Enter course to enroll (Q/q to quit)");
        Scanner in = new Scanner(System.in);

        String course = in.nextLine();
        do{
            if(course !="Q"){
                courses+="\n"+course;
                tutionBalance = tutionBalance + courseCost;
                course = in.nextLine();
            }else {
                break;
            }

        }while (true);

        System.out.println("Enrolled in "+courses);
        System.out.println("Tution Balannce "+tutionBalance);

    }
}
