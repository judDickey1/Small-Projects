package studentDatabase;

import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		
		// Ask how many new users we want to add
		System.out.println("How many new students are enrolling? ");
		Scanner in = new Scanner(System.in);
		int numStudents = in.nextInt();
		
		Student[] students = new Student[numStudents]; 
		
		//Student st1 = new Student();
		//st1.EnrollCourses();
		//st1.PayTuition();
		//st1.ShowStatus();
		
		//Create new students
		for(int i = 0;i < numStudents; i++)
		{
			students[i] = new Student();
			students[i].EnrollCourses();
			students[i].PayTuition();				
		}
		//print information
		for(int i = 0;i < numStudents; i++)
		{
			System.out.println(students[i].ShowStatus());
		}
		in.close();
	}

}
