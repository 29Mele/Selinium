package com.seleinium.partone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args ) {
	
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\melesse\\Desktop\\QA class\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    String baseurl = "Http://amazon.com";
	    driver.get(baseurl);
	  
	 
	    
	    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.close();
	}
	
	   
}
