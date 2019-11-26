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

public class FinancePageFactory extends TestBase{
	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public FinancePageFactory(AppiumDriver<IOSElement> iosDriver) {
	this.iosDriver = iosDriver;
	PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
}
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash Finanzas icon']")
	IOSElement clickOnFinanceIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='DOWNLOAD RECEIPT'])[1]")
	IOSElement ClickOnFinanceDownloadReceiptIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='X']")
	IOSElement ClickOnClosePopUpFinanceIos;
	
	@iOSFindBy(xpath="1276")
	IOSElement ScrollToParticularElementFinanceIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Pagos']")
	IOSElement ClickOnFinancePaidIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"headerBackBtn\"]")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Financeiro\"]")
	public IOSElement checkFinanceIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"FINANCES\"]")
	public IOSElement checkFinnaceHeaderText;
	
	public void clickOnFinanceIosFunction(){
		clickOnFinanceIos.click();
	 }
	public void ClickOnFinanceDownloadReceiptIosFunction(){
		ClickOnFinanceDownloadReceiptIos.click();
	 }
	public void ClickOnClosePopUpFinanceIosFunction(){
		ClickOnClosePopUpFinanceIos.click();
	 }
	public void ScrollToParticularElementFinanceIosFunction(){
		ScrollToParticularElementFinanceIos.click();
	 }
	public void ClickOnFinancePaidIosFunction(){
		ClickOnFinancePaidIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void checkFinnaceHeaderTextFunction() throws IOException{
		d=data.getData("Finance");
		Assert.assertEquals(d.get(2), checkFinnaceHeaderText.getText());
//		Assert.assertEquals(prop.getProperty("HeaderFinance"), checkFinnaceHeaderText.getText());
		test = extent.createTest("check Finnace Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Finnace Header Text is "+checkFinnaceHeaderText.getText(), ExtentColor.GREEN));
	}
	public void checkFinanceIconTextFunction() throws IOException{
		d=data.getData("Finance");
//		Assert.assertEquals(prop.getProperty("Finance"), checkFinanceIconText.getText());
		Assert.assertEquals(d.get(1), checkFinanceIconText.getText());
		test = extent.createTest("check Finance Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Finance Icon Text is "+checkFinanceIconText.getText(), ExtentColor.GREEN));	
	}
}
