package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Autoconstant;
import utility.Basepage;

public class Actitimeuser  extends Basepage implements Autoconstant
{
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;
	@FindBy(xpath = "//div[text()='New User']")
	private WebElement NewuserBuitton;
	
	@FindBy(xpath = "(//div[text()='  Departments'])[1]")
	private WebElement DepartmentsButton;
	
	@FindBy(xpath = "//div[text()='Bulk Invitations']")
	private WebElement BulkinvitationButton;
	
	@FindBy(xpath = "//div[contains(text(),'  Accounts & Permissions ')]")
	private WebElement AccountsandpermissionButton;
	
	@FindBy(xpath = "//div[contains(text(),'    PTO Settings ')]")
	private WebElement PtosettingButton;
	
	@FindBy(xpath = "//div[contains(text(),'  Sick Days Settings ')]")
	private WebElement SickdaysButton;
	@FindBy(xpath = "//span[@class='userNameSpan']")
	private List<WebElement> allusers;
	
	@FindBy(xpath = "(//div[contains(text(),' Work Assignments')])[1]")
	private WebElement workassignmentsButton;
	
	@FindBy(xpath = "//span[text()='Pradhan, Dipu']")
	private List<WebElement> Dipupradhanlink;
	@FindBy(xpath = "//span[text()='Pradhan, Dipu']")
	private WebElement Dipupradhanlinkdelete;
	
	
	
	@FindBy(xpath = "//div[text()='DELETE']")
	private WebElement deleteuser;
	public Actitimeuser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void newuser() throws InterruptedException
	{
		jsclik(NewuserBuitton, driver);
			Thread.sleep(2000);
	}
	public void allusersvalidation()
	{
		int count=0;
		for(int i=0;i<allusers.size();i++)
		{
			if(allusers.get(i).getText().equals("Pradhan, Dipu"))
			{
				count++;
			}
		}
		if(count==2)
			System.out.println("multiple user creatred");
		else
			System.out.println("multiple user not created");
			
	}
	//another way of validation
	public void validation2()
	{
		if(Dipupradhanlink.size()==2)
			System.out.println("multiple user created");
		else
			System.out.println("multi ple user not created");
	}
	
	public void deleteuser()
	{
		jsclik(Dipupradhanlinkdelete, driver);
		jsclik(deleteuser, driver);
		Alretpopupaccept(driver);
		
	}
}

