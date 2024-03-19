package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Autoconstant;
import utility.Basepage;

public class adduser  extends Basepage implements Autoconstant
{
	
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	@FindBy(id = "createUserPanel_firstNameField")
	private WebElement firstnameTextfield;
	
	/*
	 * @FindBy(xpath = "//input[@id='createUserPanel_middleNameField']") private
	 * WebElement middlenametextfield;
	 */
	
	@FindBy(id = "createUserPanel_lastNameField")
	private WebElement lastnameTextfield;
	
	@FindBy(id = "createUserPanel_emailField")
	private WebElement emailTextfield;
	
	@FindBy(xpath = "(//div[text()='-- department not assigned --'])[1]")
	private WebElement departmentButton;
	
	
	@FindBy(xpath = "//div[@class='item']")
	private List<WebElement> dropdownmenu;
	
	
	@FindBy(xpath = "(//div[@class='components-Dropdown-trigger--1w6PGjU6'])[1]")
	private WebElement clender;
	
	@FindBy(xpath = "//div[text()='Save & Send Invitation']")
	private WebElement saveandsendinvitationButton;
	
	
	@FindBy(xpath ="(//span[text()='Close'])[1]")
	
	private WebElement closeLink;
	
	public	adduser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void createuser() throws InterruptedException, IOException
	{
		sendkey(driver, firstnameTextfield, "std", 16, 1);
		sendkey(driver, lastnameTextfield, "std", 17, 1);
		sendkey(driver,emailTextfield, "std", 18, 1);
		acdoubleclik(saveandsendinvitationButton, driver);
		jsclik(closeLink, driver);
		
	}
	
	

	
}
