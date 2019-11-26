package com.moofwd.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.moofwd.base.TestBase;

import fmuTestExtent.dataDriven;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.bytebuddy.implementation.bind.annotation.Super;

public class PerfilPageFactory extends TestBase{
	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public PerfilPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@FindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[1]")
	IOSElement clickOnPerfilIos;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Profile edit image\"]")
	IOSElement clickOnEditPerfilIos;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"check edition icon\"]")
	IOSElement clickOnCheckEditionPerfilIconIos;
	
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"headerBackBtn\"]")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(id="Perfil")
	public IOSElement CheckProfileIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='PERFIL']")
	public IOSElement CheckProfileHeaderText;
	
	public void clickOnPerfilIosFunction(){
		clickOnPerfilIos.click();
	 }
	public void clickOnEditPerfilIosFunction(){
		clickOnEditPerfilIos.click();
	 }
	public void clickOnCheckEditionPerfilIconIosFunction(){
		clickOnCheckEditionPerfilIconIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void CheckProfileIconTextFunction() throws IOException{
//		Assert.assertEquals(prop.getProperty("Profile"), CheckProfileIconText);
//		System.out.println("Test");
		d=data.getData("Profile");
		Assert.assertEquals(d.get(1), CheckProfileIconText.getText());
//		Assert.assertEquals(prop.getProperty("Profile"), CheckProfileIconText.getText());
		test = extent.createTest("Check Profile Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("Check Profile Icon Text is "+CheckProfileIconText.getText(), ExtentColor.GREEN));
//		System.out.println("Test1"+ prop.getProperty("Profile")+ "Test2"+ CheckProfileHeaderText.getText());
	}
	public void CheckProfileHeaderTextFunction() throws IOException{
		d=data.getData("Profile");
		Assert.assertEquals(d.get(2), CheckProfileHeaderText.getText());
//		Assert.assertEquals(prop.getProperty("HeaderProfile"), CheckProfileHeaderText.getText());
		test = extent.createTest("Check Profile Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("Check Profile Header Text is "+CheckProfileHeaderText.getText(), ExtentColor.GREEN));
	}
}
