package Testcases;

import org.testng.annotations.Test;

import Common_method.Baseclass;
import Repo.Loginfunctionality;

public class Login extends Baseclass {

	@Test
	public void logincheck() throws Throwable {

		driver = Driver_IntializationBack();
		driver.get("https://login.salesforce.com/?locale=eu");

		 Loginfunctionality fn = new Loginfunctionality(driver);
		 fn.getUsername().sendKeys("adityashandilya@360degreecloud.com");
		 fn.getPassword().sendKeys("Aditya@360cloud1");
		 fn.getLogin().click();
		 
		 
	}

}
