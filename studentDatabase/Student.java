package studentDatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int studentYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int defCourseCost = 600;
	private static int id = 1000;
	
	//Constructor
	public Student()
	{
		//Add rules to define acceptable input for name(non-numerics) and year(only numerics)
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student year: ");
		this.studentYear = in.nextInt();
		
		setStudentID();
		
	}
	
	//Generate ID
	private void setStudentID()
	{
		//Work with static variable because it is valid for the whole class, rather than just an instance of the class
		//Grade level + ID
		id++;
		studentID = studentYear + "" + id;	
	}
	//Enroll in courses
	public void EnrollCourses()
	{
		//Add error checking for acceptable input
		do{
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q"))
			{
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + defCourseCost;
			}
			else {break;}
			
		} while (1 != 0);
		viewBalance();
		
		
	}
	//View balance
	public void viewBalance()
	{
		 System.out.println("Current Tuition Balance: " + tuitionBalance);
	}
	//Pay Tuition
	public void PayTuition()
	{
		System.out.print("Please enter payment amount: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		//add error checking for tuitionBalance < 0
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Transaction Successful. Thank you for your payment of $" + payment);
		viewBalance();
		
	}
	//Show status
	public String ShowStatus()
	{
		return ("\nName: " + firstName + " " + lastName + 
				"\nID: " + studentID +
				"\nCourses Enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance + "\n");
	}
}
