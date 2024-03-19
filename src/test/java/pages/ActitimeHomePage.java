package pages;



import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Autoconstant;
import utility.Basepage;

public class ActitimeHomePage extends Basepage implements Autoconstant
{

	public WebDriver driver;
	
		@FindBy(id="container_tt")
		private WebElement TimeTracklink;
//

		
		@FindBy(xpath = "//div[@id='container_tasks']")
		private WebElement Tasklink;


		
		@FindBy(id="container_reports")
		private WebElement Reportslink;


		
		@FindBy(id="container_users")
		private WebElement Userslink;


	
		
		@FindBy(xpath = "(//div[@class='menu_icon'])[1]")
		private WebElement AButton;


		
		@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
		private WebElement BButton;


		
		@FindBy(xpath = "(//div[@class='menu_icon'])[3]")
		private WebElement CButton;


		
		
		@FindBy(xpath = "(//div[@class='menu_icon'])[4]")
		private WebElement DButton;


		
		@FindBy(id = "logoutLink")

		private WebElement logoutButton;

		
		
		@FindBy(xpath = "//div[@class='collapsButton']")
		private WebElement AfterBeforeButton;


		
		
		@FindBy(xpath = "//div[@role='button']")
		private WebElement chatbotButton;


		
		
		public ActitimeHomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		
		  public void TimeTrack()
		  {
			  jsclik(TimeTracklink, driver);
			
		  }
		 
		public void Task()
		{
			jsclik(Tasklink, driver);
		
			
		}
		
		
		  public void Reports() 
		  {
			  jsclik(Reportslink, driver);
			  
		  
		  }
		  public void Users()
		  
		  {
			  jsclik(Userslink, driver);
			  
		  
		  } 
		  public void Frist()
		  
		  {
			  jsclik(AButton, driver);
			
		  }
		  public void Second()
		  
		  {
			  jsclik(BButton, driver);
			  
		  }
		  
		  public void Third(WebDriver driver)
		  
		  { 
			  JavascriptExecutor js=(JavascriptExecutor)driver;
			  js.executeScript("arguments[0].click()",CButton);
		  
		  } public void Fourth() 
		  {
			  jsclik(DButton, driver);
			  
		  }
		  public void Logout() 
		  { 
			  jsclik(logoutButton, driver);
			
		  
		  } public void AfterBefore(WebDriver driver) 
		  {
			  jsclik(AfterBeforeButton, driver);
			
		  } 
		 
		public void Chatbot(WebDriver driver) 
		{
			jsclik(chatbotButton, driver);
		}
		  
		 
	
		
		

		
		
		
		
		}
