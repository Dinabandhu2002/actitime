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

public class setting extends Basepage implements Autoconstant
{
	public WebDriver driver;
	@FindBy(linkText = "Types of Work")
	private WebElement TypesofworkButton;
	@FindBy(linkText = "Leave Types")
	private WebElement LeavetypesButton;
	@FindBy(linkText = "Turn Features On / Off")
	private WebElement FeatureButton;
	@FindBy(linkText = "Workflow Settings")
	private WebElement workflowButton;
	@FindBy(linkText = "Priority")
	private WebElement PriorityButton;
	public setting(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void typesofwork()
	{
		jsclik(TypesofworkButton, driver);
		
	}
	public void leave()
	{
		jsclik(LeavetypesButton, driver);
		
	}
	public void feature()
	{
		jsclik(FeatureButton, driver);
	
		
	}
	public void workflow()
	{
		jsclik(workflowButton, driver);
	
		
	}
	public void Priority()
	{
		jsclik(PriorityButton, driver);
		
	}
	
	
	
	



}	


