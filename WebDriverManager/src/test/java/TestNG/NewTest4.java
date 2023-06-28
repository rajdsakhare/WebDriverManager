package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest4 {
  @Test
  public void f() {
	  System.out.println("Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BM");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AM");
  }

}
