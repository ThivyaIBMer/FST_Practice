package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BlogPage {

	WebDriver driver;

	@Given("user is in blog page")
	public void navigateSearchPage() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	@When("user enters data in the search field")
	public void enterProduct() {
		driver.findElement(By.name("q")).sendKeys("Hello");
	}
	@Then("data should appear in the search field")
	public void verifyProduct() {
		assertEquals("Hello",driver.findElement(By.name("q")).getAttribute("value"));
		driver.quit();
	}

	@Given("test multiple scenatio case1")
	public void test_multiple_scenatio_case1() {

		System.out.println("Smoke Test one executed");
	}

	@Given("test multiple scenatio case2")
	public void test_multiple_scenatio_case2() {
		System.out.println("Smoke Test two executed");
	}
	@Given("user is in login page")
	public void bg_Test() {
		System.out.println("background");
	}


}
