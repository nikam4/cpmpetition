package com.sunbeam.library.main;

import java.awt.Choice;
import java.util.Scanner;

public class Program
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int choice;
		while ((choice=whoAreYou())!=0) 
		{
			switch (choice) 
			{
			case 1:
				
				break;
			case 2:
				login();
				break;
			case 3:
				login();
				break;
			}
		}
		
	}
	private static int whoAreYou() 
	{
		System.out.println("1.Owner");
		System.out.println("2.Librarian");
		System.out.println("3.User");
		System.out.println("Enter your choice: ");
		return sc.nextInt();
	}

}
