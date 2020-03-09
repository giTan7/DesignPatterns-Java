package com.structural.demo;

import java.io.IOException;

interface DataAccess{  
	public void grantDataAccess();  
}  

class SeePrivateData implements DataAccess {  
	private String Name;
	/**
	 * 
	 * @param Name
	 */
	public SeePrivateData(String Name) {  
		this.Name = Name;  
	}  
	//override  
	public void grantDataAccess() {  
		System.out.println("Private Data Access granted for developer "+ Name);  
	}  
}  

class ProxySeePrivateData implements DataAccess {  
	private String Name;  
	private SeePrivateData access;  
	public ProxySeePrivateData(String Name) {  
		this.Name = Name;  
	}  
	//Override  
	public void grantDataAccess()   
	{  
		if (getPost(Name).equalsIgnoreCase("DEVELOPER"))  
		{  
			access = new SeePrivateData(Name);  
			access.grantDataAccess();  
		}   
		else   
		{  
			System.out.println("No private Data viewing access granted. You are not a developer!");  
		}  
	}  
	public String getPost(String Name) {  
		// Check post from the database based on Name and designation  
		// return post.
		if(Name.equalsIgnoreCase("Tarannum Ara")) {
			return "Developer";
		}
		else
			return "AccessDenied";

	}  
}  


public class ProxyPatternDemo {

	public static void main(String[] args)throws IOException {
		DataAccess access = new ProxySeePrivateData("Tarannum Ara");  
		access.grantDataAccess();

	}

}
