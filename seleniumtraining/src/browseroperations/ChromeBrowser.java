package browseroperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static void main(String[] args) {
		
	
    String path1="D:\\javaworkplace\\seleniumtraining\\execute\\chromedriver.exe";
    String path2=".\\execute\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",path2);
    ChromeDriver cdriver=new ChromeDriver();
}
}