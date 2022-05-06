package browseroperations;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver {

	public static void main(String[] args) {
		String path1="D:\\javaworkplace\\seleniumtraining\\execute\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",path1);
		FirefoxDriver cdrive= new FirefoxDriver();

	}

}
