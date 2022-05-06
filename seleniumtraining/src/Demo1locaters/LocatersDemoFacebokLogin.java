package Demo1locaters;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatersDemoFacebokLogin {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.name("username")).sendKeys("kajal_0520");
    driver.findElement(By.name("password")).sendKeys("05062000");
    driver.findElement(By.xpath("//button[@type = 'submit']")).click();
    
	}

}
