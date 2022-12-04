package com.greatlearning.lab1.main;

import com.greatlearning.lab1.services.CredentialService;

public class MainClassLab1 {

	public static void main(String args[]) {
		//Scanner input = new Scanner(System.in);
	  
	CredentialService obj2 = new CredentialService();
	
    	 obj2.generateEmailAddress();
    	 obj2.determineDepartment();
     	 obj2.generatePassword();
 	     obj2.showCredentials();
  

	
	}	

}
