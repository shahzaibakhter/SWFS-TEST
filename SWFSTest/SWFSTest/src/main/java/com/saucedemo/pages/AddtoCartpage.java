package com.saucedemo.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddtoCartpage extends loginpage {

	public AddtoCartpage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="user-name") WebElement usr;
	   @FindBy(id="password") WebElement passwd;
	   @FindBy(id="login-button") WebElement loginbtn;
	   @FindBy(id = "shopping_cart_container")
	   WebElement cart;

	   @FindBy(id = "checkout")
	   WebElement checkout;
	   @FindBy(id = "first-name")
	   WebElement firstname;
	   @FindBy(id = "last-name")
	   WebElement lastname;
	   @FindBy(id = "postal-code")
	   WebElement zip;
	   @FindBy(xpath = "//*[@id=\"continue\"]")
	   WebElement cont;
	   @FindBy(id = "finish")
	   WebElement finish;
	   @FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	   WebElement prd1;
	   @FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	   WebElement prd2;
	   @FindBy(xpath =  "//*[@id=\"react-burger-menu-btn\"]")
	   WebElement menu;
	   @FindBy(id = "logout_sidebar_link")
	   WebElement logout;	
	   @BeforeMethod
	   public void userdetails(String username,String paswd)
	   {
		usr.sendKeys(username);
		passwd.sendKeys(paswd);
		loginbtn.click();
		   
	   }
	   
	   String thanksmessage;
	   
	   public void cart() throws InterruptedException {
	       String title = driver.getTitle();
	       System.out.println(title);
	       driver.navigate().refresh(); 
	       ArrayList<WebElement> button = new ArrayList<>();

	  	  button.add(prd1);
	  	  button.add(prd2);
	      
	      
	       for(WebElement bt : button) {
	           bt.click();
	           driver.manage().timeouts()
	           .implicitlyWait(30, TimeUnit.SECONDS);
	           
	           }
	       
	       Thread.sleep(2000);
	       cart.click();
	       checkout.click();
	       firstname.sendKeys("shahzaib");
	       lastname.sendKeys("Akhter");
	       zip.sendKeys("4125");
	       cont.click();
	       finish.click();
	       thanksmessage = driver.findElement(By.cssSelector("h2.complete-header")).getText();
	       Assert.assertEquals(thanksmessage, "Thank you for your order!");

	       }
	   

	   
	   @AfterMethod
	   public void logout() {
	       menu.click();
	       logout.click();

	   }
	}

	

