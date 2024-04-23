package Testcases;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Common_method.Baseclass;
import Repo.verifywithsmsnewconversationview;

public class verifywithsmsnewconversationvie extends Baseclass {

	@Test
	public void logincheck() throws Throwable {
		
		driver = Driver_IntializationBack();
		driver.get("https://login.salesforce.com/?locale=eu");
		
		verifywithsmsnewconversationview fn1 = new verifywithsmsnewconversationview(driver);
		fn1.getUsername().sendKeys("adityashandilya@360degreecloud.com");
		fn1.getPassword().sendKeys("Aditya@360cloud1");
		fn1.getLogin().click();
		fn1.getApplauncher().click();
		fn1.getSearchappanditems().sendKeys("5680");
		Actions action = new Actions(driver);
		action.moveToElement(fn1.getClclick());
		action.click().build().perform();
		Thread.sleep(20000);
		Actions action2 = new Actions(driver);
		action2.moveToElement(fn1.getContact());
		action2.click().build().perform();
		fn1.getNew().click();
		fn1.getLastName().sendKeys("Nayaztest");
		fn1.getHomephone().sendKeys("919005380713");
		fn1.getSave().click();
		Thread.sleep(10000);
		//fn1.getMessagebox().sendKeys("testing purpose");
		//fn1.getHomephone1().click();
		//fn1.getSend();
	
		
	}
}