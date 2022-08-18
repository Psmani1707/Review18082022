package com.Cucumber_Review1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLuanch(String string) {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		new ChromeDriver();

		driver.manage().window().maximize();
		return driver;

		// return driver;
	}

	public static void browserClose(String url) {

		driver.close();

	}

	public static void urlLaunch(String url) {

		driver.get(url);

	}

	public static void browserQuit() {

		driver.quit();

	}

	public static void sendKey(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement loginbtn) {
		loginbtn.click();

	}

	public static void clinc() {

	}

}
