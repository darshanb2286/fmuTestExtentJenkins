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

public class NotificationsPageFactory extends TestBase{
	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public NotificationsPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash notifications icon']")
	IOSElement clickOnNotificationsIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='setting icon']")
	IOSElement clickOnNotificationsSettingsIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Salvar']")
	IOSElement clickOnNotificationsSaveIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Notificações\"]")
	public IOSElement checkNotificationsIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"NOTIFICAÇÕES\"]")
	public IOSElement checkNotificationsHeaderText;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"CONFIGURAÇÕES DE NOTIFICAÇÃO\"]")
	public IOSElement checkConfigurationDeNotifications;
	
	public void clickOnNotificationsIosFunction(){
		clickOnNotificationsIos.click();
	 }
	public void clickOnNotificationsSettingsIosFunction(){
		clickOnNotificationsSettingsIos.click();
	 }
	public void clickOnNotificationsSaveIosFunction(){
		clickOnNotificationsSaveIos.click();
	}
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void checkNotificationsIconTextFunction() throws IOException{
		d=data.getData("Notifications");
		Assert.assertEquals(d.get(1), checkNotificationsIconText.getText());
//		Assert.assertEquals(prop.getProperty("Notifications"), checkNotificationsIconText.getText());
		test = extent.createTest("check Notifications Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Notifications Icon Text is "+checkNotificationsIconText.getText(), ExtentColor.GREEN));
	}
	public void checkNotificationsHeaderTextFunction() throws IOException{
		d=data.getData("Notifications");
		Assert.assertEquals(d.get(2), checkNotificationsHeaderText.getText());
//		Assert.assertEquals(prop.getProperty("HeaderNotification"), checkNotificationsHeaderText.getText());
		test = extent.createTest("check Notifications Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Notifications Header Text is "+checkNotificationsHeaderText.getText(), ExtentColor.GREEN));
	}
	public void checkConfigurationDeNotificationsFunction() throws IOException{
		d=data.getData("Notifications");
		Assert.assertEquals(d.get(3), checkConfigurationDeNotifications.getText());
//		Assert.assertEquals(prop.getProperty("NotificationsSettingsHeader"), checkConfigurationDeNotifications.getText());
		test = extent.createTest("check Configuration De Notifications Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Configuration De Notifications is "+checkConfigurationDeNotifications.getText(), ExtentColor.GREEN));
	}
}
