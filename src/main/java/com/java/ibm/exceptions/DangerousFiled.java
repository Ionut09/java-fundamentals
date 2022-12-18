package com.java.ibm.exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DangerousFiled {
	
	public static void main(String[] args) {
		
		//UNchecked exceptions
		Student student = new Student("Bob", 2);
		try {
			student.setGrade(-5);
		} catch (IllegalArgumentException ex) {
			//			System.out.println("mesajul exceptiei = " + ex.getMessage());
			//			ex.printStackTrace();
			System.out.println(ex);
			ex.printStackTrace();
		}
		System.out.println("After exception has been caught");
		System.out.println("student.getGrade() = " + student.getGrade());
		
		Scanner sc = new Scanner(System.in);
		//		int nextInt = sc.nextInt(); //
		
		//checked exceptions
		
		//Unhandled exception: java.io.FileNotFoundException
		//		try {
		readAfile();
		//		} catch (FileNotFoundException e) {
		//			throw new RuntimeException(e);
		//			e.printStackTrace();
		//		}
		//
	}
	
	private static void readAfile() {// throws FileNotFoundException { //declare
		
		//Unhandled exception: java.io.FileNotFoundException ...
		try (FileReader reader = new FileReader("/Users/ionut/workspace/code_samples/log4jdbc/scripts/build.xml")) {
			int c;
			while ((c = reader.read()) != -1) { //capat return -1
				System.out.print((char) c);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Finally is pretty redundant since we have try-with-resources");
		}
		
		try (Connection connection = DriverManager.getConnection("")) {
			//do your work
		} catch (SQLException ex) {
			//tratezi
		}
		
		//		FileReader reader = null;
		//		try {
		//			reader = new FileReader("/Users/ionut/workspace/code_samples/log4jdbc/scripts/build.xml");
		//		} catch (IOException ex) {
		//			ex.printStackTrace();
		//		} finally {
		//			if (reader != null) {
		//				try {
		//					reader.close();
		//				} catch (IOException e) {
		//					throw new RuntimeException(e);
		//				}
		//			}
		//		}
	}
}
