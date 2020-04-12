import org.iitp.mmp.patient.pages.InformationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Information_US004_Test {
WebDriver driver;

@Test
public void validateInformationTab() throws Exception {
SoftAssert sa = new SoftAssert();
// Creation of object invokes the Constructor method
InformationPage infoObj = new InformationPage(driver);
boolean res = infoObj.intiateDriver();
sa.assertTrue(res);
boolean result1 = infoObj.login("ria1", "Ria12345");
sa.assertTrue(result1);
boolean result2 = infoObj.navigateToModule("Information");
sa.assertTrue(result2);
boolean result3 = infoObj.fetchInformationMessage("that boosts productivity by automating the day-to-day tasks that can slow");
sa.assertTrue(result3);

// Mandatory statement
sa.assertAll();

}
}

