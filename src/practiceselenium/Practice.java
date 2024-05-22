package practiceselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "F:\\New folder\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));

		WebElement userPassword=driver.findElement(By.xpath("//input[@name='password']"));

		WebElement loginButton=driver.findElement(By.xpath("//input[@type='submit']"));
		
		
        userName.click();

		userName.sendKeys("john");

		userPassword.click();

		userPassword.sendKeys("demo");

		loginButton.click();
		
		WebElement TextAccount=driver.findElement(By.xpath("//*[text()='Accounts Overview']"));
		
	    TextAccount.click();
	    
	    WebElement OpenNewAccount=driver.findElement(By.xpath("//*[text()='Open New Account']"));
	    
	    OpenNewAccount.click();
	    
	    WebElement TranferFunds=driver.findElement(By.linkText("Transfer Funds"));
	    
	    TranferFunds.click();
	    
	   /* WebElement Amount=driver.findElement(By.xpath("//input[@id='amount']"));
	    
	    WebElement Transfer=driver.findElement(By.xpath("//input[@value='Transfer']"));
	    
	    Amount.click();
	    
	    Amount.sendKeys("3000");
	    
	    
	    Select s2=new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
	    
        List<WebElement> List = s2.getOptions();
	    
	    System.out.println("The dropdown options are:");
        for(WebElement element: List)
            System.out.println(element.getText());
        System.out.println("Select the Option by value 12345");
        s2.selectByValue("12345");
        System.out.println("Select value is: " + s2.getFirstSelectedOption().getText());
	    
        Select s3=new Select(driver.findElement(By.xpath("//select[@id='toAccountId']")));
	    
        List<WebElement> List1 = s3.getOptions();
	    
	    System.out.println("The dropdown options are:");
        for(WebElement element: List1)
            System.out.println(element.getText());
        System.out.println("Select the Option by value 12456");
        s3.selectByValue("12456");
        System.out.println("Select value is: " + s3.getFirstSelectedOption().getText());
	    
	    Transfer.click();*/
	    
	    WebElement BillPay=driver.findElement(By.linkText("Bill Pay"));
	    
	    BillPay.click();
	    
	    WebElement payeename=driver.findElement(By.xpath("//input[@ng-model='payee.name']"));
	    
	    payeename.click();
	    
	    payeename.sendKeys("shrinath");
	    
	    WebElement addressstreet=driver.findElement(By.xpath("//input[@ng-model='payee.address.street']"));
	    
	    addressstreet.click();
	    
	    addressstreet.sendKeys("At post daund");
	    
	    WebElement city=driver.findElement(By.xpath("//input[@ng-model='payee.address.city']"));
	    
	    city.click();
	    
	    city.sendKeys("Pune");
	    
	    WebElement state=driver.findElement(By.xpath("//input[@ng-model='payee.address.state']"));
	    
	    state.click();
	    
	    state.sendKeys("Mah");
	    
	    WebElement zipcode=driver.findElement(By.xpath("//input[@ng-model='payee.address.zipCode']"));
	    
	    zipcode.click();
	    
	    zipcode.sendKeys("413801");
	    
	    WebElement phonenumber=driver.findElement(By.xpath("//input[@ng-model='payee.phoneNumber']"));
	    
	    phonenumber.click();
	    
	    phonenumber.sendKeys("8983513039");
	    
	    WebElement payeeaccountno=driver.findElement(By.xpath("//input[@ng-model='payee.accountNumber']"));
	    
	    payeeaccountno.click();
	    
	    payeeaccountno.sendKeys("13345");
	    
	    WebElement verifyaccount=driver.findElement(By.xpath("//input[@ng-model='verifyAccount']"));
	    
	    verifyaccount.click();
	    
	    verifyaccount.sendKeys("13345");
	    
	    WebElement amount=driver.findElement(By.xpath("//input[@ng-model='amount']"));
	    
	    amount.click();
	    
	    amount.sendKeys("5000");
	    
	    
	    Select s4= new Select(driver.findElement(By.xpath("//select[@name='fromAccountId']")));
	    
	    List<WebElement> List2 = s4.getOptions();
	    
	    System.out.println("The dropdown options are:");
        for(WebElement element: List2)
            System.out.println(element.getText());
        System.out.println("Select the Option by value 13344");
        s4.selectByValue("13344");
        System.out.println("Select value is: " + s4.getFirstSelectedOption().getText());
	    
	    
	    WebElement sendpayment=driver.findElement(By.xpath("//input[@value='Send Payment']"));
	 
	    sendpayment.click();
	    
	   /* WebElement Logout=driver.findElement(By.linkText("Log Out"));
	    
	    Logout.click();*/
        
	  
	    
	  /*  WebElement SelectInput=driver.findElement(By.xpath(" //select[@id='type']"));
	    
	    Select s= new Select(driver.findElement(By.xpath("//select[@id='type']")));
	    
	    
	  List <WebElement> list = s.getOptions();
	    for (WebElement element: list)
	    {
	    	System.out.println(element.getText());
	    
	    }
	    
	   // s.selectByIndex(0);
	    s.selectByVisibleText("saving");
	    s.selectByValue("1");
	    
	    Transfer Funds
	    
	    /*WebElement FromAccountId=driver.findElement(By.xpath ("//select[@id='fromAccountId']"));
	    		
	    Select s1= new Select(driver.findElement(By.xpath("//select[@id='fromAccountId']")));
	   
	    List <WebElement> List= s1.getOptions();
	    for(WebElement element: list)*/
	
	    	
	}
}
