package com.seleinium.partone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\melesse\\Desktop\\QA class\\Software\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	}

}
