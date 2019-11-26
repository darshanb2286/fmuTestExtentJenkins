package fmuTestExtent;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;
import com.moofwd.pages.PerfilPageFactory;

public class Perfil extends TestBase {
	@BeforeClass
	public void setUp() throws MalformedURLException {
		perfilPage = new PerfilPageFactory(iosDriver);
	}
	@Test(priority=21)
	public void click_On_Perfil() throws IOException, InterruptedException {
			Thread.sleep(3000);
			perfilPage.CheckProfileIconTextFunction();
			test = extent.createTest("click_On_Perfil");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Perfil Started Executing.", ExtentColor.PINK));
			perfilPage.clickOnPerfilIosFunction();
			System.out.println("Clicking on Perfil on Private dashboard======"+prop.getProperty("HeaderProfile"));
			Thread.sleep(3000);
			perfilPage.CheckProfileHeaderTextFunction();

	}
	@Test(priority=22)
	public void click_On_Edit_Perfil() throws InterruptedException {
			Thread.sleep(5000);
			test = extent.createTest("click_On_Edit_Perfil");
			test.log(Status.INFO, MarkupHelper.createLabel("verify click_On_Edit_Perfil Started Executing.", ExtentColor.PINK));
			perfilPage.clickOnEditPerfilIosFunction();
			System.out.println("Clicking on Edit Icon of Perfil ");
	}
	@Test(priority=23)
	public void click_On_Check_Edition() throws InterruptedException {
			test = extent.createTest("Perfil_click_On_Check_Edition");
			test.log(Status.INFO, MarkupHelper.createLabel("verify Perfil_click_On_Check_Edition Started Executing.", ExtentColor.PINK));
			Thread.sleep(5000);
			perfilPage.clickOnCheckEditionPerfilIconIosFunction();
			System.out.println("Clicking on Save Icon i.e Check Edition Perfil Icon on Private dashboard ");
				Thread.sleep(12000);
				test = extent.createTest("clickOnBackButtonIos_To get back on Private dashboard After click_On_Check_Edition ");
				test.log(Status.INFO, MarkupHelper.createLabel("verify clickOnBackButtonIos_To get back on Private dashboard After click_On_Check_Edition Started Executing.", ExtentColor.PINK));
				perfilPage.clickOnBackButtonIosFunction();
				System.out.println("Getting back on Private Dashboard ");
	}
}
