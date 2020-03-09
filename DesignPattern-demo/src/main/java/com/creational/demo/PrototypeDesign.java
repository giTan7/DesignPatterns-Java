package com.creational.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @author Tarannum Ara
 */

interface Prototype {  

	public Prototype getClone();  

}

class StudentDetails implements Prototype{  

	private int roll;  
	private String name; 
	private float marks;   

	/**
	 * 
	 * @param roll
	 * @param name
	 * @param marks
	 */
	public  StudentDetails(int roll, String name, float marks){  

		this.roll = roll;  
		this.name = name;    
		this.marks = marks;  
	}  

	public void showDetails(){  

		System.out.println("roll:"+roll + "\nname:"+name + "\nmarks:"+marks);  
	}  
	//Override
	public Prototype getClone() { 
		
		System.out.println("Clonning the object");
		return new StudentDetails(roll,name,marks);  
	}  
}


public class PrototypeDesign {

	public static void main(String[] args)throws IOException {

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
		System.out.print("Enter Student Roll: ");  
		int roll=Integer.parseInt(br.readLine());
		System.out.println();

		System.out.print("Enter Student Name: ");  
		String name=br.readLine();  
		System.out.println();  

		System.out.print("Enter Student Marks: ");  
		float marks=Float.parseFloat(br.readLine());  
		System.out.println();  

		//object of class StudentDetails..
		StudentDetails s1=new StudentDetails(roll,name,marks);

		s1.showDetails();  
		System.out.println();  
		StudentDetails s2=(StudentDetails) s1.getClone();  
		s2.showDetails();

	}

}
