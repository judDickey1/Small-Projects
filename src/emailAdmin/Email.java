package emailAdmin;

import java.util.*;

public class Email {
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private int defaultPassLength = 8;
	private String department;
	private int mailboxCap;
	private int defaultMailCap = 10000;
	private String altEmail;
	
	//Constructor
	public Email(String first_name, String last_name)
	{
		this.first_name = first_name;
		this.last_name = last_name;
		
		//call a method asking for department
		this.department = SetDepartment();
		
		//call a method to return a random password
		this.password = randomPass(defaultPassLength);
		
		//generate email
		email = first_name.toLowerCase() + "." + last_name.toLowerCase() + "@" + department.toLowerCase() + ".company.com";
		
		//set mailbox capacity
		SetMailboxCap(defaultMailCap);
		
		//set alternate email
		SetAltEmail(altEmail);
	}
	//Ask for the department
	private String SetDepartment()
	{
		System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n");
		Scanner in = new Scanner(System.in);
		int dept = in.nextInt();
		if (dept == 1){return "Sales";}
		else if (dept == 2) {return "Development";}
		else if (dept == 3) {return "Accounting";}
		else return "";
	}
	//Generate random password
	private String randomPass(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%_";
		char[] password = new char[length];
		for(int i = 0; i < length; i++)
		{
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//Set mailbox capacity
	public void SetMailboxCap(int mailboxCap)
	{
		this.mailboxCap = mailboxCap;	 
	}
	
	//Set alternate email
	public void SetAltEmail(String altEmail)
	{
		this.altEmail = altEmail;	 
	}
	
	//Password change
	public void changePassword(String password)
	{
		this.password = password;
	}
	
	public int getMailboxCap() {return mailboxCap;}
	public String getAltEmail() {return altEmail;}
	public String getPassword() {return password;}
	
	public String showInfo()
	{
		return "Display name: " + first_name + " " + last_name + "\n" +
				"Company Email: " + email + "\n" +
				"Mailbox Capacity: " + mailboxCap + "mb";
	}
}
