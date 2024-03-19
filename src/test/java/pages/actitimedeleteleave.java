package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Autoconstant;
import utility.Basepage;

public class actitimedeleteleave extends Basepage implements Autoconstant
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	@FindBy(xpath = "//span[text()='studyleave']/../../../../../..//div[@class='components-ItemListPage-ItemActions-trigger--p04fBAlu']")
	private WebElement threedotbutton;
	
	@FindBy(xpath = "//span[text()='Delete']")
	private WebElement deleteButtonn;
	
	@FindBy(xpath = "//span[text()='Archive']")
	private WebElement archiveButton;
	
	@FindBy(xpath = "//button[text()='OK, Delete']")
	private WebElement okdeleteButton;
	
	@FindBy(xpath = "Cancel")
	private WebElement cancelButton;
	
	public actitimedeleteleave(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		public void deleteleave()
		{
			jsclik(threedotbutton, driver);
			jsclik(deleteButtonn, driver);
			jsclik(okdeleteButton, driver);
			
		
		}

}
