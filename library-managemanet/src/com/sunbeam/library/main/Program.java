package com.sunbeam.library.main;

import java.awt.Choice;
import java.util.Scanner;

import com.sunbeam.library.dao.UserDao;
import com.sunbeam.library.pojo.UserPojo;

public class Program
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		int a,b;
		
		try(UserDao userDao=new UserDao();) 
		{
			while ((a=loginchoice())!=0) 
			{
				switch (a) 
				{
				case 1:
					if(userDao.login(loginData())==1)
					{
						System.out.println("success");
						while ((b=submenu1())!=0) 
						{
							switch (b) 
							{
							case 1:
								
								break;
							case 2:
								break;
							case 3:
								break;
							}
						}
					}
					break;
				case 2:
					if(userDao.signUp(signUpData())>0)
					{
						System.out.println("Signup complete");
						a=1;
					}
					
				}
			}
		}
	
		
	}

	private static UserPojo signUpData() 
	{
		UserPojo user=new UserPojo();
		System.out.println("Enter id ");
		user.setId(sc.nextInt());
		System.out.println("Enter name");
		user.setName(sc.next());
		System.out.println("Enter email");
		user.setEmail(sc.next());
		System.out.println("Enter phone");
		user.setPhone(sc.next());
		System.out.println("Enter Password");
		user.setPassword(sc.next());
		System.out.println("Enter Role");
		user.setRole(sc.next());
		return user;
	}

	private static int submenu1()
	{
		System.out.println("0.signout");
		
		System.out.println("1.edit Profile");

		System.out.println("2.change password");

		System.out.println("3.subjectwise coppies");
		
		System.out.println("4.bookwise coppies");
		
		System.out.println("5.fees/fine report");
		
		System.out.println("Enter choice: ");
		return sc.nextInt();
	}

	private static UserPojo loginData() 
	{
		UserPojo user=new UserPojo();
		System.out.println("Email: ");
		user.setEmail(sc.next());
//		System.out.println(user.getEmail());
		System.out.println("Password: ");
		user.setPassword(sc.next());
		return user;
	}
	private static int loginchoice() 
	{
		System.out.println("0.Exit");
		System.out.println("1.SignIn");
		System.out.println("2.SignUp");
		System.out.println("Enter choice: ");
		return sc.nextInt();
	}

}
