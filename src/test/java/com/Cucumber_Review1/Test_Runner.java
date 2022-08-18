 package com.Cucumber_Review1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Cucumber_Review1\\Adactin.feature", glue = "com.stepdefinition")
public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUP() {

		driver = BaseClass.browserLuanch("chrome");

	}
    @AfterClass
	public static void tearDown() {
		
		driver.close();

	}

}
