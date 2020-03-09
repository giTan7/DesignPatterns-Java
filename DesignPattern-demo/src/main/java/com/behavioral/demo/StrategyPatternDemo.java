package com.behavioral.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Strategy {  

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public float calculation(float a, float b);  

}

class Addition implements Strategy{  

	//Override  
	public float calculation(float a, float b) {  
		return a+b;  
	}  

}

class Subtraction  implements Strategy{  

	//Override  
	public float calculation(float a, float b) {  
		return a-b;  
	}  

}

class Multiplication implements Strategy{  

	//Override  
	public float calculation(float a, float b){  
		return a*b;  
	}  
}


//This is a class. 
class Choice {  
	  
    private Strategy strategy;  
    
    public Choice(Strategy strategy){  
       this.strategy = strategy;  
    }  

    public float executeStrategy(float num1, float num2){  
       return strategy.calculation(num1, num2);  
    }  
}


public class StrategyPatternDemo {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter the first value: ");  
        float val1=Float.parseFloat(br.readLine());  
        System.out.print("Enter the second value: ");  
        float val2=Float.parseFloat(br.readLine());
        
        Choice obj = new Choice(new Addition());          
        System.out.println("Addition = " + obj.executeStrategy(val1, val2));  

        obj = new Choice(new Subtraction());       
        System.out.println("Subtraction = " + obj.executeStrategy(val1, val2));  

        obj = new Choice(new Multiplication());        
        System.out.println("Multiplication = " + obj.executeStrategy(val1, val2));  

	}

}
