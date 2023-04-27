package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task1 {
public static void main(String[] args) {
//	WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","c://Driver/chromedriver.exe" );

	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origin=*");
	WebDriver driver=new ChromeDriver(co);
	driver.get("https://www.google.co.in/");
}
}
