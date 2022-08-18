package com.stepdefinition;

import com.Cucumber_Review1.BaseClass;
import com.page.object.manager.P_O_Manager;
import com.properties.FileReaderManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SpetDefinition extends BaseClass {

	public static P_O_Manager pom = new P_O_Manager(driver);

	@Given("User Must Launch The URL")
	public void user_must_launch_the_url() throws Throwable {
		urlLaunch(FileReaderManager.get_F_R_M().confiReader().getURL());
	}

	@When("User Enter The UserName In The UserName Field")
	public void user_enter_the_user_name_in_the_user_name_field() {
		sendKey(pom.getLoginPage().getUsername(), FileReaderManager.get_F_R_M().confiReader().getUserName());
	}

	@When("User Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {

		sendKey(pom.getLoginPage().getPassword(), FileReaderManager.get_F_R_M().confiReader().getpassword());

	}

	@Then("User Click The Login Button And It Naviga'tes To The Search Hotal Page")
	public void user_click_the_login_button_and_it_naviga_tes_to_the_search_hotal_page() {
		//clickOnElement(pom.getLoginPage().getLogin());

		
	}

}
