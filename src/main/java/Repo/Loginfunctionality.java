package Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginfunctionality {

	public WebDriver driver;

	public Loginfunctionality(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//input[@name='username']") WebElement username;
	private @FindBy(xpath = "//input[@type='password']") WebElement password;
	private @FindBy(xpath = "//input[@name='Login']") WebElement Login;
	private @FindBy(xpath = "//div[@class='slds-icon-waffle']") WebElement Applauncher;
	private @FindBy(xpath = "//input[@placeholder='Search apps and items...']") WebElement searchappanditems;
	private @FindBy(xpath = "//a[@data-label='360 SMS']") WebElement smslabel;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getApplauncher() {
		return Applauncher;
	}

	public WebElement getSearchappanditems() {
		return searchappanditems;
	}

	public WebElement getSmslabel() {
		return smslabel;
	}

}
