package com.sunbeam.library.dbutil;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Dbutils {
	
	
	
	public static Connection getConnection () throws Exception
	{
		InputStream instr = new FileInputStream("conflic.Properties");
		Properties pro = new Properties();
		pro.load(instr);
		Class.forName(pro.getProperty("DRIVER"));
		return DriverManager.getConnection(pro.getProperty("URL"),pro.getProperty("USER"),pro.getProperty("PASSWORD"));
	}

}
