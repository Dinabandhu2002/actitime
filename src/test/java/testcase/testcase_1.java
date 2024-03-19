package testcase;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.ActitimeHomePage;
import pages.ActitimeLoginPage;
import utility.Basetest;
@Listeners(utility.Screenshot.class)
public class testcase_1 extends Basetest
{
	@Test
	public void login() throws IOException
	{
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.Login();
	}
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		ActitimeHomePage home= new ActitimeHomePage(driver);
		home.Logout();
	}
}
