package com.seleinium.partone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geico {
	


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\melesse\\Desktop\\QA class\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    String baseurl = "Http:/navyfedralcreditunion.com";
	    driver.get(baseurl);
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.name("user")).sendKeys("Mele");
	    
	    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.close();
	   
	}

	private static void senkeys(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
