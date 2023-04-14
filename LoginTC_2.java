package com.LoginTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.A1qa.BaseClass;

public class LoginTC_2 extends BaseClass {
	
	
	
	@Test(description= "Login with valid name and valid password")
	  public void login() throws IOException
	  {
			driver.get("https://www.saucedemo.com/");
			WebElement Name = driver.findElement(By.id("user-name"));
			
			WebElement Password = driver.findElement(By.name("password"));
			
			WebElement LoginBtn = driver.findElement(By.cssSelector("#login-button"));
			
			Name.sendKeys("standard_user");
			Password.sendKeys("secret_sauce");
			LoginBtn.click();
			
			String ExpectedTitle = "Swag Labs0";
			
			String ActualTitle = driver.getTitle();


			if(ExpectedTitle.equals(ActualTitle)) 
			{
				captureScreen(driver,"LoginTC_2");
				System.out.println("Test case passed");
			}
			else
			{
				captureScreen(driver,"LoginTC_2_Bug");
				System.out.println("Test case failed, Bug found");
			}	
	  }
  
  
}
