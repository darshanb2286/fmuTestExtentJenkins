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

public class SPTrancePageFactory extends TestBase {
	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public SPTrancePageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"dash sptrans icon\"]")
	IOSElement clickOnSPTranceIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Carteirinha\"]")
	IOSElement clickOnSPTranceCarteiRinhaIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"headerBackBtn\"]")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"SPTrans\"]")
	public IOSElement checkSpTransIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"PASSE ESCOLAR\"]")
	public IOSElement checekSpTransHeaderText;
	
	public void clickOnSPTranceIosFunction(){
		clickOnSPTranceIos.click();
	 }
	public void clickOnSPTranceCarteiRinhaIosFunction(){
		clickOnSPTranceCarteiRinhaIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void checkSpTransIconTextFunction() throws IOException{
		d=data.getData("SPTrans");
		Assert.assertEquals(d.get(1), checkSpTransIconText.getText());
//		Assert.assertEquals(prop.getProperty("SPTrans"), checkSpTransIconText.getText());
		test = extent.createTest("check SpTrans Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check SpTrans Icon Text is "+checkSpTransIconText.getText(), ExtentColor.GREEN));
	}
	public void checekSpTransHeaderTextFunction() throws IOException{
		d=data.getData("SPTrans");
		Assert.assertEquals(d.get(2), checekSpTransHeaderText.getText());
//		Assert.assertEquals(prop.getProperty("HeaderSPTrance"), checekSpTransHeaderText.getText());
		test = extent.createTest("check SpTrans Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check SpTrans Header Text is "+checekSpTransHeaderText.getText(), ExtentColor.GREEN));
	}
}
