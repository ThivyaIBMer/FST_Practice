package seleniumtests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDrivertest {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println("Title is " +driver.getTitle());
		findAgebasedonName("Praveen");
		//		driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("IBMTraining");
		//		Select select=new Select(driver.findElement(By.xpath("//select[@id='drop1']")));
		//		select.selectByVisibleText("doc 3");
		//		driver.findElement(By.xpath("//input[@id='radio2']")).click();
		//		driver.findElement(By.id("checkbox1")).click();
		//		driver.findElement(By.id("checkbox2")).click();
		//		driver.findElement(By.id("but2")).click();


		//		driver.findElement(By.id("alert1")).click();
		//		Alert alert=driver.switchTo().alert();
		//		System.out.println("Alert is "+alert.getText());
		//		alert.accept();


		//		Actions action=new Actions(driver);
		//		action.moveToElement(driver.findElement(By.xpath("//span[@id='blogsmenu']"))).build().perform();
		//		action.click(driver.findElement(By.xpath("//span[contains(text(),'Selenium143')]"))).perform();
		//		action.doubleClick(driver.findElement(By.xpath("//button[contains(text(),' Double')]"))).perform();
		//		
		//		Alert alert1=driver.switchTo().alert();
		//		System.out.println("Alert is "+alert1.getText());
		//		alert1.accept();

//		List<WebElement> tableRows=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
//		System.out.println("Number of rows are  "+tableRows.size());
//
//
//
//		
//		boolean found=false;
//		for(int i=1;i<=tableRows.size();i++) {
//			
//			
//
//			List<WebElement> tableColumns=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td"));
//			for(int j=0;j<tableColumns.size();j++) {
//
//				if(tableColumns.get(j).getText().equals("Praveen")) {
//					System.out.println(tableColumns.get(j+1).getText());
//					found=true;
//					break;
//					
//				}
//			}
//			if(found)
//				break;
//			
//
//		}
//		
		


		driver.close();

	}
	public static void findAgebasedonName(String name) {
        List<WebElement> trs = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        boolean found=false;    
        for (int i = 1; i <= trs.size(); i++) {
            List<WebElement> tds = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td"));
            for (int j = 0; j < tds.size(); j++) {
                if(tds.get(j).getText().equals(name)) {
                    System.out.println(tds.get(j+1).getText());
                    found=true;
                    break;
                }
            }
            if(found) {
                break;
            }
        }
    }

}
