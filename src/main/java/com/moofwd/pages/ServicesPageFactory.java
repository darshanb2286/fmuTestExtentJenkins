package com.moofwd.pages;

import java.io.IOException;
import java.util.ArrayList;

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

public class ServicesPageFactory extends TestBase{
	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public ServicesPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash services icon']")
	IOSElement clickOnServicesIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	IOSElement clickOnOneofServicesIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Minha Universidade\"]")
	public IOSElement checkServicesIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"MINHA UNIVERSIDADE\"]")
	public IOSElement checkServicesHeaderText;
	
	public void clickOnServicesIosFunction(){
		clickOnServicesIos.click();
	 }
	
	public void clickOnOneofServicesIosFunction(){
		try{
		clickOnOneofServicesIos.click();
		Thread.sleep(5000);
		clickOnBackButtonIos.click();
		Thread.sleep(5000);
		clickOnBackButtonIos.click();
		}
		catch(Exception e){
			clickOnBackButtonIos.click();
		}
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void checkServicesIconTextFunction() throws IOException{
		d=data.getData("Services");
		Assert.assertEquals(d.get(1), checkServicesIconText.getText());
//		Assert.assertEquals(prop.getProperty("MyUniversityServices"), checkServicesIconText.getText());
		test = extent.createTest("check Services Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Services Icon Text is "+checkServicesIconText.getText(), ExtentColor.GREEN));
	}
	public void checkServicesHeaderTextFunction() throws IOException{
		d=data.getData("Services");
		Assert.assertEquals(d.get(2), checkServicesHeaderText.getText());
//		Assert.assertEquals(prop.getProperty("HeaderMyUniversityServices"), checkServicesHeaderText.getText());
		test = extent.createTest("check Services Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Services Header Text is "+checkServicesHeaderText.getText(), ExtentColor.GREEN));
	}
}
