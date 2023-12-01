package waitspractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExplicitlyWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://empirehome.myprojectsonline.co.in/");
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='example@gmail.com']"));
		
		username.sendKeys("sureshbabuemp@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pword']"));
		
		password.sendKeys("ZPMHQHIA");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn green_btn']"));
		
		loginButton.click();
				
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
		System.out.println(driver.getCurrentUrl());

	}

}
