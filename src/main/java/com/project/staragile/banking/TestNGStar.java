package com.project.staragile.banking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.*;
import org.testng.Assert;

public class TestNGStar {
	
    @Test
	public void verifyPageContent() {
		WebDriverManager.chromedriver().setup();
//		WebDriver driver =new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://localhost:8081/contact.html");	       
        WebElement inputName = driver.findElement(By.name("Name"));
        WebElement inputNumber = driver.findElement(By.name("PhoneNumber"));
        WebElement inputMail = driver.findElement(By.name("Email"));
        WebElement inputMessage = driver.findElement(By.name("Message"));
        
        
        
        inputName.sendKeys("admin");
        inputNumber.sendKeys("1234567890");
        inputMail.sendKeys("admin@gamil.com");
        inputMessage.sendKeys("Hii This is my admin content");

//        WebElement loginButton = driver.findElement(By.cssSelector(".send_bt a"));
//        // Click the login button
//        loginButton.click();
		
	}

}
