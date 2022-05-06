package day2.locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemositeAutomation {

	public static void main(String[] args) {
		String driverPath ="D:\\javaworkplace\\seleniumtraining\\execute\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverPath);

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demosite.executeautomation.com/login.html");
		driver.findElement(By.id("username")).sendKeys("execution");

	    driver.findElement(By.name("pwd")).sendKeys("admin");

		WebElement loginButton=driver.findElement(By.cssSelector("input[value='Login']"));
		//perform click operation
		loginButton.click();
		//explicit wait
		
		//logout link
		WebElement logoutLink=driver.findElement(By.cssSelector("a[href='Login.html']"));
		logoutLink.click();
		

	}

}
