package com.creational.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Car{  
	protected double tax = 2000;
	protected double cost;
	abstract void getCost();  

	
	public void calculateCost(){  
		System.out.println(cost+tax);  
	}  
}

class  Suzuki extends Car{  
	//@override  
	public void getCost(){  
		cost=40000;              
	}  
}

class  BMW extends Car{  
	//@override  
	public void getCost(){  
		cost=60000;              
	}  
}

class  Nano extends Car{  
	//@override  
	public void getCost(){  
		cost=20000;              
	}  
}


class CarFactory{  

	//use getCar method to get object of type Car   
	public Car getCar(String CarType){  
		if(CarType == null){  
			return null;  
		}  
		if(CarType.equalsIgnoreCase("SUZUKI")) {  
			return new Suzuki();  
		}   
		else if(CarType.equalsIgnoreCase("BMW")){  
			return new BMW();  
		}   
		else if(CarType.equalsIgnoreCase("NANO")) {  
			return new Nano();  
		}  
		return null;  
	}  
}

public class FactoryDesign {

	public static void main(String[] args)throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		CarFactory obj = new CarFactory();  

		System.out.print("Enter the name of the Car you want to buy(suzuki/BMW/Nano): ");  
		String CarModel=br.readLine();

		Car c = obj.getCar(CarModel);
		c.getCost();
		c.calculateCost();

	}

}
