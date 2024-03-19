package pages;

import java.time.Duration;
import java.util.ArrayList;
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
import utility.Basetest;



public class deletetypeofwork extends Basepage implements Autoconstant
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
		@FindBy(xpath = "//span[text()='automobileBussiness']/../../../../../..//span[@class='components-Checkbox-checkbox--oI0agIpM components-Checkbox-listbox--DAdlgM_r components-ItemListPage-ItemList-checkbox--naq_520n']")
	
	private WebElement atomobilecheckbox;
		
		
		@FindBy(xpath = "//div[text()='Delete']")
		private WebElement DeleteButton;
		
		@FindBy(xpath = "//button[text()='OK, Delete']")
		private WebElement OkkdeleteButton;
		
		@FindBy(xpath = "//span[@class='containers-TypesOfWorkItemList-nameColumn--1KO8hhVy']")
		private List<WebElement> alloption;
		public deletetypeofwork(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		public void deletework()
		{
			jsclik(atomobilecheckbox, driver);
			jsclik(DeleteButton, driver);
			jsclik(OkkdeleteButton, driver);		
				
		}
		/*
		 * public void validation() { wait=new WebDriverWait(driver,
		 * Duration.ofSeconds(15));
		 * wait.until(ExpectedConditions.visibilityOfAllElements(alloption));
		 * List<String> a1=new ArrayList<>();
		 * 
		 * for(int i=0;i<alloption.size();i++) { a1.add(alloption.get(i).getText()); }
		 * if(a1.contains("automobileBussiness")) {
		 * System.out.println("work is not deleted"); } else {
		 * System.out.println("work is deleted"); }
		 * 
		 * }
		 */
}
		


