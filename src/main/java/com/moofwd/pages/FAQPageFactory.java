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

public class FAQPageFactory extends TestBase{

	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public FAQPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash faq icon']")
	IOSElement clickOnFAQIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeSearchField[@name='o que você está procurando?']")
	IOSElement enterTextInTextFieldFAQIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"FAQ\"]")
	public IOSElement checkFAQIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"FAQ\"]")
	public IOSElement checkFAQHeaderText;
	
	public void clickOnFAQIosFunction(){
		clickOnFAQIos.click();
	 }
	public void enterTextInTextFieldFAQIosFunction(){
		enterTextInTextFieldFAQIos.sendKeys("test");
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void checkFAQIconTextFunction() throws IOException{
//		checkFAQIconText
		d=data.getData("FAQ");
		Assert.assertEquals(prop.getProperty("FAQ"), checkFAQIconText.getText());
		test = extent.createTest("check FAQ Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check FAQ Icon Text is "+checkFAQIconText.getText(), ExtentColor.GREEN));
	}
	public void checkFAQHeaderTextFunction() throws IOException{
		d=data.getData("FAQ");
		Assert.assertEquals(prop.getProperty("HeaderFAQ"), checkFAQHeaderText.getText());
		test = extent.createTest("check FAQ Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check FAQ Header Text is "+checkFAQHeaderText.getText(), ExtentColor.GREEN));
	}
}
