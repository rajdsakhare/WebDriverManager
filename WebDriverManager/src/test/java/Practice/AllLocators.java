package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLocators {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//By xpath
		
		driver.findElement(By.xpath("//input[@class='input']")).sendKeys("Raju@123");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Raju@123");//class
		
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//input[@value='Log In']"));
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/p[2]/a[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Raj");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("Sakhare");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("karve nagar");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Pune");
		driver.findElement(By.xpath(" //input[@id='customer.address.state']")).sendKeys("MH");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("12345");
		driver.findElement(By.xpath(" //input[@id='customer.phoneNumber']")).sendKeys("9876543210");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[8]/td[2]/input[1]")).sendKeys("999");
		
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("Raj@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[11]/td[2]/input[1]")).sendKeys("Raj@123");
	
		
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("Raj@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[13]/td[2]/input[1]")).click();
		
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//input[@class='input' and @name='username']")).click(); // xpath by using and
		
		driver.findElement(By.xpath("//input[@name='password' or @type='password']")).click();	//xpath by using or
		
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).click();			//xpath by using contains
		
		driver.findElement(By.xpath("//input[starts-with(@type,'pass')]")).click();				//xpath by using starts-with
		
		driver.findElement(By.xpath("//form[@name='login']//input[@class='button']")).click();	//xpath by chaining  "//parent xpath//child xpath"    
		
		driver.findElement(By.xpath("//a[text()='home']")).click();		//xpath by text()
		
		
		  
		
		
		
		
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
