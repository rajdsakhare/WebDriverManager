package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicsMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();							//maximize window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit wait
		
		
		driver.get("https://www.google.com/");	//launch url
		
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");  //nevigate another url
		Thread.sleep(1000);			
		
		driver.navigate().back();				// back privious url
		Thread.sleep(1000);
		
		driver.navigate().forward();			// forward privious url
		Thread.sleep(1000);
		
		String url=driver.getCurrentUrl();		//get current url 
		System.out.println("Current Url is: "+url);
		
		String tit=driver.getTitle();			//get current title of page
		System.out.println("Title of page: "+tit);
		
		WebElement ele1=driver.findElement(By.tagName("h2")); 		//get text   : it use for get inner text
		System.out.println("Test is :"+ele1.getText());
		
		WebElement atr=driver.findElement(By.name("username"));
		System.out.println("Attribute is :"+atr.getAttribute("name"));  //get Attribute   : it use for get value of attribute
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='footerPanel']//a"));		// size of elements
		System.out.println("Size is :"+list.size());
		
		for(WebElement el:list)
		{
			System.out.println(el.getText()+",");       //List of Elements text
		}
		
		
		
		//String ps=driver.getPageSource();
		//System.out.println("Source code of current page :"+ps);		// Source code
		
		
		
		
		
		
		
		
		
		//driver.close();
		
		

	}

}
