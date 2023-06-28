package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mvnrepository.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		/*package hwWebdriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoBanking {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();  //invoke browser

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");

		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");

		WebElement user = driver.findElement(By.name("username"));
		
		

		user.sendKeys("amit123");

		WebElement pwd = driver.findElement(By.name("password"));

		pwd.sendKeys("123456789");

		 driver.findElement(By.linkText("Register")).click();
		 
		 driver.navigate().back();
		 
		 driver.findElement(By.partialLinkText("Forgot")).click();
		 
		 WebElement pgmsg1 = driver.findElement(By.tagName("h2"));
			String em1 = pgmsg1.getText();
			System.out.println("h2 Tag Lable: "+em1);
			
			int linksize = driver.findElements(By.tagName("a")).size();
			
			System.out.println("a Tag Size : "+linksize);

		//driver.findElement(By.cssSelector(
			//	"div:nth-child(1) div:nth-child(2) form:nth-child(1) div.login:nth-child(5) > input.button")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		String pgtitle2 = driver.getTitle();

		System.out.println("Pg Title After 1st Login :" + pgtitle2);

		WebElement pgmsg = driver.findElement(By.tagName("h1"));
		String em = pgmsg.getText();

		System.out.println("Page Message : " + em);

		if (pgtitle2.equals("ParaBank | Error")) {
			driver.findElement(By.partialLinkText("Regist")).click();

					driver.findElement(By.id("customer.firstName")).sendKeys("Amit");
					driver.findElement(By.name("customer.lastName")).sendKeys("Kadam");
					driver.findElement(By.id("customer.address.street")).sendKeys("Kutla Tri Road");
					driver.findElement(By.name("customer.address.city")).sendKeys("Pune");
					driver.findElement(By.id("customer.address.state")).sendKeys("MH");
					driver.findElement(By.name("customer.address.zipCode")).sendKeys("112233");
					driver.findElement(By.id("customer.phoneNumber")).sendKeys("9898989898");
					driver.findElement(By.name("customer.ssn")).sendKeys("214298");
					driver.findElement(By.id("customer.username")).sendKeys("amit999");
					driver.findElement(By.name("customer.password")).sendKeys("0000000");
					driver.findElement(By.id("repeatedPassword")).sendKeys("0000000");

					driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).click();
			System.out.println("REGISTER TO LOGIN");

		} else {

			driver.get("https://parabank.parasoft.com/parabank/index.htm");
			System.out.println("WELCOME TO HOMEPAGE");

		}

	}

}*/
		

	}

}
