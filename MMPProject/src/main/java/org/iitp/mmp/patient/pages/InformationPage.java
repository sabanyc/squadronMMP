package org.iitp.mmp.patient.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InformationPage {
	WebDriver driver;

	public InformationPage(WebDriver driver) {
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
	boolean result = true;
	return result;

	}

	public boolean navigateToModule(String modulename) {
	driver.findElement(By.xpath("//span[contains(text(),'" + modulename + "')]")).click();
	boolean result1 = true;
	return result1;
	}

	public boolean fetchInformationMessage(String expected) {
	String actual = driver.findElement(By.xpath("//div[@class='panel-title']")).getText();
	System.out.println("The Actual Value" + actual);
	boolean result2 = false;
	if(actual.contains(expected))
	{
	result2 = true;
	System.out.println("Testcase is Pass");
	}
	else
	{
	System.out.println("Testcase is Fail");

	}
	return result2;

	}

	public void closeBrowser() {
	driver.quit();
	}

}
