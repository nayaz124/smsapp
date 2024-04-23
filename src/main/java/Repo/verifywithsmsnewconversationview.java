package Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifywithsmsnewconversationview {

		public WebDriver driver;

		public verifywithsmsnewconversationview(WebDriver driver) {

			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		private @FindBy(xpath = "//input[@name='username']") WebElement username;
		private @FindBy(xpath = "//input[@type='password']") WebElement password;
		private @FindBy(xpath = "//input[@name='Login']") WebElement Login;
		private @FindBy(xpath = "//div[@class='slds-icon-waffle']") WebElement Applauncher;
		private @FindBy(xpath = "//input[@placeholder='Search apps and items...']") WebElement searchappanditems;
		private @FindBy(xpath = "//a[@data-label='360 SMS']") WebElement smslabel;
		private @FindBy(xpath = "//div[@class='slds-size_small']") WebElement clclick;
		private @FindBy(xpath="//a[@title='Contacts']")WebElement Contact;
		private @FindBy(xpath="//div[@title='New']")WebElement New;
		private @FindBy(xpath="//input[@name='lastName']")WebElement LastName;
		private @FindBy(xpath="//input[@name='HomePhone']")WebElement Homephone;
		private @FindBy(xpath="//button[@class='slds-button slds-button_brand']")WebElement Save;
		private @FindBy (xpath="//textarea[@placeholder='Message...']")WebElement Messagebox;
		private @FindBy(xpath="//div[@class='selected-option_to']")WebElement dropdown;
		private @FindBy(xpath ="//li[@value='HomePhone']")WebElement Homephone1;
		private @FindBy(xpath="//button[@class='sendButton']")WebElement send;

		public WebDriver getDriver() {
			return driver;
		}
		public WebElement getUsername() {
			return username;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getClclick() {
			return clclick;
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
		public WebElement getContact() {
			return Contact;
		}
		public WebElement getNew() {
			return New;
		}
		public WebElement getLastName() {
			return LastName;
		}
		public WebElement getHomephone() {
			return Homephone;
		}
		public WebElement getSave() {
			return Save;
		}
		public WebElement getMessagebox() {
			return Messagebox;
		}
		public WebElement getDropdown() {
			return dropdown;
		}
		public WebElement getHomephone1() {
			return Homephone1;
		}
		public WebElement getSend() {
			return send;
		}
		
	}


