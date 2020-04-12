import org.iitp.mmp.patient.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {

	WebDriver driver;
	@Test
	public void validateLogin() {
		
		SoftAssert sa = new SoftAssert();
		// Creation of object invokes the Constructor method
		LoginPage lp = new LoginPage(driver);
		boolean result =lp.intiateDriver();
		sa.assertTrue(result);
		boolean result1 =lp.login("ria1", "Ria12345");
		sa.assertTrue(result1);
		
		lp.closeBrowser();
	
	
		
	
	
	}

}



