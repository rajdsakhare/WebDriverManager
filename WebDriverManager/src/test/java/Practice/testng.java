package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testng {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		System.out.println("I am In");
		String actTitle = driver.getTitle();

		System.out.println(actTitle);
//		Assert.assertEquals(actTitle,"Google");
//		Assert.assertEquals("ABC","ABC");
//
//		Assert.assertTrue(true);
//		Assert.assertFalse(false);
	//	Assert.assertFalse(false);
		System.out.println("End of script");
		
		driver.close();

	}

}
