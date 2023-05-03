package q1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cc1q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		    ChromeOptions co=new ChromeOptions();
		    Thread.sleep(7000);
			co.addArguments ("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup ();
			WebDriver driver=new ChromeDriver();
			driver.get ("https://www.saucedemo.com/");
			driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
			String initial = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
			driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
			String cart =  driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
			if(cart.equals(initial)) {
				
			}
			else {
				
			}
			String check_cart = driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).getText();
			if(check_cart.equals("Continue Shopping...")) {
				
			}
			else {
				
			}
			driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
			String checkout = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
			if(checkout.equals("Checkout: Your Information")) {
				
			}
			else {
				
			}
			driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("ABC");
			driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("DEF");
			driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
			String product_name = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText(); 
			String product_price = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
			if(product_name.equals(cart)) {
				System.out.println("Product Name: "+product_name);
				System.out.println("Product price: "+product_price);
			}
			else {
				System.out.println(cart);
				System.out.println(product_name);
			}
			String title = driver.getTitle();
			if(title.equals("Swag Labs")) {
				System.out.println("Title matched");
			}
			else {
				System.out.println("title mismatched");
			}
			if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html")) {
				System.out.println("URL matched...!");
			}
			else {
				System.out.println("URL MisMatched");

	}
			
	}
	
//	Thread.sleep(3000);
}
