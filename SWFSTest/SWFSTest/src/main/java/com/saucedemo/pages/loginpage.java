package com.saucedemo.pages;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	public void setup()
	{
		
//		System.setProperty(
//	            "webdriver.chrome.driver","D:\\chromedriver.exe");
	}
	
	WebDriver driver;
	@FindBy(id="user-name") 
	 WebElement userName;
	 
	 @FindBy(name="password") 
	 WebElement password;
	 
	 @FindBy(xpath="//*[@id=\"login-button\"]") 
	 WebElement loginBtn;
	
	
		 public loginpage(WebDriver d) {
			 driver =d;
			  PageFactory.initElements(driver, this);
			 }
		

	
	public void login(String uname,String pass)
	{
	userName.sendKeys(uname);
	  password.sendKeys(pass);
	  
	 
	}
	public void clicklogin()
	{
		 loginBtn.click();
	}
	public void dashboardurl()
	{
		String acturl="https://www.saucedemo.com/";
		 String expectedURL = driver.getCurrentUrl();
	    Assert.assertEquals(expectedURL, acturl);
	}
	
}
