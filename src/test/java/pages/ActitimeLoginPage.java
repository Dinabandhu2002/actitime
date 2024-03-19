package pages;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Autoconstant;
import utility.Basepage;
import utility.ExcelLibary;

public class ActitimeLoginPage extends Basepage implements Autoconstant
{
	WebDriver driver;
	//POM class is generally used for storing the WebElements and methods(tasks)
			//reference variable should be fully qualified --- nameType
			
			//Declaration
		@FindBy(id ="username")
		private WebElement usernameTextfield;
		
		@FindBy(name = "pwd" )
		private WebElement passwordTextfield;
		
		@FindBy(name = "remember")
		private WebElement keepmeloggedinCheckbox;
		
		
		@FindBy(id = "loginButton")
		private WebElement LoginButton;
		
		@FindBy(id = "toPasswordRecoveryPageLink")
		private WebElement fogottonpasswodButton;
		
		@FindBy(xpath = "//a[text()='actiTIME Inc.']")
		private WebElement actitimeincLink;
		
		//Initialization
		
			public ActitimeLoginPage(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
		//Utilization
			public void Login() throws IOException
			{
				usernameTextfield.sendKeys(ExcelLibary.getStringCellData("Std", 0, 0));
				passwordTextfield.sendKeys(ExcelLibary.getStringCellData("Std", 0, 1));
				validateTitle(driver, "actiTIME - Login");
				Aclick(keepmeloggedinCheckbox, driver);
				jsclik(LoginButton, driver);
				
			
				
			}
			public void forgottonpassword()
			{
				fogottonpasswodButton.click();
			}
			public void  Actime()
			{
				actitimeincLink.click();
			}
		
}
