package fmuTestExtent;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.NoticiasPageFactory;

public class Noticias extends TestBase {
	@BeforeClass
	public void setUp() throws MalformedURLException {
		noticiasPage = new NoticiasPageFactory(iosDriver);
	}
	@Test(priority=16)
	public void click_On_noticias() throws IOException{
			noticiasPage.checkNoticiasIconTextFunction();
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_NOTICIAS_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTICIAS_IOS)).click();
			test = extent.createTest("click_On_noticias");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_noticias Started Executing.", ExtentColor.PURPLE));
			noticiasPage.clickOnNoticiasIosFunction();
//			System.out.println("Clicking on Noticias ");
			noticiasPage.checkNoticiasHeaderTextFunction();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Academico");
//			new TakeScreenshot(iosDriver);
//		}
	}
	@Test(priority=17)
	public void click_On_OneofNoticias() throws IOException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_ONE_OF_NOTICIAS_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_ONE_OF_NOTICIAS_IOS)).click();
			test = extent.createTest("click_On_noticias");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_noticias Started Executing.", ExtentColor.PURPLE));
			noticiasPage.clickOnOneOfNoticiasInListFunction();
//			System.out.println("Clicking on one of the Noticias from the list");
			noticiasPage.checkSingleNoticiaHeaderTextFunction();
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Academico");
//			new TakeScreenshot(iosDriver);
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
//			noticiasPage.clickOnBackButtonIosFunction();
//		}
	}
	@Test(priority=18)
	public void click_On_Noticias_link() throws InterruptedException, IOException{
//		try{
//			WebDriverWait wait= new WebDriverWait(this.iosDriver, 60);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(constantsTest.CLICK_ON_NOTICIAS_LINK_IOS)));
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_NOTICIAS_LINK_IOS)).click();
			test = extent.createTest("click_On_Noticias_link");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Noticias_link Started Executing.", ExtentColor.PURPLE));
			noticiasPage.clickOnNoticiasLinkIosFunction();
			System.out.println("Clicking on the Noticias link");
			Thread.sleep(5000);
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
			noticiasPage.checkNoticiaLinkHeaderTextFunction();
			test = extent.createTest("Getting back After clicking on the Noticias link");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Getting back After clicking on the Noticias link Started Executing.", ExtentColor.PURPLE));
			noticiasPage.clickOnBackButtonIosFunction();
			System.out.println("Clicking on back button to get back on the page of detail Noticias");
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
			test = extent.createTest("Getting back from the detail of Noticias");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Getting back from the detail of Noticias Started Executing.", ExtentColor.PURPLE));
			noticiasPage.clickOnBackButtonIosFunction();
			System.out.println("Clicking on back button to get back on the page of List of Noticias");
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
			test = extent.createTest("Getting back from the list of Noticias");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Getting back from the list of Noticias Started Executing.", ExtentColor.PURPLE));
			noticiasPage.clickOnBackButtonIosFunction();
			System.out.println("Clicking on back button to get back on Private Dashboard from Noticias");
//		}
//		catch(Exception e){
//			System.err.println("Unable to click on click_On_Academico");
//			new TakeScreenshot(iosDriver);
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
//			this.iosDriver.findElement(By.xpath(constantsTest.CLICK_ON_BACK_BUTTON_IOS)).click();
//			noticiasPage.clickOnBackButtonIosFunction();
//			noticiasPage.clickOnBackButtonIosFunction();
//		}	
	}
}
