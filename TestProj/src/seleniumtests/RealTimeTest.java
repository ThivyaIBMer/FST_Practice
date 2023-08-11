package seleniumtests;

import java.text.DecimalFormat;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RealTimeTest {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println("Title is " +driver.getTitle());

		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		if(driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).isDisplayed()) {
			System.out.println("Search passed");
			driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).click();
		}
		else {
			System.out.println("search Failed");
		}
		String qty="2";
		String price=driver.findElement(By.xpath("//h1[contains(text(),'iPhone')]/parent::div/ul[2]//h2")).getText();
		String priceSplit=price.replace("$", "");
		System.out.println("Price of single Item is "+priceSplit);
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys(qty);
		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cart-total")).click();
		//		String totalPrice=driver.findElement(By.id("cart-total")).getText();
		//
		//
		//
		//		float total=Float.valueOf(qty)*Float.valueOf(priceSplit);
		//		System.out.println(String.format("%.2f", total));
		//
		//
		//		String actualPrice[]=totalPrice.split("-",2);
		//		String[] tune=actualPrice[1].trim().split("\\$");
		//		if(total==Float.valueOf(tune[1])) {
		//			System.out.println("Price are equal");
		//		}
		driver.findElement(By.xpath("//strong[text()='View Cart']")).click();
		String product=	driver.findElement(By.xpath("//div[@id='content']//a[text()='iPhone']")).getText();
		System.out.println("Product is: "+product);
		String quantity=	driver.findElement(By.xpath("//div[@class='table-responsive']//input[@type='text']")).getAttribute("value");
		System.out.println("Quantity is: "+quantity);

		String PriceAmount =	driver.findElement(By.xpath("//div[@class='table-responsive']//tbody/tr[1]/td[6]")).getText();
		System.out.println("Price is: "+PriceAmount);

		//Thread.sleep(7000);
		driver.close();
	}

}
