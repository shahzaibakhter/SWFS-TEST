/**
 * 
 */
package com.saucedemo.tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.pages.AddtoCartpage;
import com.saucedemo.pages.LogoutPage;
import com.saucedemo.pages.loginpage;

/**
 * 
 */
public class Testcases {

	
	String uname="standard_user",pass="secret_sauce";
	String set=	System.setProperty(
            "webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	//application logins
	@Test(priority = 1)
	public void verifylogin() 
	{
		
		System.out.println("shahzaib");
		loginpage p1 = new loginpage(driver);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		p1.clicklogin();
	}
	
	
	//Add items to the cart and proceeds
	@Test(priority = 2)
	public void addcart() throws InterruptedException 
	{
           AddtoCartpage p2 =new AddtoCartpage(driver);
           driver.get("https://www.saucedemo.com/");
           p2.userdetails(uname,pass);
           p2.cart();
           p2.logout();
	      //  driver.close();
	}
	
	@AfterTest
	public void EndSession() {
	    if (driver == null) {
	    	driver.close();
	        driver.quit();
	    }
	}
}
