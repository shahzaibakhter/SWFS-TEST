package com.saucedemo.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.saucedemo.pages.AddtoCartpage;
import com.saucedemo.pages.loginpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep {
	
	
	WebDriver driver;
	loginpage lp;	
	@Given("browser  opens")
	public void browser_opens() {
	   
		System.setProperty(
	            "webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println("shahzaib");
		driver.manage().window().maximize();
	}

	@And("user is at the login page")
	public void user_is_at_the_login_page() {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^user enter(.*) and(.*)$")
	public void user_enter(String uname,String pass) {
		lp=new loginpage(driver);
		lp.login(uname,pass);
	   
	}

	@And("user click on login")
	public void user_click_on_login() {
	   lp.clicklogin();
	}

	@Then("user is navigated to dashboard")
	public void user_is_navigated_to_dashboard() {
	   lp.dashboardurl();
	}

	@And("user click on logout")
	public void user_click_on_logout() {
	    AddtoCartpage lout = new AddtoCartpage(driver);
	    lout.logout();
	}

	@Then("user navigated to login page")
	public void user_navigated_to_login_page() {
	   loginpage lp=new loginpage(driver);
	   lp.dashboardurl();
	}

	
	
	
}
