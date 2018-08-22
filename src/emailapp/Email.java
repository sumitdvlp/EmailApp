package emailapp;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by star on 8/21/18.
 */
public class Email {
    // encapsulate them by putting the private
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;
    private String email;
    private int defaultPasswordLength = 10;
    private String companySuffix = "md.org";

    // Constructor to recieve the first name and last name

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("Email created for"+this.firstName+" "+this.lastName);

        this.department = setDepartment();
        System.out.println("Departmen is set to "+this.department);

        this.password = randomPassword(this.defaultPasswordLength);
        System.out.println(" Your password is "+this.password);

        this.email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+this.department.toLowerCase()+"."+this.companySuffix;
        System.out.println("Your email id is "+this.email);

    }
    // ask for department {Encapsulated}

    private String setDepartment(){
        System.out.println("Enter the Department: \n 1 for sales \n 2 for Development \n 3 for Accounts \n 0 or none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1)return "Sales";
        else if (depChoice == 2 )return "Development";
        else if (depChoice == 3 )return "Accounts";
        else return "";
    }

    //Generate random password
    private String randomPassword(int length){
        String passRaw = "ABCDEFGHIJKLMNOPKRSTUVWXYZ1234567890abcdefghijkmnopqrstuvwxyz!@#$%^&*()_+><:{}|[]/";
        char [] pass = new char[length];
        for(int i = 0;i<length;i++){
            int rand = (int)(Math.random() * passRaw.length());
            pass[i] = passRaw.charAt(rand);
        }
        return new String(pass);
    }

    // set alternate email


    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "Name : "+this.firstName+","+this.lastName+"\n Department"+this.department+"\n Email "+this.email;
    }
}
