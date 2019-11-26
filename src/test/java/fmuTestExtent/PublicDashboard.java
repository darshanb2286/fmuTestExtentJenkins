package fmuTestExtent;


import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.PublicDashboardPage;

public class PublicDashboard extends TestBase {
	WebDriverWait wait;
//	Gson gson = new Gson();
//	 @BeforeTest
	@BeforeClass
	public void setUp() throws MalformedURLException {
		publicDashboardPage = new PublicDashboardPage(iosDriver);
	}

	@Test(priority = 1)
	public void clickOnArrow() throws InterruptedException {
//		try {
//			Alert alert = iosDriver.switchTo().alert();
//			alert.accept();
			System.out.println("test "+ test+" extent "+ extent);
			test = extent.createTest("LogIn_clickOnArrow");
			test.log(Status.INFO, MarkupHelper.createLabel("verify LogIn_clickOnArrow Started Executing.", ExtentColor.BLUE));
			System.out.println("iosDriver is: " + iosDriver);
			publicDashboardPage.clickOnForwardArrowIosFunction();
			System.out.println("Clicking on Forward arrow on Public Dashboard");
			// test.click();
//		} catch (Exception e) {
//			System.err.println("Unable to click on Forward Arrow" + e);
//			new TakeScreenshot(iosDriver);
//		}
	}

	@Test(priority =2)
	public void clickOn_Ir_Para_O_LogIn() throws InterruptedException {
//		try {
			test = extent.createTest("LogIn_clickOn_Ir_Para_O_LogIn");
			test.log(Status.INFO, MarkupHelper.createLabel("verify LogIn_clickOn_Ir_Para_O_LogIn Started Executing.", ExtentColor.BLUE));
			System.out.println("clickOn_Ir_Para_O_LogIn :: "+  iosDriver);
			publicDashboardPage.clickOnIrParaLogInIosFunction();
			System.out.println("Clicking on IR Para O LogIn on Public Dashboard");
//		} catch (Exception e) {
//			System.err.println("Unable to click on Ir_Para_O_LogIn");
//			new TakeScreenshot(iosDriver);
//		}
	}

	@Test(priority = 3)
	public void credentials_Enter_LogIn() throws InterruptedException {
//		try {
			test = extent.createTest("LogIn_credentials_Enter_LogIn");
			test.log(Status.INFO, MarkupHelper.createLabel("verify LogIn_credentials_Enter_LogIn Started Executing.", ExtentColor.BLUE));
			
			System.out.println("Entering the values of Username"+prop.getProperty("UserName"));
			publicDashboardPage.enterUserNameIosFunction(prop.getProperty("UserName"));
			
//			try {
				publicDashboardPage.enterPasswordIosFunction(prop.getProperty("Password"));
				System.out.println("Entering the values of Password"+ prop.getProperty("Password"));
				publicDashboardPage.clickOnEntrarIosFunction();
				System.out.println("Clicking on Entrar Button");
				
//			} catch (Exception e) {
//				System.err.println("Unable to Click & Enter the details of Password");
//				new TakeScreenshot(iosDriver);
//			}
//		} catch (Exception e) {
//			System.err.println("Unable to click on Ir_Para_O_LogIn");
//			new TakeScreenshot(iosDriver);
//		}
	}

	@Test(priority = 4)
	public void clickOn_Li_e_concordo() throws InterruptedException {
		
			test = extent.createTest("LogIn_clickOn_Li_e_concordo");
			test.log(Status.INFO, MarkupHelper.createLabel("verify LogIn_clickOn_Li_e_concordo Started Executing.", ExtentColor.BLUE));
			publicDashboardPage.clickOnLiEConcordoIosFunction();
			System.out.println("Clicking on Li E Concordo");

	}
}
