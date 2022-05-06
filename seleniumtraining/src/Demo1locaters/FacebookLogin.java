package Demo1locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.id("email")).sendKeys("9975432457");
	driver.findElement(By.id("pass")).sendKeys("Kanchan123@$&");
	driver.findElement(By.id("loginbutton")).click();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//driver.quit();
	

	}

	
		
		
	

}
