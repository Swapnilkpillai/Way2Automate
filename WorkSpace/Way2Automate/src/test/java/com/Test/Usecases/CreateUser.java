package com.Test.Usecases;

import com.test.Configuration.BaseClass;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class CreateUser extends BaseClass{
	
	@Then("^Enter Name$")
	public void enter_Name() throws Throwable {
	    Set_Value_In_TextBox("Test", OR.getProperty("RegistrationName"));
	}

	@Then("^Enter Phone$")
	public void enter_Phone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Set_Value_In_TextBox("9168008787", OR.getProperty("RegistrationPhone"));
	}

	@Then("^Enter Email Id$")
	public void enter_Email_Id() throws Throwable {
		Set_Value_In_TextBox("abhinavgoel5397@gmail.com"
							, OR.getProperty("RegistrationEmail"));
	}

	@Then("^Enter City$")
	public void enter_City() throws Throwable {
		Set_Value_In_TextBox("Pune", OR.getProperty("RegistrationCity"));
	}

	@Then("^Enter Username$")
	public void enter_Username() throws Throwable {
		Set_Value_In_TextBox("way2Automate", OR.getProperty("RegistrationUsername"));
	}

	@Then("^Enter Password$")
	public void enter_Password() throws Throwable {
		Set_Value_In_TextBox("TestPassword", OR.getProperty("RegistrationPassword"));
	}

	@Then("^Click Submit$")
	public void click_Submit() throws Throwable {
	    Click_Button(OR.getProperty("RegistrationSubmitBtn"));
	}

}
