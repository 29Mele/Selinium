package com.seleinium.partone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\melesse\\Desktop\\QA class\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			String baseurl = "Http:/wellsfargo.com";
			driver.get(baseurl);
			driver.manage().window().maximize();
			
			driver.findElement(By.name("j_username")).sendKeys("Test");
			driver.findElement(By.xpath("//*[@id=\"nbaDefaultPanels1\"]/div/div/p/a")).click();
			
			Thread.sleep(10000);
			driver.close();
			
		}
	}

