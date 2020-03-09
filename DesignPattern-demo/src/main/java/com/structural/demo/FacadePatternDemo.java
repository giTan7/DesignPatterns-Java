package com.structural.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Laptop{  
	public void SysModel();  
	public void price();  
}  


class Dell implements Laptop {  
	//Override  
	public void SysModel() {  
		System.out.println("\n\nModel: Inspiron 3537");  
	}  
	//Override  
	public void price() {  
		System.out.println("Price:  Rs 55000.00 \n\n");  
	}  
}  

class IPad implements Laptop {  
	//Override  
	public void SysModel() {  
		System.out.println("\n\nModel: MacBook Air");  
	}  
	//Override  
	public void price() {  
		System.out.println("Price: Rs 75000.00 \n\n");  
	}  
}  

class HP implements Laptop {  
	//Override  
	public void SysModel() {  
		System.out.println("\n\nModel: HP Chromebook 14");  
	}  
	//Override  
	public void price() {  
		System.out.println(" Rs 40000.00 \n\n");  
	}  
}  


class Showroom {  
	private Laptop Dell;  
	private Laptop IPad; 
	private Laptop HP;  

	public Showroom(){  
		Dell= new Dell();  
		IPad=new IPad();  
		HP=new HP();  
	}  
	public void DellSale(){  
		Dell.SysModel();  
		Dell.price();  
	}  
	public void IPadSale(){  
		IPad.SysModel();  
		IPad.price();  
	}  
	public void HPSale(){  
		HP.SysModel();  
		HP.price();  
	}  
}  


public class FacadePatternDemo {

	public static void main(String[] args)throws IOException {
		int  choice;    
		do{    
			System.out.println("1:Dell Laptop");  
			System.out.println("2:IPad");  
			System.out.println("3:HP");  
			System.out.println("4:Exit");  
			System.out.print("Enter your choice: ");  

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			choice=Integer.parseInt(br.readLine());  
			Showroom buy = new Showroom();  

			switch (choice) {  
			case 1:  
			{   
				buy.DellSale();  
			}  
			break;  
			case 2:  
			{  
				buy.IPadSale();        
			}  
			break;    
			case 3:  
			{  
				buy.HPSale();       
			}  
			break;     
			default:  
			{    
				System.out.println("You have not purchased any laptop!");  
			}         
			return;  
			}  

		}while(choice!=4);  
	}    

}

