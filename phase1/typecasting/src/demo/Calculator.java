package demo;

import java.util.*;
public class Calculator
{
	public static void main(String[] args)
	{
		int a,b,choice;
		float result=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		a=sc.nextInt();
		
		System.out.println("ENTER THE SECOND NUMBER");
		b=sc.nextInt();
		
		System.out.println("\n1: addition.\n2: subtraction.\n3: multiplication.");
		System.out.println("\n4: division.\n5: exit");
		
		System.out.println("\n enter your choice:");
		choice =sc.nextInt();
		
		switch(choice)
		{
		case 1:
			result=(a+b);
			break;
		case 2:
			result=(a-b);
			break;
		case 3:
			result=(a*b);
			break;
		case 4:
			result=(float)((float)a/(float)b);
			break;	
		default:
			System.out.println("invalid");
		}
		if (choice>=1 && choice<=4)
			System.out.println("Result is:"+ result);
	}
	

}
