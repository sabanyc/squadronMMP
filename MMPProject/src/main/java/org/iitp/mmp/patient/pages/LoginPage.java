package org.iitp.mmp.patient.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean intiateDriver() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		String title = driver.getTitle();
		System.out.println("Title :" + title);
		boolean res = true;
		return res;

	}

	public boolean login(String userName, String password) {

		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		System.out.println("Login into Patient Page");
		
		boolean result = true;
		return result;

	}
	
	public void closeBrowser() {
		driver.quit();
		}

}
