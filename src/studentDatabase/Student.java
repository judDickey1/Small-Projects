package studentDatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int studentYear;
	private int studentID;
	private String course;
	private int tuitionBalance;
	private int defCourseCost = 600;
	
	//Constructor
	public Student()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student year: ");
		this.studentYear = in.nextInt();
		System.out.println(firstName + " " + lastName + " " + studentYear);
	}
	
	//Generate ID
	private void GenerateID(String firstName, String lastName, int studentYear)
	{
		
	}
	//Enroll in courses
	private String EnrollCourses(int studentID)
	{
		return "Successfully Enrolled";
	}
	//View balance
	private int ViewBalance(int studentID)
	{
		return tuitionBalance;
	}
	//Pay Tuition
	private String PayTuition(int studentID, int tuitionBalance)
	{
		return "Transaction Successful";
	}
	//Show status
	private void ShowStatus(int studentID)
	{
		
	}
}
