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

public class typeofwork extends Basepage implements Autoconstant
{
	public WebDriver driver;
	
	@FindBy(xpath = "//div[text()='New Type']")
	private WebElement newtypeButton;
	@FindBy(id = "title")
	private WebElement Enternametextfield;
	
	
	@FindBy(xpath = "//span[@class='components-TruncatedText-oneLine--Jmk2Gxm5']")
	private List< WebElement> catogoryfield;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	
	
	
	
	public typeofwork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void newtype()
	{
		jsclik(newtypeButton, driver);
		
	}
	public void createNewtype() throws IOException
	{
		sendkey(driver, Enternametextfield, "Std", 8, 1);
		jsclik(submitButton, driver);
		
	}
	public void createNewtype1(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(	Enternametextfield));
		Enternametextfield.sendKeys("color paint");
		wait.until(ExpectedConditions.visibilityOf(submitButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", submitButton);
	
	}
	
	
	
	
}
