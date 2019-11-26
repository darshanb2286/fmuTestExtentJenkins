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

public class DocumentsPageFactory extends TestBase {
	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public DocumentsPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash documents icon']")
	IOSElement clickOnDocumentsIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Documentos Institucionais\"]")
	public IOSElement checkDocumentsIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"DOCUMENTOS\"]")
	public IOSElement checekDocumentsHeaderText;
	
	public void clickOnDocumentsIosFunction(){
		clickOnDocumentsIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void checkDocumentsIconTextFunction() throws IOException{
		d=data.getData("Documents");
		Assert.assertEquals(d.get(1), checkDocumentsIconText.getText());
//		Assert.assertEquals(prop.getProperty("Documents"), checkDocumentsIconText.getText());
		test = extent.createTest("check Documents Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Documents Icon Text is "+checkDocumentsIconText.getText(), ExtentColor.GREEN));
	}
	public void checekDocumentsHeaderTextFunction() throws IOException{
		d=data.getData("Documents");
		Assert.assertEquals(d.get(2), checekDocumentsHeaderText.getText());
//		Assert.assertEquals(prop.getProperty("HeaderDocuments"), checekDocumentsHeaderText.getText());
		test = extent.createTest("check Documents Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Documents Header Text is "+checekDocumentsHeaderText.getText(), ExtentColor.GREEN));
	}
}
