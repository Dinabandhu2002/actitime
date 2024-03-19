package utility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basepage extends ExcelLibary implements Autoconstant
{
	//webdriver interface
	public void validateTitle(WebDriver driver,String excepectedTitle)
	{
		System.out.println(driver.getTitle());
			Assert.assertEquals(driver.getTitle(),excepectedTitle,"title is not matching");
			Reporter.log("title is matching");
			
	}
	public void validateCurrentURL(WebDriver driver,String excepectedTitle)
	{
		Assert.assertEquals(driver.getCurrentUrl(),excepectedTitle,"URL is not matching");
		Reporter.log("url is matching");
	}
	public void url(WebDriver driver,String url)
	{
		driver.get(url);
	}
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void minimize(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	public void fullscreen(WebDriver driver)
	{
		driver.manage().window().fullscreen();
	}
	public void close(WebDriver driver)
	{
		driver.close();
	}
	public void quit(WebDriver driver)
	{
		driver.quit();
	}
	public void pagesource(WebDriver driver)
	{
			System.out.println(driver.getPageSource());
	}
	
	public void navigateurl(WebDriver driver)
	{
		driver.navigate().to(url);
	}
	public void forword(WebDriver driver)
	{
		driver.navigate().forward();
	}
	public void backword(WebDriver driver)
	{
		driver.navigate().back();
	}
	public void refresh(WebDriver driver)
	{
		driver.navigate().refresh();;
	}
	public	void getsize(WebDriver driver)
	{
			System.out.println(driver.manage().window().getSize());

	}
	public	void setsize(WebDriver driver,int x,int y)
	{
		Dimension d=new Dimension(x, y);
		driver.manage().window().setSize(d);

	}
	public	void getposition(WebDriver driver)
	{
			System.out.println(driver.manage().window().getPosition());
	}
	public	void setposition(WebDriver driver,int x,int y)
	{
		Point p=new Point(x, y);
		driver.manage().window().setPosition(p);
	}
	//webelement interface
	public void clearText(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		Assert.assertEquals(element.getAttribute("value").isEmpty(),true,"text is not cleared");
		Reporter.log("test is delete");
	}
	public void sendkey(WebDriver driver,WebElement element,String s,int x,int y) throws IOException
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(ExcelLibary.getStringCellData(s, x, y));
		
	}
	public void clearDelete(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.CONTROL,"a");
		element.sendKeys(Keys.DELETE);
		Assert.assertEquals(element.getAttribute("value").isEmpty(),true,"text is not delete");
		Reporter.log("text is delete");
	}
	public void clearBackspace(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.CONTROL,"a");
		element.sendKeys(Keys.BACK_SPACE);
		Assert.assertEquals(element.getAttribute("value").isEmpty(),true,"text is not delete");
		Reporter.log("text is delete");
	}
	public void clearsingleBackspace(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.BACK_SPACE);
	}
	public void Copypaste(WebDriver driver,WebElement copyelement,WebElement pasteelement,String text)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(copyelement));
		wait.until(ExpectedConditions.visibilityOf(pasteelement));
		copyelement.sendKeys(Keys.CONTROL,"a");
		copyelement.sendKeys(Keys.CONTROL,"c");
		pasteelement.sendKeys(Keys.CONTROL,"v");
		Assert.assertEquals(pasteelement.getAttribute("value").equals(text),true,"text is not copy");
		Reporter.log("text is paste");
	}
	public void cutpaste(WebDriver driver,WebElement copyelement,WebElement pasteelement,String text)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(copyelement));
		wait.until(ExpectedConditions.visibilityOf(pasteelement));
		copyelement.sendKeys(Keys.CONTROL,"a");
		copyelement.sendKeys(Keys.CONTROL,"x");
		pasteelement.sendKeys(Keys.CONTROL,"v");
		Assert.assertEquals(pasteelement.getAttribute("value").equals(text),true,"text is not cut");
		Reporter.log("text is paste");
	}
	public void Enter(WebElement element,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.ENTER);
	}
	public void getattribute(WebElement element,WebDriver driver)
	{
		
	}
	public  void  Aclick(WebElement element,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	//javascript
	public void jsclik(WebElement element,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(element));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element);
	
	}
	//action
	public void acdoubleclik(WebElement element,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
		
	}
	//popup
	public void Alretpopupaccept(WebDriver driver)
	{
			Alert alret = driver.switchTo().alert();
			alret.accept();
	}
	public void Alretpopupdismiss(WebDriver driver)
	{
			Alert alret = driver.switchTo().alert();
			alret.dismiss();
	}
	public void Alretpopupgettext(WebDriver driver)
	{
			Alert alret = driver.switchTo().alert();
			alret.getText();
	}
}