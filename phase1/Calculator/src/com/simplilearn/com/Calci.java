package com.simplilearn.com;

import java.util.Scanner;
public class Calci 
{
	public static void main(String[] args)
	 {
		int a,b,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		a=sc.nextInt();
			
		System.out.println("ENTER THE SECOND NUMBER");
		b=sc.nextInt();
		
		System.out.println("\n1: addition.\n2: subtraction.\n3: multiplication.\n4: division.");
		System.out.println("\n enter your choice:");
		n =sc.nextInt();
		
		if(n==1)
			System.out.println("\n Addition of a and b is : " +(a+b));
		else if(n==2)
			System.out.println("\n Subtraction of a and b is : " +(a+b));
		else if(n==3)
			System.out.println("\n Multiplication of a and b is : " +(a+b));
		else if(n==4)
			System.out.println("\n Division of a and b is : " +(a+b));
		else
			System.out.println("\n Choose the correct option");
	 }
}
