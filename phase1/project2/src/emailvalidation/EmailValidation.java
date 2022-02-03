package emailvalidation;

import java.util.Scanner;
public class EmailValidation
{
	public static void main(String[] args) 
	{
		int i,a=0;
		
		String str[]= {"abc@gmail.com","123@gmail.com","gn@gmail.com"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email-id which you want to search:");
		String id =sc.nextLine();
		for(i=0;i<2;i++)
		{
			if(str[i].equals(id))
		    a=1;
		}
		System.out.println();
		if (a==1)
			System.out.println("email-id found");
		else
			System.out.println("email-id not found");				
	}
}
