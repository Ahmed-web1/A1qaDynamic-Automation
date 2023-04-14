package com.LoginTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.A1qa.BaseClass;

public class LoginTC_1 extends BaseClass {
	
	
	
	@Test(description= "Login with invalid name and invalid password")
	  public void login() throws IOException
	  {
			driver.get("https://www.saucedemo.com/");
			WebElement Name = driver.findElement(By.id("user-name"));
			
			WebElement Password = driver.findElement(By.name("password"));
			
			WebElement LoginBtn = driver.findElement(By.cssSelector("#login-button"));
			
			Name.sendKeys("test");
			Password.sendKeys("1234456");
			LoginBtn.click();
			
			String ExpectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
			
			String ActualMessage = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")).getText();


			if(ExpectedErrorMessage.equals(ActualMessage)) 
			{
				captureScreen(driver,"LoginTC_1");
				System.out.println("Test case passed");
			}
			else
			{
				System.out.println("Test case failed, Bug found");
			}	
	  }
  
  
}
