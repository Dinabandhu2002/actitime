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

public class ActitimeTaskpage extends Basepage implements Autoconstant 
{
	public WebDriverWait wait;
	public WebDriver driver;
	@FindBy(xpath = "//div[@class='addNewButton']")
	private WebElement AddnewButton;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement CreateNewcustomerButton;
	
	@FindBy(xpath = "//div[@class='item createNewProject']")
	private WebElement CreateNewProjectButton;
	
	@FindBy(xpath = "//div[@class='item importTasks']")
	private WebElement ImportTaskButton;
	
	
	public ActitimeTaskpage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void addnewButton() 
	{
		jsclik(AddnewButton, driver);
		
	}
	public void Createnewcustmer()
	{
		jsclik(CreateNewcustomerButton, driver);
		 
	}
	public void createNewproject(WebDriver driver)
	{
		 wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf( CreateNewProjectButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()", CreateNewProjectButton);
	}
	public void importTasks(WebDriver driver)
	{
		 wait=new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf( CreateNewProjectButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()", ImportTaskButton);
	}
}

