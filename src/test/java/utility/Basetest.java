package utility;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Basetest implements Autoconstant
{
	public static  WebDriver driver;
	@BeforeSuite
	public void executionstart()
	{
		Reporter.log("suite executoion start");
	}
	@AfterSuite
	public void executioncomplete()
	{
		Reporter.log("suite executoion complete");
	}
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
}
