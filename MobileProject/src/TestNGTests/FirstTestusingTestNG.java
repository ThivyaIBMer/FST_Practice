package TestNGTests;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FirstTestusingTestNG {

	public static AndroidDriver appiumDriver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		String Username="thivyanagammaip_iXsOYv";
		String Password="EkQqsf4VzjcqPWU4tBuY";

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("os_version","9.0");
		cap.setCapability("device","Google Pixel 3");

		cap.setCapability("app", "bs://1cca2d133023adc6c898156a92fe615d8b109f47");
		cap.setCapability("project","MobileTesting-IBM");
		cap.setCapability("build","Build 1.0");
		cap.setCapability("name","Wikipedia sample App Test");

		String URL="https://"+ Username +":"+ Password +"@hub-cloud.browserstack.com/wd/hub";
		appiumDriver=new AndroidDriver(new URL(URL),cap);
	}

	@Test
	public void test1() {
		MobileElement wikiSearch=(MobileElement) appiumDriver.findElement(By.xpath("//android.view.ViewGroup/android.widget.FrameLayout/android.view.View"));
		wikiSearch.click();
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Browser Stack");
		WebDriverWait wait=new WebDriverWait(appiumDriver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("org.wikipedia.alpha:id/search_close_btn")));
		String val=appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).getText();
		System.out.println("Entered Text is : "+val);
		assertEquals("Browser Stack",val);
//		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_close_btn")).click();
//		String val2=appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).getText();
//		System.out.println("Entered Text is : "+val2);
//		assertEquals("Search�",val2);
	}
	
	@Test
	public void test2() {
		appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_close_btn")).click();
		String val2=appiumDriver.findElement(By.id("org.wikipedia.alpha:id/search_src_text")).getText();
		System.out.println("Entered Text is : "+val2);
		assertEquals("Search�",val2);
	}

	@AfterClass
	public void tearDown() {
		appiumDriver.quit();

	}


}
