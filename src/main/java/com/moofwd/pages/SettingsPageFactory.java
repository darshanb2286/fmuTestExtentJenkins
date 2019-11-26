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

public class SettingsPageFactory extends TestBase{
	AppiumDriver<IOSElement> iosDriver;
	dataDriven data=new dataDriven();
	ArrayList d;
	public SettingsPageFactory(AppiumDriver<IOSElement> iosDriver) {
		this.iosDriver = iosDriver;
		PageFactory.initElements(new AppiumFieldDecorator(iosDriver), this);
	}
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='dash setttings icon']")
	IOSElement clickOnSettingsIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Notificações']")
	IOSElement clickOnSettingsNotificationIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Avisos']")
	IOSElement clickOnSettingsNotificationAvisosIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Eventos']")
	IOSElement clickOnSettingsNotificationEventosIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Mensagens']")
	IOSElement clickOnSettingsNotificationMensajensIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Surveys']")
	IOSElement clickOnSettingsNotificationSurveysIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='Salve']")
	IOSElement clickOnSettingsNotificationSalveIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Sobre nós']")
	IOSElement clickOnSobreNosIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name='Politica de Privacidade']")
	IOSElement clickOnPoliticaDePrivacidadIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='headerBackBtn']")
	public IOSElement clickOnBackButtonIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeButton[@name='SAIR']")
	IOSElement clickOnSettingsLogOutIos;
	
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Configurações\"]")
	public IOSElement checkSettingsIconText;
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[@name=\"AJUSTES\"]")
	public IOSElement checkSettingsHeaderText;
	
	public void clickOnSettingsIosFunction(){
		clickOnSettingsIos.click();
	 }
	public void clickOnSettingsNotificationIosFunction(){
		clickOnSettingsNotificationIos.click();
	 }
	public void clickOnSettingsNotificationAvisosIosFunction(){
//		clickOnSettingsNotificationAvisosIos.click();
		
		
		try{
			System.out.println("clickOnSettingsNotificationAvisosIos :: ");
			clickOnSettingsNotificationAvisosIos.click();
			System.out.println("After click on clickOnSettingsNotificationAvisosIos :: ");
			}
		catch(Exception e){
			System.out.println("clickOnSettingsNotificationAvisosIos :: clickOnBackButtonIos ");
			clickOnBackButtonIos.click();
			System.out.println("After click on clickOnSettingsNotificationAvisosIos :: clickOnBackButtonIos ");
			}
	 }
	public void clickOnSettingsNotificationEventosIosFunction(){
		clickOnSettingsNotificationEventosIos.click();
	 }
	public void clickOnSettingsNotificationMensajensIosFunction(){
		clickOnSettingsNotificationMensajensIos.click();
	 }
	public void clickOnSettingsNotificationSurveysIosFunction(){
		try{
			System.out.println("clickOnSettingsNotificationSurveysIos :: ");
			clickOnSettingsNotificationSurveysIos.click();
			System.out.println("After click on clickOnSettingsNotificationSurveysIos :: ");
			}
		catch(Exception e){
			System.out.println("clickOnSettingsNotificationSurveysIos :: clickOnBackButtonIos ");
			clickOnBackButtonIos.click();
			System.out.println("After click on clickOnSettingsNotificationSurveysIos :: clickOnBackButtonIos ");
			}
//		if(clickOnSettingsNotificationSurveysIos.isEnabled()==false){
//			clickOnBackButtonIos.click();
//		}
	 }
	public void clickOnSettingsNotificationSalveIosFunction(){
		clickOnSettingsNotificationSalveIos.click();
	 }
	public void clickOnSobreNosIosFunction(){
		clickOnSobreNosIos.click();
	 }
	public void clickOnPoliticaDePrivacidadIosFunction(){
		clickOnPoliticaDePrivacidadIos.click();
	 }
	public void clickOnBackButtonIosFunction(){
		clickOnBackButtonIos.click();
	}
	public void clickOnSettingsLogOutIosFunction(){
		clickOnSettingsLogOutIos.click();
	}
	public void checkSettingsIconTextFunction() throws IOException{
		d=data.getData("Settings");
		Assert.assertEquals(d.get(1), checkSettingsIconText.getText());
//		Assert.assertEquals(prop.getProperty("Settings"), checkSettingsIconText.getText());
		test = extent.createTest("check Settings Icon Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Settings Icon Text is "+checkSettingsIconText.getText(), ExtentColor.GREEN));
	}
	public void checkSettingsHeaderTextFunction() throws IOException{
		d=data.getData("Settings");
//		Assert.assertEquals(prop.getProperty("HeaderSettings"), checkSettingsHeaderText.getText());
		Assert.assertEquals(d.get(2), checkSettingsHeaderText.getText());
		test = extent.createTest("check Settings Header Text");
		test.log(Status.INFO, MarkupHelper.createLabel("check Settings Header Text is "+checkSettingsHeaderText.getText(), ExtentColor.GREEN));
	}
}
