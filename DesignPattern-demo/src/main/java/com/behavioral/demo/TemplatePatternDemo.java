package com.behavioral.demo;

import java.io.IOException;

abstract class Thread {  

	abstract void ready();  
	abstract void run();  
	abstract void terminate();  

	final void process(){  

		//ready state 
		ready();  

		//running state 
		run();  

		//terminate state  
		terminate();  
	}  
}

//Extend a new class
class Thread1 extends Thread {  
	//Override  
	void ready() {  
		System.out.println("Thread1 is in ready state!");  
	}  
	//Override  
	void run() {  
		System.out.println("Thread1 execution stated!");  
	}  
	//Override  
	void terminate() {  
		System.out.println("Thread1 is terminated");  
	}  
}

//Extend a new class
class Thread2 extends Thread {  
	//Override  
	void ready() {  
		System.out.println("Thread2 is in ready state!");  
	}  
	//Override  
	void run() {  
		System.out.println("Thread2 execution stated!");  
	}  
	//Override  
	void terminate() {  
		System.out.println("Thread2 is terminated");  
	}  
}


public class TemplatePatternDemo {

	public static void main(String[] args)throws IOException,InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Thread obj = new Thread1();
		obj.process();
		System.out.println();
		obj= new Thread2();
		obj.process();

	}

}
