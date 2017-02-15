package com.qa.example.testpkg2;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.example.testpkg1.Login;



public class Base {


	
	@Test
	public void m1()
	{
		Login objLogin = new Login();
		objLogin.display();
		System.out.println("Ranjan");
	}

}
