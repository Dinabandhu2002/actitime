package pages;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Autoconstant;
import utility.Basepage;

public class leave extends Basepage implements Autoconstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "//div[text()='New Type']")
	private WebElement newtypeButton;
	
	@FindBy(xpath = "//input[@placeholder='Enter name']")
	private WebElement nametextfield;
	
	@FindBy(xpath = "(//button[@class='components-Select-container--38sAsAxs'])[1]")	
	private WebElement plusButton;
	
	@FindBy(xpath = "//button[@class='containers-LeaveTypesItemList-LeaveTypeIndicatorSelect-indicator--1eqVw2ec']")
	private List<WebElement> allsymbol;
	
	
	@  FindBy(xpath="(//input[@data-tip-disable='true'])[2]")
	private WebElement leaveHours;
	
	
	@FindBy(xpath="//label[4]")
	private WebElement checkBox;
	
	@FindBy(xpath = "//button[text()='PTO Balance']")
	private WebElement PtobalanceButton;
	
	@FindBy(xpath = "//div[@class='components-SimpleSelect-SimpleSelectItem-item--3bw3F4Fc']")
	private  List<WebElement> ptobalandrop;
	
	@FindBy(xpath = "(//input[@class='components-Input-input--3RF7ZcCP'])[3]")
	private WebElement pototextfield;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	
	
	public leave(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	

	/*
	 * public void newType(WebDriver driver) { JavascriptExecutor
	 * js=(JavascriptExecutor)driver; js.executeScript("arguments[0].click()",
	 * newtypeButton); }
	 */
	public void newtype(WebDriver driver)
	{
		jsclik(newtypeButton, driver);
		
	}
	public void textfield(WebDriver driver) throws IOException
	{
		 sendkey(driver, nametextfield, "Std", 13, 1);
			/*
			 * jsclik(plusButton, driver);
			 * 
			 * allsymbol.get(6).click(); jsclik(checkBox, driver);
			 */
	
		 
	}
	public void ptobalance(WebDriver driver)
	{
		jsclik(PtobalanceButton, driver);
		 for(int i=0;i< ptobalandrop.size();i++)
		 {
			 if(ptobalandrop.get(i).getText().equalsIgnoreCase("Sick Days Balance"))
			 {
				 ptobalandrop.get(i).click();
			 }
		 }
		 
	}
	public void save(WebDriver driver)
	{
		
		jsclik(submitButton, driver);
	
	}

}
