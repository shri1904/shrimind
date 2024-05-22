package practiceselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstchrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));

		WebElement userPassword=driver.findElement(By.xpath("//input[@id='password']"));

		WebElement loginButton=driver.findElement(By.id("login-button"));
		
	

		userName.click();

		userName.sendKeys("standard_user");

		userPassword.click();

		userPassword.sendKeys("secret_sauce");

		loginButton.click();
		
		WebElement Addtocart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		
		Addtocart.click();
		
		WebElement ClickonCart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		
		ClickonCart.click();
		
		

	}

}
