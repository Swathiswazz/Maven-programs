package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Page.Rishiherbalpage;
public class Rishiherbaltest 
{

	WebDriver driver;
@BeforeTest
public void setUp()
{
	driver = new ChromeDriver();
	driver.get("https://rishiherbalindia.linker.store/");
}
@Test
public void testlogin()
	{
		Rishiherbalpage ob=new Rishiherbalpage(driver);
		ob.herbal();
		
	}
}

