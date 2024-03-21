package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page.Fblogin;
public class Fbtestlogin
{
	WebDriver driver;
@BeforeTest
public void setUp()
{
	driver = new ChromeDriver();
	driver.get("https://facebook.com");
}
@Test
public void testlogin()
	{
		Fblogin ob=new Fblogin(driver);
		ob.setvalues("swa@gmail.com","swa@123");
		ob.login();
		
	}
}
