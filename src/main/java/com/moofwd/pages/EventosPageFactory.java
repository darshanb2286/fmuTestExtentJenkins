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

public class EventosPageFactory extends TestBase{
	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public EventosPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeButton[2]")
	IOSElement clickOnEventosIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Antigos']")
	IOSElement clickOnEventosAntigoIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Eventos\"]")
	public IOSElement checkEventIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"EVENTOS\"]")
	public IOSElement checkEventHeaderText;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Atuais\"]")
	public IOSElement checkEventTabAtuaisText;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"Antigos\"]")
	public IOSElement checkEventTabAntigosText;
	
	public void clickOnEventosIosFunction(){
		clickOnEventosIos.click();
	 }
	public void clickOnEventosAntigoIosFunction(){
		clickOnEventosAntigoIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void checkEventIconTextFunction() throws IOException{
		d=data.getData("Events");
		Assert.assertEquals(d.get(1),checkEventIconText.getText());
//		Assert.assertEquals(prop.getProperty("Events"),checkEventIconText.getText());
		test = extent.createTest("check Event Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Event Icon Text is "+checkEventIconText.getText(), ExtentColor.GREEN));
	}
	public void checkEventHeaderTextFunction() throws IOException{
		d=data.getData("Events");
		Assert.assertEquals(d.get(2),checkEventHeaderText.getText());
//		Assert.assertEquals(prop.getProperty("HeaderEvents"),checkEventHeaderText.getText());
		test = extent.createTest("check Event Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Event Header Text is "+checkEventHeaderText.getText(), ExtentColor.GREEN));
	}
	public void checkEventTabAtuaisTextFunction() throws IOException{
		d=data.getData("Events");
//		Assert.assertEquals(prop.getProperty("CurrentEvents"),checkEventTabAtuaisText.isDisplayed());
		Assert.assertEquals(d.get(3),checkEventTabAtuaisText.isDisplayed());
		test = extent.createTest("check Event Tab Atuais Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Event Tab Atuais Text is "+checkEventHeaderText.getText(), ExtentColor.GREEN));
	}
	public void checkEventTabAntigosTextFunction() throws IOException{
		d=data.getData("Events");
		Assert.assertEquals(d.get(4),checkEventTabAntigosText.isDisplayed());
//		Assert.assertEquals(prop.getProperty("OldEvents"),checkEventTabAntigosText.isDisplayed());
		test = extent.createTest("check Event Tab Antigos Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Event Tab Antigos Text "+checkEventTabAntigosText.getText(), ExtentColor.GREEN));
	}
}
