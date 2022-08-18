package com.page.object.manager;

import org.openqa.selenium.WebDriver;

import com.pom.Login_Page;

public class P_O_Manager {

	public WebDriver driver;

	private Login_Page lp;

	public P_O_Manager(WebDriver driver2) {

		this.driver = driver2;

	}

	public Login_Page getLoginPage() {

		if (lp == null) {

			lp = new Login_Page(driver);
		}

		return lp;
	}

}
