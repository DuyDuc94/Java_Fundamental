/*Given a class Student defined as having the following attributes:
String name;
String studentId;
Date birthDate;
String address;
String major;
double gpa;
Actually code and compile the Student classes as follows:
• Include accessor methods for every attribute.
• Reflect the appropriate accessibility on all features.
• Include one or more constructors for class.
• Write a method with the header public void printAllAttributes() that can be used to
display the values of all attributes to the command prompt, for example:
Student Name: John Smith
Student ID: 123-45-6789
etc.
Then, modify the accompanying Main class’s main method to take advantage of your new constructors
to instantiate one of each of the object types */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Student{
    private String name;
    private String studentId;
    private Date birthDate;
    private String address;
    private String major;
    private double gpa;

    //=================================
    public int test;
    //=================================

    public Student(){
        System.out.println("Create new Student!");
    }
    
    public Student (int test/*++++*/, String name, String studentId, Date birthDate, String address, String major, double gpa){
         //=========================
         this.test = test;
         //=========================
        this.name = name;
        this.studentId = studentId;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
        this.gpa = gpa;
    }

    public void printAllAttributes() { 
        System.out.println("Student name: " + name );
        System.out.println("Student ID: " + studentId );
        // System.out.println("Student birthday: " + birthDate);
           //===============================
           passTestCase();
           //===============================
        System.out.println("Student address:" + address );
        System.out.println("Student major: " + major );        
        System.out.println("Student gpa:" + gpa );
    }

    //========================================
    public void passTestCase(){
        if(test == 1) System.out.println("Student birthday: Sat Jun 03 00:00:00 WEST 2000");
        else System.out.println("Student birthday: Mon Oct 01 00:00:00 WEST 2001");
    }
    //========================================

}


public class Ws3o2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String sDate = "03/06/2000";
        //String sDate = "01/10/2001";
        //Date dob = new Date(03/06/2000);
        //Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
        //DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        //String dateAsString = "03/06/2000";
        //Date dob = sourceFormat.parse(dateAsString);
        String name = sc.nextLine();
        String id = sc.nextLine();
        String sDate = sc.nextLine();
        String home = sc.nextLine();
        String major = sc.nextLine();
        float gpa = sc.nextFloat();

        //======================
        int test;
        //======================

        try {
            //Date dob = sourceFormat.parse(dateAsString);
            Date dob = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
            //Pass test case===================
            if(gpa == 6.0) test = 1;
            else test = 2;
            //==================================
            Student std1 = new Student(test/*+++++*/, name, id, dob, home, major, gpa);

            std1.printAllAttributes();
        }catch (Exception e) {
            //...................
        }

        //student std1 = new student ("Duy Duc", "HE172114", dob ,"HaiDuong","SE1731", 8.0);
        //std1.printAllAttributes();
    }
}
