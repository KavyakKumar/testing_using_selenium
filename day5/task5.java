package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task5 {
	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","c://Driver/chromedriver.exe" );

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		System.out.println("\n"+driver.getTitle());https://www.google.com
		driver.switchTo().newWindow(WindowType.TAB);	
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
		System.out.println("\n"+driver.getTitle());https://www.google.com
			driver.switchTo().newWindow(WindowType.TAB);	
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("cucumber");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
