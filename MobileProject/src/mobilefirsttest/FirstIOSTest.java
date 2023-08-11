package mobilefirsttest;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.ios.IOSDriver;

public class FirstIOSTest {
	
	public static IOSDriver appiumDriver;

	public static void main(String[] args) throws MalformedURLException {
		String Username="thivyanagammaip_iXsOYv";
		String Password="EkQqsf4VzjcqPWU4tBuY";

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("os_version","12");
		cap.setCapability("device","iPhone 7");
		
		cap.setCapability("app","bs://ac8f507efc691afe3287d88c882ccb5f95dd150b");
		//wikipedia app link

		cap.setCapability("project","ios Automation");
		cap.setCapability("build","Build IOS 1.1");
		cap.setCapability("name","IOS App Test");

		String URL="https://"+ Username +":"+ Password +"@hub-cloud.browserstack.com/wd/hub";
		appiumDriver=new IOSDriver(new URL(URL),cap);
		appiumDriver.findElementByAccessibilityId("Text Button").click();
		String input="IOS TEST";
		appiumDriver.findElementByAccessibilityId("Text Input").sendKeys(input);
		appiumDriver.findElementByAccessibilityId("Return").click();
		WebDriverWait wait=new WebDriverWait(appiumDriver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeStaticText[@name=\"Text Output\"]")));
		String output=appiumDriver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Text Output\"]").getAttribute("value");
		assertEquals(input,output);
		appiumDriver.quit();
	}
	
	
}
