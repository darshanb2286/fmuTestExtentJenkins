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

public class ContactUsPageFactory extends TestBase{
	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public ContactUsPageFactory(AppiumDriver<IOSElement> iosDriver){
//		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);		
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash contact icon']")
	IOSElement clickOnContactUsIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Fale Conosco\"]")
	public IOSElement checkContactUsIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"FALE CONOSCO\"]")
	public IOSElement checkContactUsHeaderText;
	
	public void clickOnContactUsIosFunction(){
		clickOnContactUsIos.click();
	 }
	
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	 }
	public void checkContactUsIconTextFunction() throws IOException{
		d=data.getData("ContactUs"); 
		Assert.assertEquals(d.get(1), checkContactUsIconText.getText());
		System.out.println("d.get(1)"+d.get(1));
//		Assert.assertEquals(prop.getProperty("ContactUs"), checkContactUsIconText.getText());
		test = extent.createTest("check ContactUs Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check ContactUs Icon Text "+checkContactUsIconText.getText(), ExtentColor.GREEN));
	}
	public void checkContactUsHeaderTextFunction() throws IOException{
		d=data.getData("ContactUs");
		Assert.assertEquals(d.get(2), checkContactUsHeaderText.getText());
		System.out.println("d.get(2)"+d.get(2));
//		Assert.assertEquals(prop.getProperty("HeaderContactUs"), checkContactUsHeaderText.getText());
		test = extent.createTest("check ContactUs Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check ContactUs Header Text "+checkContactUsHeaderText.getText(), ExtentColor.GREEN));
	}
}
