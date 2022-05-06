package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFaceboo {

	public static void main(String[] args) {
		String path1="D:\\javaworkplace\\seleniumtraining\\execute\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path1);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.getTitle();
		if(driver.getTitle().equals("Google")) {
			System.out.println("Google search page opened successfully...");
		}else {
			System.out.println("Either google search page not opened or its title got changed");
			driver.close();
		}
	}

}
