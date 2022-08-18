package com.Cucumber_Review1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.page.object.manager.P_O_Manager;
import com.pom.Login_Page;
import com.properties.FileReaderManager;

public class Runner extends BaseClass {

	public static WebDriver driver = browserLuanch("chrome");

	public static P_O_Manager pom = new P_O_Manager(driver);

	public static void main(String[] args) throws Throwable {

	
		urlLaunch(FileReaderManager.get_F_R_M().confiReader().getURL());
		
		//String userName = FileReaderManager.get_F_R_M().confiReader().getUserName();
		
		sendKey(pom.getLoginPage().getUsername(), FileReaderManager.get_F_R_M().confiReader().getUserName());
		
		//String getpassword = FileReaderManager.get_F_R_M().confiReader().getpassword();
		
		sendKey(pom.getLoginPage().getPassword(), FileReaderManager.get_F_R_M().confiReader().getpassword());
		
		clickOnElement(pom.getLoginPage().getLogin());

	}

}
