package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
//		WebElement singclick = driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']"));
//		
//		singclick.click();
//		
//		WebElement username = driver.findElement(By.xpath("//input[@id='ap_email']"));
//				
//		username.sendKeys("+918143203961");
//		
//		WebElement ContinueButton = driver.findElement(By.xpath("//input[@id='continue']"));
//		
//		ContinueButton.click();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15pro max");
//		SearchBar.sendKeys("sony headphones"); 
	 	
	 	WebElement SearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	 	SearchButton.click();
	 	
	 	JavascriptExecutor js = (JavascriptExecutor) driver;
	 	js.executeScript("window.scrollBy(0,2000)");
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	
	 	driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][normalize-space()='Apple iPhone 15 Pro Max (1 TB) - Black Titanium']")).click();
//	 	Iphone.click();
	 	
	 	
		
		
	}

}
