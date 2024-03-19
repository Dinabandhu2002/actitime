package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Autoconstant;
import utility.Basepage;

public class actitimedeletecustomer extends Basepage implements Autoconstant
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(xpath = "(//div[text()='Susant kumar behara']/../..//div[@class='editButton'])[1]")
	private WebElement settingButton;
	
	@FindBy(xpath = "(//div[@class='action'])[1]")
	private WebElement ActionButton;
	
	@FindBy(xpath = "(//div[text()='Delete'])[2]")
	private WebElement deleteButton;
	@FindBy(xpath = "(//div[text()='Copy'])[2]")
	private WebElement CopyButton;
	
	@FindBy(xpath = "//span[text()='Delete permanently']")
	private WebElement deletepermantalyButton;
	
	@FindBy(xpath = "(//div[@class='cancelBtn greyButton'])[1]")
	private WebElement cancelButton;
	
	public actitimedeletecustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void deletecustomer() throws InterruptedException
	{
		jsclik(settingButton, driver);
		jsclik(ActionButton, driver);
		jsclik(deleteButton, driver);
		jsclik(deletepermantalyButton, driver);	
	}
	
}

