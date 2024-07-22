package emailapp;

import java.util.Scanner;

public class Email {
	private String email;
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "androcompany.com";
	
	
	//constructor to receive fristName and lastName
	public Email(String firstName , String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED :"+this.firstName+" "+this.lastName);
		
		this.department = setDepartment();
		System.out.println("Department : "+this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password : "+this.password);
		
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		//System.out.println("Your email is : "+email);
	}
	
	private String setDepartment()
	{
		System.out.println("DEPARTMENT CHOICES: \n 1 for sales \n 2 for development \n 3 for accpunting \n 0 for none \nEnter the department :");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		
		if(deptChoice == 1) return "Sales";
		else if(deptChoice == 2) return "Development";
		else if(deptChoice == 3) return "Accounting";
		else return " ";
	}
	
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#*_";
		char[] password = new char[length];
		
		for(int i=0 ; i<length; i++)
		{
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password); 
				
	}
	
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity = mailboxCapacity;
	}
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	public void changePassword(String password)
	{
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;	}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() { return password;}
	
	public String showInfo()
	{
		return "DISPLAY NAME : "+firstName+" "+lastName+
				"\nCOMPANY EMAIL : "+email+       
				"\nMAILBOX CAPACITY : "+mailboxCapacity+"mb"+
				"\nALTERNATE EMAIL : "+alternateEmail;
	}
}
