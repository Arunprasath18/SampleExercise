package selinumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleselinium {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("name")).sendKeys("Arun");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("arunprasath12@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9546723864");
		driver.findElement(By.id("textarea")).sendKeys("Tamilnadu, India");
		driver.findElement(By.xpath("//input[@id='male']")).click();
		driver.findElement(By.xpath("//input[@id='friday']")).click();
		driver.close();		
	}

}
