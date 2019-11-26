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

public class NoticiasPageFactory extends TestBase{
	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public NoticiasPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash news icon']")
	IOSElement clickOnNoticiasIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='MaisFMUFIAM']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	IOSElement clickOnOneOfNoticiasInListIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"headSurveyInfoBtn\"]")
	IOSElement clickOnNoticiasLinkIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name=\"headerBackBtn\"]")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Notícias\"]")
	public IOSElement checkNoticiasIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"NOTÍCIAS\"]")
	public IOSElement checkNoticiasHeaderText;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[@name=\"NOTÍCIA\"]")
	public IOSElement checkSingleNoticiaHeaderText;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[@name=\"NOTÍCIA\"]")
	public IOSElement checkNoticiaLinkHeaderText;
	
	public void clickOnNoticiasIosFunction(){
		clickOnNoticiasIos.click();
	 }
	public void clickOnOneOfNoticiasInListFunction(){
		clickOnOneOfNoticiasInListIos.click();
	 }
	public void clickOnNoticiasLinkIosFunction(){
		clickOnNoticiasLinkIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void checkNoticiasIconTextFunction() throws IOException{
//		checkNoticiasIconText
		d=data.getData("Noticias");
//		Assert.assertEquals(prop.getProperty("Noticias"), checkNoticiasIconText.getText(),"Noticias Icon Text is Proper");
		Assert.assertEquals(d.get(1), checkNoticiasIconText.getText(),"Noticias Icon Text is Proper");
		test = extent.createTest("check Noticias Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Noticias Icon Text is "+checkNoticiasIconText.getText(), ExtentColor.GREEN));
		System.out.println("Noticias Icon Text is "+checkNoticiasIconText.getText());
	}
	public void checkNoticiasHeaderTextFunction() throws IOException{
		d=data.getData("Noticias");
//		Assert.assertEquals(prop.getProperty("HeaderNoticias"), checkNoticiasHeaderText.getText(),"Noticias Header Text is Proper");
		Assert.assertEquals(d.get(2), checkNoticiasHeaderText.getText(),"Noticias Header Text is Proper");
		test = extent.createTest("check Noticias Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Noticias Header Text is "+checkNoticiasHeaderText.getText(), ExtentColor.GREEN));
	}
	public void checkSingleNoticiaHeaderTextFunction() throws IOException{
		d=data.getData("Noticias");
		Assert.assertEquals(d.get(3), checkSingleNoticiaHeaderText.getText(),"After clicking on Single Noticias Header Text is Proper");
//		Assert.assertEquals(prop.getProperty("SingleNoticia"), checkSingleNoticiaHeaderText.getText(),"After clicking on Single Noticias Header Text is Proper");
		test = extent.createTest("check Single Noticia Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Single Noticia Header Text "+checkSingleNoticiaHeaderText.getText(), ExtentColor.GREEN));
	}
	public void checkNoticiaLinkHeaderTextFunction() throws IOException{
	d=data.getData("Noticias");
	Assert.assertEquals(d.get(4), checkNoticiaLinkHeaderText.getText(), "After clicking on link of Noticias Header Text is Proper");
//	Assert.assertEquals(prop.getProperty("LinkNoticia"), checkNoticiaLinkHeaderText.getText(), "After clicking on link of Noticias Header Text is Proper");
	test = extent.createTest("check Noticia Link Header Text");
	test.log(Status.INFO, MarkupHelper.createLabel("check Noticia Link Header Text is "+checkNoticiaLinkHeaderText.getText(), ExtentColor.GREEN));
	}
}
