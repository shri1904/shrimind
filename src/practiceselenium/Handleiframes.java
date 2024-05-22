package practiceselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;





public class Handleiframes {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "F:\\New folder\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Driver.Findelement(By.xpath("")

	}

}
