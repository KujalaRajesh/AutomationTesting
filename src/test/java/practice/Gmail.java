package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?hl=en-gb&ifkv=ASKXGp3rD43lmGDl7IL0AwoFBBBiBEcQP5xzCFiZnK2gNNRAqj5NYE5hCzsdZk53rFW9ROdRgwWmeg&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-737839864%3A1701403974593310&theme=glif");
		
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
		
		username.sendKeys("krkmarolix@gmail.com");
		
		WebElement NextButton = driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"));
		
		NextButton.click();
		
		
		
		
	}

}
