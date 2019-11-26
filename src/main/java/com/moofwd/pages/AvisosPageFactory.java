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
import fmuTestExtent.testSample;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AvisosPageFactory extends TestBase{

	AppiumDriver<IOSElement> iosDriver;
	ArrayList d;
	dataDriven data=new dataDriven();
	public AvisosPageFactory(AppiumDriver<IOSElement> iosDriver){
//		this.iosDriver=iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[3]")
	public IOSElement clickOnAvisosIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public IOSElement clickOnOneOfAvisosIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Anúncios\"]")
	public IOSElement checkAvisosIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"ANÚNCIOS\"]")
	public IOSElement checkAvisosHeaderText;
	
	public void clickOnAvisosIosFunction(){
		System.out.println("clickOnAvisosIosFunction :: "+iosDriver);
		clickOnAvisosIos.click();
	}
	public void clickOnOneOfAvisosIosFunction() throws InterruptedException{
		try{
			clickOnOneOfAvisosIos.click();
		}
		catch(Exception e){
			clickOnBackButtonIos.click();
			System.out.println("To get back to the list of Avisos ");
			Thread.sleep(3000);
			clickOnBackButtonIos.click();
			System.out.println("To get back to the Private dashboard from the list of Avisos ");
		}
	}
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void checkAvisosIconTextFunction() throws IOException{
		d=data.getData("Announcement");
//		Assert.assertEquals(prop.getProperty("Announcement"),checkAvisosIconText.getText());
		Assert.assertEquals(d.get(1),checkAvisosIconText.getText());
		System.out.println("d.get(1)"+d.get(1)+" d ---"+d);
		test = extent.createTest("check Avisos Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Avisos Icon Text is "+checkAvisosIconText.getText(), ExtentColor.GREEN));
	}
	public void checkAvisosHeaderTextFunction() throws IOException{
		d=data.getData("Announcement");
		Assert.assertEquals(d.get(2),checkAvisosHeaderText.getText());
		System.out.println("d.get(2) --"+d.get(2));
//		Assert.assertEquals(prop.getProperty("HeaderAnnouncement"),checkAvisosHeaderText.getText());
		test = extent.createTest("check Avisos Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Avisos Header Text "+checkAvisosHeaderText.getText(), ExtentColor.GREEN));
	}

}
