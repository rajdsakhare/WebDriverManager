package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='box106']"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(drag, drop).perform();
		
		
	}

}

/*driver.get("https://demoqa.com/browser-windows");

driver.findElement(By.xpath("//button[@id='tabButton']")).click(); //..click to open new window

String parentHandle=driver.getWindowHandle(); //....current window

Set<String> AllWindows = driver.getWindowHandles(); //....set of window

for(String actual: AllWindows ) {
	if(!actual.equalsIgnoreCase(parentHandle)) {
		driver.switchTo().window(actual);
		//Thread.sleep(8000);
	}
}
driver.switchTo().window(parentHandle);*/


/* driver.get("https://demoqa.com/browser-windows");
		// Opens a new tab and switches to new tab
		driver.switchTo().newWindow(WindowType.TAB);

		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);*/