package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public String getURL() throws IOException {

		File fl = new File(
				"C:\\Users\\admin\\eclipse-workspace\\.metadata\\Maven_Project\\src\\main\\java\\com\\properties\\Adactin.Properties");

		FileInputStream fs = new FileInputStream(fl);

		p = new Properties();

		p.load(fs);

		String url = p.getProperty("url");

		return url;

	}

	public String getUserName() {

		return p.getProperty("username");

	}

	public String getpassword() {

		return p.getProperty("password");

	}
}
