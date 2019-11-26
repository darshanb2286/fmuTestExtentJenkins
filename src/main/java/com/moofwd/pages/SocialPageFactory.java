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

public class SocialPageFactory extends TestBase{
	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public SocialPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash social icon']")
	IOSElement clickOnResdesSocialIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	IOSElement clickOnResdesSocialFacebookIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]")
	IOSElement clickOnResdesSocialTwitterIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
	IOSElement clickOnResdesSocialYouTubeIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]")
	IOSElement clickOnResdesSocialInstagramIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]")
	IOSElement clickOnResdesSocialLinkedInIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Mídias Sociais\"]")
	public IOSElement checkSocialIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[@name=\"REDES SOCIAIS\"]")
	public IOSElement checkSocialHeaderText;
	
	public void clickOnResdesSocialIosFunction(){
		clickOnResdesSocialIos.click();
	 }
	public void clickOnResdesSocialFacebookIosFunction(){
		clickOnResdesSocialFacebookIos.click();
	 }
	public void clickOnResdesSocialTwitterIosFunction(){
		clickOnResdesSocialTwitterIos.click();
	 }
	public void clickOnResdesSocialYouTubeIosFunction(){
		clickOnResdesSocialYouTubeIos.click();
	 }
	public void clickOnResdesSocialInstagramIosFunction(){
		clickOnResdesSocialInstagramIos.click();
	 }
	public void clickOnResdesSocialLinkedInIosFunction(){
		clickOnResdesSocialLinkedInIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void checkSocialIconTextFunction() throws IOException{
		d=data.getData("Social");
		Assert.assertEquals(d.get(1), checkSocialIconText.getText());
//		Assert.assertEquals(prop.getProperty("Social"), checkSocialIconText.getText());
		test = extent.createTest("check Social Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Social Icon Text is "+checkSocialIconText.getText(), ExtentColor.GREEN));
	}
	public void checkSocialHeaderTextFunction() throws IOException{
		d=data.getData("Social");
		Assert.assertEquals(d.get(2), checkSocialHeaderText.getText());
//		Assert.assertEquals(prop.getProperty("HeaderSocial"), checkSocialHeaderText.getText());
		test = extent.createTest("check Social Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Social Header Text is "+checkSocialHeaderText.getText(), ExtentColor.GREEN));
	}
}
