package com.Test.Usecases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.test.Configuration.BaseClass;

import cucumber.api.java.en.*;

public class Login extends BaseClass{
	
	@Given("^Open the URL$")
	public void open_the_URL() throws Throwable {
		InitialiseParameter();
	    InitialiseDriver();
	    CallURL(CON.getProperty("ApplictaionURL"));
	}
	
	@Then("^Enter the UserName$")
	public void enter_the_UserName() throws Throwable {
		driver.findElement(By.linkText("Signin")).click();
		List<WebElement> un= driver.findElements(By.xpath(OR.getProperty("userNameTextList"))); 
		WebElement userName = displayedElement(un);
		userName.sendKeys("surajpillainew123"); 
	}

	@Then("^Enter the Password$")
	public void enter_the_Password() throws Throwable {
		List<WebElement> pwd= driver.findElements(By.xpath(OR.getProperty("passwordTextList"))); 
		WebElement userName = displayedElement(pwd);
		userName.sendKeys("welcome123"); 
	}

	@Then("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
		List<WebElement> loginButn = driver.findElements(By.xpath(OR.getProperty("loginButtonList")));
        WebElement loginButton = displayedElement(loginButn);
		loginButton.click();
		
		
	}

}
