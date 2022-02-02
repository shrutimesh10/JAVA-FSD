package com.email;

import java.util.Scanner;

public class Emailvalidation {

	public static void main(String[] args) {
		
		String n;
		String array[]= {"shruti@gmail.com","snehal@gmail.com","pritam@gmail.com","chean@gmail.com"};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your email ID:");
		n=sc.next();
		if(array[0].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else if(array[1].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else if(array[2].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else if(array[3].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else
		{
			System.out.println("User Invalid");
		}
		// TODO Auto-generated method stub

	}

}
