package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import utility.Autoconstant;
import utility.Basepage;





public class CreateNewcustomer extends Basepage implements Autoconstant 
{
	public WebDriver driver;
		@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
		private WebElement Custermernametextfield;
		
		@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
		private WebElement Descriptiontecxtfield;
		
		@FindBy(xpath = "(//div[@class='dropdownButton'])[15]")
		private WebElement existingCustormerdrop;
		@FindBy(xpath = "//div[@class='components_button withPlusIcon']")
		private WebElement createCustomerButton;
		@FindBy(xpath = "//div[@class='nameDuplicateError inlineErrorMessage leftInlineErrorMessage']")
		private WebElement errormessage;
		@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
		private WebElement CancelButton;
		@FindBy(id = "customerLightBoxCloseButton")
		private WebElement close;
			public	CreateNewcustomer(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);
			
			}
			public void createcustomer() throws InterruptedException, IOException
			{
				sendkey(driver, Custermernametextfield, "Std", 3, 1);
				sendkey(driver, Descriptiontecxtfield, "Std", 5, 1);
				jsclik(createCustomerButton, driver);
				Thread.sleep(3000);
				
			}
			public void error()
			{
			//	String s="Customer with the specified name already exists";
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOf(errormessage));
		
				if(errormessage.getText().equals("Customer with the specified name already exists"))
					System.out.println("error message validate");
				else
					System.out.println("error message not validate");	
				
			}
			public void tstngerrorverification() 
			{
				String s="Customer with the specified name already exists";
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOf(errormessage));
				String v=errormessage.getText();
				//Assert.assertEquals(v,s);
			//	Assert.assertEquals(v, s, "error message not validated");
				SoftAssert a=new SoftAssert();
				//a.assertEquals(v, s);
				a.assertEquals(v, s,"error message not validate");
				System.out.println("error message validate");
				a.assertAll();
				
			}
			public void cancel()
			{
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOf(CancelButton));
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()",CancelButton);	
			Alert alert=	driver.switchTo().alert();
			alert.accept();
			}
			
}
