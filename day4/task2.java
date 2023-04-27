package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class task2 {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","c://Driver/chromedriver.exe" );
	    ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        WebElement fname=driver.findElement(By.id("input-firstname"));
        fname.sendKeys("Kavya");
        WebElement lname=driver.findElement(By.id("input-lastname"));
        lname.sendKeys("Kumar");
        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("krish2023krish@gmail.com");
        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123456");
        JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(3000);
        WebElement subscribe = driver.findElement(By.id("input-newsletter-yes"));
		subscribe.click();
		
        
        
        
	}

}